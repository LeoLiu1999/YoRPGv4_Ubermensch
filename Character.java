public abstract class Character{
    protected int Health;
    protected int Strength;
    protected int Defense;
    protected double Attack;
    protected String Name;
	protected int potionNumber;
	protected boolean UsesPotion;

    public boolean isAlive(){
	return Health > 0;
    }
	
	public int getPotions(){
		return potionNumber;
	}
	
	public void findPotion(){
		potionNumber += 1;
	}
	
	
	public void usePotion(){
		UsesPotion = true;
	}

    public String getName(){
	return Name;
    }
	
    public int getHealth(){
		return Health;
	}
	
    public int getDefense() {
	return Defense;
    }

    public void lowerHP(int Dmg){
	Health -= Dmg;
    }

    public int attack(Character Thing){
	if (UsesPotion == false){
	int AttRtr = 0;
	AttRtr = (int) (Strength * Attack * (Math.random() + 0.35) * ((100. - Thing.getDefense()) / 100. ));
	Thing.lowerHP(AttRtr);
	return AttRtr;
	}
	else{
		if (potionNumber > 0){
			Health += 100;
			potionNumber -= 1;
			return 0;
		}
		else{
			return 0;
		}
	}
    }

    public void normalize(){
	Defense = 40;
	Attack = .5;
	UsesPotion = false;
    }

    public void specialize(){
	Defense = 20;
	Attack = 1.;
	UsesPotion = false;
    }

    public abstract String about();

}
