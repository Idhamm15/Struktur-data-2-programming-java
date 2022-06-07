import java.util.ArrayList;

public class arrayListOop {
    public static class Mobil {
        private String MerkMobil;
        private String JumlahCC;
        private String JenisMobil;
        private int JumlahKursi;

        public Mobil(){
        }

        public Mobil (String merk, String cc, String jenis, int kursi){
            this.JenisMobil = jenis;
            this.MerkMobil = merk;
            this.JumlahCC = cc;
            this.JumlahKursi = kursi;
        }

        public String getMerkMobil(){
            return this.MerkMobil;
        }

        public void setMerkMobil(String MerkMobil){
            this.MerkMobil = MerkMobil;
        }

        public String getJumlahCC(){
            return this.JumlahCC;
        }

        public void setJumlahCC(String JumlahCC){
            this.JumlahCC = JumlahCC;  
        }

        public String getJenisMobil(){
            return this.JenisMobil;
        }

        public void setJenisMobil(String JenisMobil){
            this.JenisMobil = JenisMobil;
        }

        public int getJumlahKursi(){
            return this.JumlahKursi;
        }

        public void setJumlahKursi(int JumlahKursi){
            this.JumlahKursi = JumlahKursi;
        }

        public static void main(String[] args) {
            ArrayList<Mobil> Toyota = new ArrayList<>();
            Mobil carProduct = new Mobil();
            carProduct.setMerkMobil("Avanza");
            carProduct.setJenisMobil("Manual");
            carProduct.setJumlahCC("1500");
            carProduct.setJumlahKursi(6);
            Toyota.add(carProduct);

            carProduct = new Mobil("Rush", "Automatic", "1200cc", 7);
            Toyota.add(carProduct);

            for(int i = 0; i < Toyota.size(); i++){
                System.out.println(Toyota.get(i).getMerkMobil());
                System.out.println(Toyota.get(i).getJenisMobil());
                System.out.println(Toyota.get(i).getJumlahCC());
                System.out.println(Toyota.get(i).getJumlahKursi());
            }
        }
    
        
    }
    
}