public class Mage extends Character{
	
    public Mage(String name){
	Name = name;
	Health = 100;
	Strength = ((int) (Math.random() * 45) + 40);
	Defense = 30;
	Attack = 1.;
	potionNumber = 5;
	UsesPotion = false;
    }

 
}
