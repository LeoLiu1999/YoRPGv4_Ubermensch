public class Tank extends Character{
      public Tank(String name){
	Name = name;
	Health = 500;
	Strength = ((int) (Math.random() * 15) + 30);
	Defense = 50;
	Attack = .75;
	potionNumber = 5;
	UsesPotion = false;
    }

    public String about(){
	return "Yer good ol' lineman, ready to bash their faces in.";
    }

}
