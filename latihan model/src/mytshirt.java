import model.tshirt;

public class mytshirt {
    public static void main(String[] args) {
//        tshirt[] baju = new tshirt[4];
//        baju[0] = new tshirt("A", "Panjang", "XL", "Hitam");
//        baju[1] = new tshirt("B", "Pendek", "L", "Merah");
//        baju[2] = new tshirt("C", "Panjang", "S", "Putih");
//        baju[3] = new tshirt("D", "Panjang", "M", "Navy");
//
//        for(int index=0;index< baju.length;index++){
//            baju[index].printtshirt();
        tshirt a= new tshirt("A","Panjang","XL","Hitam",true,false,25000,3000);
        a.produksi();
        tshirt b= new tshirt("B","Pendek","L","Putih",true,false,12000,2000);
        b.produksi();
        }
    }
