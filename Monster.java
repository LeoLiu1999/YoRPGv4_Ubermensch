public class Monster extends Character{

    public Monster(){
	Health = 150;
	Strength = ((int) (Math.random() * 25) + 30);
	Defense =  ((int) (Math.random() * 10) + 10);
	Attack = .75;
	potionNumber = 0;
	UsesPotion = false;
    }

}
