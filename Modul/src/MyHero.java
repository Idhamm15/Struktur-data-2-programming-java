import Model.Hero;

public class MyHero {
    public static void main(String[] args) {
        Hero[] HeroKu = new Hero[5];

        HeroKu[0] = new Hero("Yi Sun Shin", "Assasin/Marksman", "Jungler", 32000);
        HeroKu[1] = new Hero("Lunox", "Mage", "Midlaner", 32000);
        HeroKu[2] = new Hero("Jawhead", "Fighter", "Roamer", 32000);
        HeroKu[3] = new Hero("Natan", "Marksman", "Goldlaner", 32000);
        HeroKu[4] = new Hero("Paquito", "Fighter", "Explaner", 32000);

        for (int i = 0; i < HeroKu.length; i++){
            HeroKu[i].PrintHero();
        }
    }
}
