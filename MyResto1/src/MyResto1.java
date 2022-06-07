
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MyResto1{

    private static void Load_Menu(){
        String MenuMakanan = "1. Nasi Putih\n2. Sayur Asem\n3.Ayam Goreng\n4.Pecak Lele\n5.Tempe Goreng\n6. Ayam Geprek \n";
        String MenuMinuman = "7. Teh Tawar\n8. Es Teh Manis\n9. Es Jeruk";
        Scanner myInput = new Scanner(System.in);
        char pilih='a';
        int loop = 0;
        do{
            System.out.println("\nMENU MAKANAN");
            System.out.println("-------------------");
            System.out.println(MenuMakanan + "\n");
            System.out.println("MENU  MINUMAN");
            System.out.println("-------------------");
            System.out.println(MenuMinuman);

            System.out.print("\nPilihan Anda ( tekan 'x' untuk mencetak Order / Keluar ) = ");
            pilih = myInput.next().charAt(0);

            AddToCart(pilih,loop);
            loop++;

        }while(pilih!='x');

        printOrder(MyCart);
    }

    private static void AddToCart(char pilih, int loop) {
    }

    public static void main(String[] args) {
        Load_Menu();
    }
}
