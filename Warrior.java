public class Warrior extends Character {

    public Warrior(String name){
        Name = name;
        Health = 200;
        Strength = ((int) (Math.random() * 45) + 60);
    }

    public String about(){
	return "Sword, armor, shield, what else can you ask for?";
    }
}
