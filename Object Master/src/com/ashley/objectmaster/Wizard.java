package com.ashley.objectmaster;

public class Wizard extends Human{
	public Wizard(String name) {
		super(name);
		this.health = 50;
		this.intelligence = 8;
	}
	public void HealHuman(Human target) {
		target.health += this.intelligence;
		System.out.println(target.name + ", for some weird ass reason, the wizard is the one healing you.  You were healed for " + this.intelligence + " points!");
	}
	public void FireballHuman(Human target) {
		target.health -= this.intelligence * 3;
		System.out.println(target.name + ", the wizard casts fireball!  Your health has been lowered by " + (this.intelligence * 3));
	}
	
}