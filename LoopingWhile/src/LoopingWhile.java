import java.util.Scanner;

public class LoopingWhile {
    public static void main(String[] args) {
        Scanner myNumberloop = new Scanner(System.in);
        System.out.println("Masukkan angka");
        int loopingNumber = myNumberloop.nextInt();
        int x;
        x=2;
        while(x<=loopingNumber){
            System.out.println(x);
            x++;
            
        }
    }
}
