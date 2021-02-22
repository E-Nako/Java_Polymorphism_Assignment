class Monster{
	private String name;
	
	Monster(String name){
		this.name = name;
	}
	
	public String attack() {
		return "Nothing to attack with.";
	}
}

class FireMonster extends Monster{
	
	FireMonster(String name){
		super(name);
	}
	
	public String attack() {
		return "Spit fireee!";
	}
}

class WaterMonster extends Monster{
	
	WaterMonster(String name){
		super(name);
	}
	
	public String attack() {
		return "Spit waterrr!";
	}
}

class StoneMonster extends Monster{
	
	StoneMonster(String name){
		super(name);
	}
	
	public String attack() {
		return "Throw stonesss!";
	}
}
public class Q2 {

	public static void main(String[] args) {
		FireMonster FM = new FireMonster("Fire_Monster");
		System.out.println(FM.attack());
		
		System.out.println(" ");
		
		WaterMonster WM = new WaterMonster("Water_Monster");
		System.out.println(WM.attack());
		
		System.out.println(" ");
		
		StoneMonster SM = new StoneMonster("Stone_Monster");
		System.out.println(SM.attack());
		
		
	}

}
