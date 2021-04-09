package com.ashley.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		Human Krumble = new Human("Krumble");
		Human Borgus = new Human("Borgus");
		Wizard Lilith = new Wizard("Lilith");
		Samurai Stabby = new Samurai("Stabby");
		Ninja NotFound = new Ninja("NotFound");
		
		Stabby.howMany();
		Lilith.FireballHuman(NotFound);
		Lilith.HealHuman(NotFound);
		Stabby.meditate();
		Stabby.DeathBlow(Borgus);
		
//		Krumble.displayHealth();
//		Krumble.displayIntelligence();
//		Krumble.displayStrength();
//		Krumble.displayStealth();
//		Krumble.attack(Borgus);
//		Krumble.displayHealth();
//		Borgus.displayHealth();
		
	}

}
