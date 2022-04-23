package Model;
import interfaces.ContohInterface;
public class Perhitungan implements ContohInterface {

        private int a;
        private int b;
        private int hasil;

        public Perhitungan(int a, int b, int _hasil){
            this.a = a;
            this.b = b;
            _hasil = 0;
            this.hasil= _hasil;
            printJudulClass ("Print judul dalam method Perhitungan");
        }

        private void printJudulClass(String jdl) {System.out.println(jdl);}

        @Override
        public void PrintJudul() {
            System.out.println("judul dalam interface");

        }

        @Override
        public void HitungTambah() {
            this.hasil = this.a + this.b;

        }

        @Override
        public void HitungKali() {
            this.hasil = this.a * this.b;

        }

        public int HasilTambahSaya(int a1,int b2){
            this.a = a1;
            this.b = b2;
            HitungTambah();
            return this.hasil;
        }

        //Method return dari hasil kali
        public int HasilKaliSaya(int _a,int _b){
            this.a = _a;
            this.b = _b;
            HitungKali();
            return this.hasil;
    }
}
