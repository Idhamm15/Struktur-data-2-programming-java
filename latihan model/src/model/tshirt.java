package model;

public class tshirt {
    private String merk_baju;
    private String model_baju;
    private String uk_baju;
    private String warna_baju;
    private boolean lengenpendek;
    private boolean kerahtshirt;
    private int hargatshirt;
    private int jml_produksi;

    //Constactor = nama class.
    public tshirt(String merk, String model,String ukuran,String warna, boolean lengen,boolean kerah, int harga, int jumlah){
        this.merk_baju=merk;
        this.model_baju=model;        //Constractor
        this.uk_baju=ukuran;          //OOP (Object Oriented Programming)
        this.warna_baju=warna;
        this.lengenpendek=lengen;
        this.kerahtshirt=kerah;
        this.hargatshirt=harga;
        this.jml_produksi=jumlah;

    }
    private static int hitungmodal(int harga,int jumlah){

        return harga*jumlah;
    }
    public void produksi() {
        String lengen;
        String kerah;
        if(this.lengenpendek){
            lengen="Lengen Pendek";
        }else{
            lengen="Lengen Panjang";
        }

        if(this.kerahtshirt){
            kerah="Berkerah";
        }else{
            kerah="Tidak Berkerah";
        }
        int totalmodal=hitungmodal(this.hargatshirt,this.jml_produksi);
        System.out.println("merk"+this.merk_baju+"\n"+"model"+this.model_baju+"\n"+
                "ukuran"+this.uk_baju+"\n"+"warna"+this.warna_baju+"lengenpendek"+lengen+"\n"+
                "kerah"+kerah+"Jumlah Produksi"+this.jml_produksi+"\n"+"Harga "+this.hargatshirt+"\n"+
                "Total Modal"+totalmodal);

    }

    public static void main(String[] args) {
        
    }
}
