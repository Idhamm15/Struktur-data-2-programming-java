import java.util.Scanner;

public class SimpleMethod {
    private static void  CetakJudul(){
        String Nim;
        String Nama;
        String Kelas;
        String namaProject;

        Nim = "21090073";
        Nama = "Mohamad Idham bahri";
        Kelas = "1c";
        namaProject = "Menghitung ganjil genap";

        System.out.println("Nama :" + Nama);
        System.out.println("Nim :" + Nim);
        System.out.println("Kelas :" + Kelas);
        System.out.println("Nama Project :" + namaProject);
    }

    private static void HitungGanjilgenap(){
        Scanner inputUser = new Scanner((System.in));
        int angka;
        System.out.println("Masukkan Angka = ");
        angka = inputUser.nextInt();

        if (angka %2 ==0) {
            System.out.println("Angka" + angka + "Adalah Bilangan Genap");
        }else{
            System.out.println("angka" + angka + "Adalah Bilangan Ganjil");
        }

    }

    public static void main(String[] args) {
        CetakJudul();
        HitungGanjilgenap();
    }
}
