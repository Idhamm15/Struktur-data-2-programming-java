import Model.*;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        Perhitungan saya = new Perhitungan(4,4,0);

        System.out.println("----------");
        System.out.println("Hasil pertambahan :");
        int hasiltambahnya = saya.HasilTambahSaya(30, 2);
        System.out.println(hasiltambahnya);



        
        System.out.println("----------");
        System.out.println("Hasil Perkalian :");
        int hasilkalinya = saya.HasilKaliSaya(45, 60);
        System.out.println(hasilkalinya);
    }

    //tugas di post di repo github masing-masing siswa
    // hasil repo di email ke aherijanto@mimoapps.xyz

    //subject email : TM_NIM_NAMALENGKAP_KELAS
    //i.e : TM_00
    //dikumpulkan hari sabtu 23 april 2022
    
}

//membuat print judul class dan 
//menampilkan perkalian dan penjumlahan
