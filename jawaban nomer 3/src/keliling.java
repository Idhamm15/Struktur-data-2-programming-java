import java.util.Scanner;
//Nama : Mohamad Idham Bahri
//Nim : 21090073
//Kelas : 1C
public class keliling {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int panjang;
            int lebar;
            int keliling;


            System.out.println("\nSilahkan Masukkan Panjang = ");
            panjang = input.nextInt();
            System.out.println("Silahkan Masukkan Lebar = ");
            lebar = input.nextInt();

            keliling = 2 * (panjang + lebar);
            int x;
            x = 0;
            while (x <= keliling) {
                System.out.println(x);
                x++;
            }
        }
    }


