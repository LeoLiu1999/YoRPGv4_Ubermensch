public class Character{
    protected int Health;
    protected int Strength;
    protected int Defense;
    protected double Attack;
    protected String Name;

    public boolean isAlive(){
	return Health > 0;
    }

    public String getName(){
	return Name;
    }
    
    public int getDefense() {
	return Defense;
    }

    public void lowerHP(int Dmg){
	Health -= Dmg;
    }

    public int attack(Character Thing){
	int AttRtr = 0;
	AttRtr = (int) (Strength * Attack * (Math.random() + 0.35) * ((100. - Thing.getDefense()) / 100. ));
	Thing.lowerHP(AttRtr);
	return AttRtr;
    }

    public void normalize(){
	Defense = 40;
	Attack = .5;
    }

    public void specialize(){
	Defense = 20;
	Attack = 1.;
    }

    public String about(){
	return "";
    }

}
