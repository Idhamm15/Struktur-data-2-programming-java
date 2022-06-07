import java.util.Scanner;

public class LatihanMe {
    private static boolean Process(int Angka){
        if ((Angka%2 == 0) && (Angka%4 == 0)) {
            return true;
        }else {
            return false;
        }

    }
    private static void PrintResult(int Number) {
        boolean myProcess;
        myProcess = Process(Number);
        if (myProcess) {
            System.out.println("Angka kelipatan 2 dan 4");
        } else {
            System.out.println("Angka bukan kelipatan 2 dan 4");

        }
    }
        private static void PleaseInput () {
            System.out.println("Program bilangan kelipatan 2 dan 4");
            Scanner inputUser = new Scanner(System.in);
            int myNumber;
            System.out.println("Masukkan Angka = ");
            myNumber = inputUser.nextInt();
            PrintResult(myNumber);

        }

        public static void main (String[]args){

            //menentukan kelipatan 2 dan 4
            PleaseInput();


        }
    }
