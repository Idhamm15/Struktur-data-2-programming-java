package Model;

public class PabrikKonveksi {
    private String Bahan;
    private String Kancing;
    private String Ukuran;
    private int Harga;
    private String Warna;
    private Boolean LenganPanjang;
    private Boolean Kerah;


    public PabrikKonveksi(String mBahan, String mKancing, String mUkuran, String mHarga, String mWarna, String mLenganPanjang, String mKerah) {
        this.Bahan = mBahan;
        this.Kancing = mKancing;
        this.Ukuran = mUkuran;
        this.Harga = mHarga;
        this.Warna = mWarna;
        this.LenganPanjang = mLenganPanjang;
        this.Kerah = mKerah;


    }


    public void  ProduksiTshirt() {
        String Lengan;
        String Kerah;

        if(this.LenganPanjang) {
            LenganPanjang= "Lengan Panjang";
        }else{
            Lengan = "Lengan Pendek";

        if(this.Kerah) {
            Kerah = "Panjang";
        }else{
            Kerah = "Pendek";
        }




    }

    public void TshirtProduksi(){

    int totalModal = HitungTotalModal(this.Harga, this.);


            System.out.println("Bahan" + this.Bahan + "\n" +
                    "Kancing" + this.Kancing + "\n" +
                    "Ukuran" + this.Ukuran + "\n" +
                    "Harga" + this.Harga + "\n" +
                    "Warna" + this.Warna + "\n" +
                    "Lengan" + this.LenganPanjang + "\n" +
                    "Kerah" + this.Kerah + "\n" +
                    "Jumlah Modal" + this.Ju);
        }




        public static void main (String[]args){

        }


    }
}
