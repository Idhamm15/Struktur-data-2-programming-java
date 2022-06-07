package Model;

public class BuatKtp {
    private String nama;
    private String tanggalLahir;
    private String tempatLahir;
    private String alamat;
    private String jenisKelamin;
    private String agama;
    private String wargaNegara;
    private String status;

    public BuatKtp(String Nama, String TglLahir, String TempatLahir, String Alamat, String JenisKelamin, String Agama, String WargaNegara, String Status){
        this.nama = Nama;
        this.tanggalLahir = TglLahir;
        this.tempatLahir = TempatLahir;
        this.alamat = Alamat;
        this.jenisKelamin = JenisKelamin;
        this.agama = Agama;
        this.wargaNegara = WargaNegara;
        this.status = Status;

    }
    public void produksi(){
        System.out.println("Nama" + this.nama + "\n" +
                "Tanggal Lahir" + this.tanggalLahir + "\n" +
                "Alamat" + this.alamat + "\n" +
                "Jenis Kelamin" + this.jenisKelamin + "\n" + "Status" + this.alamat + "\n"
                );

    public void cetakStatus (String status){
        switch (status){
            case "married":
                System.out.println("Bener married???");
                break;
            case "single";
                System.out.println("Kapan married nya???");
                break;
            default:
                break;
        }
        }
    }




}
