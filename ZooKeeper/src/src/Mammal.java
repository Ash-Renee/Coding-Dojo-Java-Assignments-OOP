public class Mammal {
	public int energyLevelA = 100;
	public Mammal(int energyLevelA) {
		this.energyLevelA = energyLevelA;
	}
	
	public int energyLevelB = 300;
	public Mammal(int energyLevelB) {
		this.energyLevelB = energyLevelB;
	}
		
	public int displayEnergyA() {
		System.out.println("Our energy is now " + this.energyLevelA);
	 return(this.energyLevelA); 
	}
	
	public int displayEnergyB() {
		System.out.println("Our energy is now " + this.energyLevelB);
	}
}
