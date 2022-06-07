import Model.Students;
import netscape.javascript.JSObject;
import network.ConnectURL;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class JsonAPI {
    public static void main(String[] args) throws IOException {
        String NIM;
        String Name;
        String Address;
        String Phone;

        ArrayList<Students> _studentsTI= new ArrayList<>();
        try{
            Students s=new Students();
            Scanner _input=new Scanner(System.in);
            System.out.println("Masukkan NIM : ");
            NIM=_input.nextLine();
            System.out.println("Masukkan Nama : ");
            Name=_input.nextLine();
            System.out.println("Masukkan Alamat : ");
            Address=_input.nextLine();
            System.out.println("Masukkan Phone : ");
            Phone=_input.nextLine();
            s.set_nim(NIM);
            s.set_name(Name);
            s.set_address(Address);
            s.set_phone(Phone);
            _studentsTI.add(s);
        } catch (Exception e){
            e.printStackTrace();
        }
        for (int j=0;j<_studentsTI.size();j++){
            System.out.println(_studentsTI.get(j).get_nim()+ " - " +_studentsTI.get(j).get_name()+ " - "+
                    _studentsTI.get(j).get_address()+ " - " +_studentsTI.get(j).get_phone()+ " - ");
        }

//       mengubah arraylist dengan json
        JSONArray jsonStudent= new JSONArray();
        JSONObject myJObject= new JSONObject();
        myJObject.put("nim",_studentsTI.get(0).get_nim());
        myJObject.put("name",_studentsTI.get(0).get_name());
        myJObject.put("address",_studentsTI.get(0).get_address());
        myJObject.put("phone",_studentsTI.get(0).get_phone());
        jsonStudent.put(myJObject);

        System.out.println(jsonStudent.toString());

//      mengirim json ke cloud
        ConnectURL myURLBuilder=new ConnectURL();
        URL myAddress =myURLBuilder.buildURL("https://harber.mimoapps.xyz/fromjava.php");
        myURLBuilder.postJSON(myAddress,jsonStudent.toString());
    }


}
