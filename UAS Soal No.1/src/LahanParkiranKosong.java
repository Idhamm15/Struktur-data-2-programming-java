import Model.Mobil;
public class LahanParkiranKosong {
    public static void main(String[] args) {
        System.out.println("Lahan A");
        Mobil A = new Mobil("Avanza", "Kuning", "Halaman Depan", "B 123 c", true);
        A.Parkiran();

        System.out.println("\n");

        System.out.println("Lahan B");
        Mobil B = new Mobil("Xenia", "Hijau", "Halaman Tengah", "AB 543 CD", true);
        B.Parkiran();

        System.out.println("\n");

        System.out.println("Lahan C");
        Mobil C = new Mobil("Ranger", "Hitam", "Halaman Belakang", "CD 4567 DF", false);
        C.Parkiran();

    }
}
