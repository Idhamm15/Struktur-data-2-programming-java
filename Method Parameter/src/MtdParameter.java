import java.util.Scanner;

public class MtdParameter {
    private static void CetakJudul(String Judul01,String Judul02){
        System.out.println(Judul01);
        System.out.println(Judul02);
    }

    private static void HitungGanjilGenap(int angka){
        if (angka %2 == 0) {
            System.out.println("Angka " + angka + "adalah Bilangan Genap");
        }else{
            System.out.println("Angka" + angka + "Bilangan Ganjil");
        }
    }
    public static void main(String[] args) {
        CetakJudul("Hello", "Good Afternoon");
        Scanner inputUser = new Scanner(System.in);
        int number;
        number = inputUser.nextInt();
        HitungGanjilGenap(number);//HitungGG(5)
    }
}
