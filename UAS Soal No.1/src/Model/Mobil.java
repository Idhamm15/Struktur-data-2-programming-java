package Model;

import org.w3c.dom.ls.LSOutput;

//Nim : 21090073
//Nama: Mohamad Idham Bahri
//kelas : 1C D4 Teknik Informatika
public class Mobil {
    private String mJenisMobil;
    private String mWarnaMobil;
    private String mLotParkirKosong;
    private String mPlatNomorMobil;
    private Boolean mKategoriMobil;

    public Mobil(String JenisMobil, String WarnaMobil, String LotParkirKosong, String PlatNomorMobil, Boolean KategoriMobil) {
        this.mJenisMobil = JenisMobil;
        this.mWarnaMobil = WarnaMobil;
        this.mLotParkirKosong = LotParkirKosong;
        this.mPlatNomorMobil = PlatNomorMobil;
        this.mKategoriMobil = KategoriMobil;


    }
    private String ParkirKosong(String mLotParkirTerisi){
        return mLotParkirTerisi;

    }

    public void Parkiran(){
        String KategoriMobil;

        if (this.mKategoriMobil){
            KategoriMobil = "Keluaran baru";
        }else{
            KategoriMobil = "Keluaran Lama";
        }

        String LahanKosong =ParkirKosong(mLotParkirKosong);

        System.out.println("Jenis Mobil :" + "\t" + mJenisMobil + "\n" +
                "Warna Mobil :" + "\t" + mWarnaMobil + "\n" +
                "LotParkirKosong :" + "\t" + mLotParkirKosong + "\n" +
                "Plat Nomor Mobil :" + "\t" + mPlatNomorMobil + "\n" +
                "Kategori Mobil :" + "\t" + mKategoriMobil + "\n");

    }
}
