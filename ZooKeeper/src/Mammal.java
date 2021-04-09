public class Mammal {
	public int energyLevel;
	
	public Mammal() {
	this.energyLevel = 100;
	}	
	
		
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
		
	public int displayEnergy() {
		System.out.println("Our energy is now " + this.energyLevel);
	 return(this.energyLevel); 
	}
}

