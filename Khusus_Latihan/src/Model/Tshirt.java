package Model;

public class Tshirt {
    private String bBahan;
    private boolean bLenganPanjang;
    private boolean bKerah;
    private int bUkuran;
    private int bSaku;
    private String bWarna;
    private String bDesign;
    private int bHarga;
    private int bProd;

    public Tshirt(String Bahan, boolean Lengan, boolean Kerah, int Ukuran, int Saku,
                  String Warna, String Design, int Harga, int Prod) {

        this.bBahan = Bahan;
        this.bLenganPanjang = Lengan;
        this.bKerah = Kerah;
        this.bUkuran = Ukuran;
        this.bSaku = Saku;
        this.bWarna = Warna;
        this.bDesign = Design;
        this.bHarga = Harga;
        this.bProd = Prod;

    }
    private int HitungModal(int bHarga , int bProd){
        return bHarga*bProd;
    }

    public void Produksi() {
        String Lengan;
        String Kerah;

        if (this.bLenganPanjang) {
            Lengan = "Panjang";
        } else {
            Lengan = "Pendek";
        }

        if (this.bKerah) {
            Kerah = "Berkerah";
        } else {
            Kerah = "Tidak Berkerah";
        }

        int TotalModal = HitungModal(bHarga,bProd);

        System.out.println("Bahan : " + bBahan + "\n" + "Lengan : " + Lengan + "\n" + "Kerah : " + Kerah + "\n"
                + "Ukuran : " + bUkuran + "\n" + "Saku : " + bSaku + "\n" + "Warna : " + bWarna + "\n" + "Design : " +
                bDesign+"\n"+"Harga : "+bHarga+"\n"+"Produksi : "+bProd);
    }
}


