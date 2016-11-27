public class Rouge extends Character{

    public Rouge(String name){
	Name = name;
	Health = 150;
	Strength = ((int) (Math.random() * 45) + 80);
	Defense = 20;
	Attack = .75;
	potionNumber = 5;
	UsesPotion = false;
    }

}
