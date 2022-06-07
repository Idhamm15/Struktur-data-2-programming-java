import Model.CartContents;
import Model.Shopper;
import network.ConnectURL;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import static java.awt.GridBagConstraints.PAGE_END;

public class MainActivity extends JFrame {

    private int _screenWidth;
    private int _screenHeight;
    private CartContents _listCart = new CartContents();
    ArrayList<CartContents> ListCart = new ArrayList<>();
    DefaultListModel<String> modelList = new DefaultListModel<>();
    JList cartList = new JList();
    JPanel _cartPanel;

    public MainActivity() throws IOException {
        getScreenSize();
        setScreenShow();

    }

    private void getScreenSize() {
        Toolkit _toolkit = Toolkit.getDefaultToolkit();
        Dimension _dimension = _toolkit.getScreenSize();

        this._screenHeight = _dimension.height;
        this._screenWidth = _dimension.width;
    }

    private  void setScreenShow() throws IOException {
        this.setTitle ("Shopper");
        this.setSize (this._screenWidth, this._screenHeight);
        this.setLayout(null);
        setTopPanel();
        setStokPanel();
        setCartPanel();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setTopPanel() {
        JPanel _panelTop = new JPanel(new GridBagLayout());
        JLabel _labelTop = new JLabel();
        _labelTop.setText("Shopper. The best shopping apps..");
        Dimension _labelSize = _labelTop.getPreferredSize();

        _labelTop.setBounds (150, 100, _labelSize.width, _labelSize.height);
        _labelTop.setFont (new Font("serif", Font.PLAIN, 24));
        _panelTop.setBounds(10, 20, this._screenWidth - 28, 38);

        _panelTop.add(_labelTop);
        this.add(_panelTop);
    }

    private void setStokPanel() throws IOException {
        Border _borderMiddle = BorderFactory.createTitledBorder ("select products");
        JPanel _middlePanel = new JPanel ( new FlowLayout(FlowLayout.LEFT));
        _middlePanel.setBounds(10,70, this._screenWidth -200, -300);
        _middlePanel.setBorder (_borderMiddle);


        ArrayList<Shopper> _listItem = getProductsData();

        Border[] _borderProducts = new Border [_listItem.size()];
        ImageIcon[] imageIcons = new ImageIcon[_listItem.size()];
        JButton[] _addButton = new JButton[_listItem.size()];
        JLabel[] _labelPic = new JLabel[_listItem.size()];
        JPanel[] _productPanel = new JPanel[_listItem.size()];
        JPanel[] _panelforText = new JPanel[_listItem.size()];
        JTextField[] _qtyField = new JTextField[_listItem.size()];


        for(int index=0;index<_listItem.size();index++) {
            String fileName = _listItem.get(index).get_filename();
            _borderProducts[index] = BorderFactory.createTitledBorder( _listItem.get(index).get_pluName());

            _productPanel[index] = new JPanel(new BorderLayout());
            _productPanel[index].setBackground (Color.WHITE);
            _productPanel[index].setBorder(_borderProducts[index]);
            _labelPic[index] = new JLabel("<html>Code :" +
                    _listItem.get(index).get_pluCode() + "<br/>Name :" + _listItem
                    .get(index).get_pluName() + "<br/>Size :" +
                    _listItem.get(index).get_size()+"<br/> +" +
                    _listItem.get(index).get_description() +
                    "<br/>Price :" + _listItem.get(index).get_price() + "<br/>");

            String _PATH = "/home/idham/pictures/";

            imageIcons[index] new ImageIcon(_PATH + fileName); // load the image to a imageIcon
            Image image1 = imageIcons[index].getImage(); //ImageIcon.getImage(); //transform it

            Image newimg1 = image1.getScaledInstance (120,120, Image.SCALE_SMOOTH); //scale it the smooth way
            imageIcons[index] = new ImageIcon(newimg1); //transform it back
            _labelPic[index].setIcon(imageIcons[index]);
            _labelPic[index].setHorizontalTextPosition(JLabel.CENTER);
            _labelPic[index].setVerticalTextPosition(JLabel.BOTTOM);
            _labelPic[index].setBounds(10, 10,40,10);

            _panelforText[index]  = new JPanel (new FlowLayout(FlowLayout.LEFT));
            _qtyField[index] = new JTextField();
            _qtyField[index].setText("1");
            _qtyField[index].setPreferredSize(new Dimension(60,30));

            _addButton[index] = new JButton();
            _addButton[index].setText("Add to Cart");
            _addButton[index].setSize(new Dimension(100,30));

            int finalIndex = index;

            _addButton[index].addActionListener(e ->{

                CartContents myList = new CartContents();
                myList.setPluCode(_listItem.get(finalIndex).get_PluCode());
                myList.setPluName(_listItem.get(finalIndex).get_PluName());
                myList.setPluQty(Integer.parseInt(_qtyField[finalIndex].getText()));
                myList.setPluPrice(_listItem.get(finalIndex).get_price());

                listCart.add(myList);
                AddtoCart();
            });

            _panelforText[index].add(_qtyField[index]);
            _panelforText[index].add(_addButton[index]);
            _productPanel[index].add(_panelforText[index],BorderLayout,PAGE_END);
            _productPanel[index].add(_labelPic[index]);
            _middlePanel.add(_productPanel[index]);

        }
        this.add(_middlePanel);
    }
    public void AddtoCart(){
        cartList.setPrefferedSize(new Dimension(230,420));
        cartList.setBackground(Color.LIGHT_GRAY);

        cartList.removeALL();
        modelList.removeALLElements();
        for (int index=0; index<listCart.size(); index++) {
            modelList.addElements(lisyCart.get (index).getPluCode().toString()+" - " +listCart.get(index).getPluName()+" -"+ listCart.get(index).getPluQty())
        }
        cartList.setMeodel(modelList);
        cartList.setSelectedIndex(2);
        _cartPanel.add(cartList);
        _cartPanel.setVisible(true);
        this.add(_cartPanel);
        this.revalidate();

    }
    public void setCartPanel() {
        Border _borderCart = BorderFactory.createBevelBorder("Your Cart");
        _cartPanel = new JPanel (new FlowLayout(FlowLayout.LEFT));
        _cartPanel.setBounds(this._screenWidth-260,78,260, this._screenHeight - 300);
        _cartPanel.setBorder(_borderCart);
        this.add(_cartPanel);
    }

    private arrayList<Shopper> getProductsData() throws IOException {
        URL sMe = ConnectURL.buildURL("https://java-api.mimoapps.xyz/getproducts.php");
        String productResponseFromHttpUrl(sMe);
        assert productResponse != null;
        JSONArray productJSONArray = new JSONArray(productResponse);
        ArrayList<Shopper> productList = new ArrayList<>();
        for (int index = 0;index<productsJSONArray.length();index++) {
            Shopper productsModel = new Shopper();
            JSONObject myJSONObject = productJSONArray.getJSONObject(index);


            productsModel.set_pluCode(myJSONObject.getString("Plucode"));
            productsModel.set_pluName(myJSONObject.getString("Plunname"));
            productsModel.set_size(myJSONObject.getString("Plusize"));
            productsModel.set_price(myJSONObject.getInt("Pluprice"));
            productsModel.set_description(myJSONObject.getString("Pludesc"));
            productsModel.set_filename(myJSONObject.getString("Filename"));

            productList.add(productsModel);
        }
        return productList;
    }

    public static void main(String[] args) {throw IOException {
            MainActivity s = new MainActivity();
        }
    }

}
