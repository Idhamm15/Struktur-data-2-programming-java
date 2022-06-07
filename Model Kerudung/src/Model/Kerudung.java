package Model;

public class Kerudung {
    private String mBahan;
    private String mWarna;
    private String mUkuran;
    private Boolean mModelPanjang;
    private int mHarga;
    private int mProd;

    public Kerudung(String Bahan, String Warna, String Ukuran, Boolean ModelPanjang, int Harga, int Prod){

        this.mBahan = Bahan;
        this.mWarna = Warna;
        this.mUkuran = Ukuran;
        this.mModelPanjang = ModelPanjang;
        this.mHarga = Harga;
        this.mProd = Prod;


    }
    private int HitungModal(int mHarga, int mProd) {
        return mHarga*mProd;

    }
    public void Produksi(){
       String ModelPanjang;
        if (this.mModelPanjang) {
            ModelPanjang = "Panjang";
        }else{
            ModelPanjang = "Pendek";



        }

        int TotalModal = HitungModal(mHarga,mProd);

        System.out.println("Bahan" + "\t" + mBahan + "\n" +
                "Warna" + "\t"+ mWarna + "\n" +
                "UKuran" + "\t" + mUkuran + "\n" +
                "Model" + "\t" + mModelPanjang + "\n" +
                "Harga" + "\t" + mHarga + "\n" +
                "Produksi" + "\t" + mProd + "\n");



    }

    }




