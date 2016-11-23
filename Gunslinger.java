public class Gunslinger extends Character{
    public Gunslinger(String name){
	Name = name;
	Health = 200;
	Strength = ((int) (Math.random() * 45) + 70);
    }
}
