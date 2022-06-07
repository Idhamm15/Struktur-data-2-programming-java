import Model.Tshirt;
import jdk.swing.interop.SwingInterOpUtils;

public class Pabrik {
    public static void main(String[] args) {

        System.out.println("Merk A");
        Tshirt A = new Tshirt("Katun",true,false,
                27,3,"Hijau","B",12000,2000);

        A.Produksi();

        System.out.println("\n");

        System.out.println("Merk B");
        Tshirt B = new Tshirt("Katun",false, true,
                30,4,"Merah","A",14000,3000);
        B.Produksi();

        System.out.println("\n");

        System.out.println("Merk C");
        Tshirt C = new Tshirt("Katun",false,true,
                25,1,"Hitam","C",20000,2500);
        C.Produksi();

    }
}
