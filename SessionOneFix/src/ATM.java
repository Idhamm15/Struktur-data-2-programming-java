import Model.kartuATM;

import java.util.Scanner;

public class ATM {
    private static void PrintTitle(){
        System.out.println("..............................");
        System.out.println("      HH   HH   HHHHH");
        System.out.println("      HH   HH   hh   hh ");
        System.out.println("      HHHHHHH   hh  hh");
        System.out.println("      HH   HH   hh   hh");
        System.out.println("      HH   HH   HHHHH");
        System.out.println("..............................");
        System.out.println(" BANK HARBER - CABANG TEGAL");
        System.out.println("..............................");
        System.out.println();
    }
    public static void main(String[] args) {
        String nokar;
        String norek;
        String nama;
        String pin;

        nokar = "ABCDE";
        norek = "887687";
        nama = "Donald";
        Scanner input = new Scanner(System.in);
        PrintTitle();
        System.out.println("Masukkan Kartu");
        System.out.println("Masukka PIN   ");
        pin = input.nextLine();
        if(pin.equals("123456")) {
            kartuATM donald = new kartuATM(nokar, norek, nama);
            char pilihan = 0;
            do {
                PrintTitle();
                System.out.println();
                System.out.println("MENU");
                System.out.println("[1]. Deposit");
                System.out.println("[2]. Withdraw");
                System.out.println("[0]. Exit");
                System.out.println("Pilihan Anda :");
                pilihan = input.next().charAt(0);
                System.out.println();
                switch (pilihan) {
                    case '1' -> {
                        int jumlahdepo;
                        jumlahdepo = 100000;
                        int saldoakhirdepo = donald.Deposit(jumlahdepo);
                        System.out.println("Saldo Akhir : " + saldoakhirdepo);
                    }
                    case '2' -> {
                        int jumlahwd = 10000;
                        int saldoakhirwd = donald.Withdraw(jumlahwd);
                        System.out.println("Saldo Akhir : " + saldoakhirwd);
                    }
                    default -> {
                    }
                }
            } while (pilihan != '0');
        }
    }
}
