import Model.PabrikKonveksi;

public class ProduksiTshirt {
    public static void main(String[] args) {
        PabrikKonveksi[] ProdukTshirt = new PabrikKonveksi[2];

        ProdukTshirt[0] = new PabrikKonveksi("SUTRA", "KOTAK", "XL", 50000, "HITAM", true, true);
        ProdukTshirt[1] = new PabrikKonveksi("KATUN", "BULAT", "L","4000", "MERAH", false, false);

    }

}
