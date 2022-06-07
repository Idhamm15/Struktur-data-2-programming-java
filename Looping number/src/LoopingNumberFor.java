import java.util.Scanner;

public class LoopingNumberFor {
    public static void main(String[] args) {
        Scanner myNumberloop = new Scanner(System.in);
        System.out.println("masukan banyaknya angka yang akan di looping =");
        int loopingNumber = myNumberloop.nextInt();

        System.out.println("\nLooping menggunakan for");
        for (int i=1; i<= loopingNumber; i++){
            System.out.println("Angka i =" + i);
        }


    }
}
