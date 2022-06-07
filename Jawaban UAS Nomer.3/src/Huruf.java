//Nim : 21090073
//Nama : Mohamad Idham Bahri
//Kelas : 1C D4 Teknik Informatika
public class Huruf {
    public static void main(String[] args) {
        String [] nama = {"Robert","Wahyudi","Layla","Maria","Harold"};
        int[] jumHuruf = new int[4];
        for (int index=0;index<nama.length;index++)
            jumHuruf[index] = CekPanjangNama(nama[index]); //buat method cek panjang nama
        System.out.println();
        System.out.println();

        for(int jumlahHuruf jumlahHuruf){
            System.out.println("Jumlah Huruf =" + jumlahHuruf);
        }

    }

}
