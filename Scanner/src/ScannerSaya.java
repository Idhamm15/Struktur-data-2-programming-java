import java.util.Scanner;

public class ScannerSaya {
    public static void main(String[] args) {
        Scanner idham = new Scanner (System.in);
        String NimSaya;
        String NamaSaya;
        String KelasSaya;

        System.out.println("Masukkan Nim Anda :");
        NimSaya = idham.nextLine();

        System.out.println("Masukkan Nama Anda :");
        NamaSaya = idham.nextLine();

        System.out.println("Masukkan Kelas Anda :");
        KelasSaya = idham.nextLine();

        System.out.println("Nim Anda Adalah =" + NimSaya);
        System.out.println("Nama Anda Adalah =" + NamaSaya);
        System.out.println("Kelas Anda Adalah =" + KelasSaya);

    }
}
