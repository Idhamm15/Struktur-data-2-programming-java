import java.util.Scanner;

public class BilanganPrima {
    private static void  CetakJudul(){
        String Nim;
        String Nama;
        String Kelas;
        String TUGAS;

        Nim = "21090073";
        Nama = "MOHAMAD IDHAM BAHRI";
        Kelas = "1c";
        TUGAS = "Bilangan Prima";

        System.out.println("NIM :" + Nim);
        System.out.println("NAMA :" + Nama);
        System.out.println("KELAS :" + Kelas);
        System.out.println("TUGAS :" + TUGAS);
    }

    private static void HitungBilanganPrima(){
        Scanner inputUser = new Scanner((System.in));
        int angka;
        System.out.println("Masukkan Angka = ");
        angka = inputUser.nextInt();
        int b = 0;
        for (int i=1;i<=angka; i++){
        if (angka%i==0)
            b=b+1;  }
        if (b == 2)
            System.out.println("\tAngka\t" + angka + "\tAdalah Bilangan Prima");
        else
            System.out.println("\tangka\t" + angka + "\tAdalah Bukan Bilangan Prima");


    }


        public static void main(String[] args) {
CetakJudul();
HitungBilanganPrima();
    }
}
