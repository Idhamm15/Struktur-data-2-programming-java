public class latkelas1c {

    private static void CetakSemuaNilai(int[] score) {
        for (int index = 0; index < score.length; index++) {
            System.out.println(score[index]);
        }

        for (int s : score)
            System.out.println(s);
        }

    private static int FoodOrder(String[] Food){
        return Food.length;
    }


    public static void main(String[] args) {
        int[] nilai = {89,92,78,80,90};
        CetakSemuaNilai(nilai);

        //membuat variable yang mengakses FoodOrder
        String[] Food = {"Burger", "KFC", "Geprek"};
        int jumlahData = FoodOrder(Food);
  
        System.out.println("Jumlah data =" + jumlahData);

    }
}
