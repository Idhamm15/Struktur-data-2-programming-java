package Model;

public class Tokopedia {
    private String foto_barang;
    private String deskripsi;
    private int harga_barang;
    private String asal_barang;
    private String status_stok;

    //constraktor nama class
    public Tokopedia (String foto, String desk, int harga, String asal, String status) {
        this.foto_barang = foto;
        this.deskripsi = desk;
        this.harga_barang = harga;
        this.asal_barang = asal;
        this.status_stok = status;

    }



}
