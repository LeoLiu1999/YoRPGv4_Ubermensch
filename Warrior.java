public class Warrior extends Character {

    public Warrior(String name){
        Name = name;
        Health = 200;
        Strength = ((int) (Math.random() * 45) + 60);
    }

    public boolean isAlive(){
	return Health > 0;
    }
}
