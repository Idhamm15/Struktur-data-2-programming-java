public class bilangan {
    public static void main(String[] args) {
        for (int angka = 50; angka >= 1; angka--) {
            if (angka % 2 == 0){
                float hasilbagitiga = angka / 3;
                System.out.println(hasilbagitiga);
            } else {
                System.out.println(angka);

            }
        }
    }
}

