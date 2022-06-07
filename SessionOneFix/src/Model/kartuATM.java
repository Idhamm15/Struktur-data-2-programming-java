package Model;

public class kartuATM {
    public String nomer;
    public String norek;
    public String nama;
    private int saldo;


    public kartuATM(String no, String nor, String nm){
        this.nomer = no;
        this.norek = nor;
        this.nama = nm;
        this.saldo = 0;
    }

    public int Deposit (int jumlah){
        saldo = saldo + jumlah;
        return saldo;

    }

    public int Withdraw(int jumlah) {
        saldo = saldo - jumlah;
        return saldo;
        
    }
}
