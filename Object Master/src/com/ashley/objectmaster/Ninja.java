package com.ashley.objectmaster;

public class Ninja extends Human{
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
		
	public void steal(Ninja target) {
		String name = this.getName();
		System.out.println("You stole " + name + "'s health!");
		target.health -= this.stealth;
		System.out.println(target.name + " ," + this.name +  " Stole some of your health!  Your health is now " + target.health);
		this.health += this.stealth;
		System.out.println(this.name + ", your health has been raised to " + this.health);
	}
	public void run() {
		this.health -= this.stealth;
		System.out.println(this.name +  " Ran away like a wee baby!  Your health is now " + this.health);
	}
	
}
