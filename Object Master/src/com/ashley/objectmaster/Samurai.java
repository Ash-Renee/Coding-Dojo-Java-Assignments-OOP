package com.ashley.objectmaster;


public class Samurai extends Human{
	public Samurai(String name) {
		super(name);
		this.health = 200;
		Samurai.numOfPeople++;
	}


		
	public void DeathBlow(Human target) {
		target.health -= target.health;
		System.out.println("You killed " + target.name + " , but you lost half your health!  Your health is now " + this.health / 2 + "! I hope it was worth it!");
	}
	
	public void meditate() {
		this.health = 200;
		System.out.println("You have once again reached inner peace.  You are now restored to full health: " + this.health);
	}
	
	public void howMany() {
		System.out.println("We looked around and could only find " + Samurai.numOfPeople + " Samurai");
	}
	
}
