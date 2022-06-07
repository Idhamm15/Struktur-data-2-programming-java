import java.util.ArrayList;
import java.util.Scanner;

public class ATMArray {
    public static void main(String[] args) {
        ArrayList<KartuATM> daftaKartuATM = new ArrayList<KartuATM>();
        for (int index=0;index<3;index++){
            KartuATM atmku = new KartuATM();

            Scanner inputDetail = new Scanner(System.in);

            System.out.println("Masukkan No ATM :");
            atmku.nomer = inputDetail.nextLine();

        }
    }
}
