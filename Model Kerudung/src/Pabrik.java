import Model.Kerudung;
import jdk.swing.interop.SwingInterOpUtils;

public class Pabrik {
    public static void main(String[] args) {

        Kerudung A = new Kerudung("Sari", "Hitam", "Xl",true, 30000, 5000);
        A.Produksi();

        System.out.println("Merk B");
        Kerudung B = new Kerudung("Batik", "merah", "L", true,50000, 3000);
        B.Produksi();




    }
}
