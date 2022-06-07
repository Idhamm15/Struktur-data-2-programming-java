package Model;

public class Hero {
    private String heroName;
    private String Role;
    private String Position;
    private int Price;

    public Hero(String Hero, String Role, String Position, int Price){
        this.heroName = Hero;
        this.Role = Role;
        this.Position = Position;
        this.Price = Price;
    }

    public String getHeroName(){
        return this.heroName;
    }

    public void setHeroName(String HeroName){
        this.heroName = HeroName;
    }

    public void PrintHero(){
        System.out.println("Hero: " + heroName + ", Role: " + Role + ", Position: " + Position + ", Price: " + Price);
    }
}
