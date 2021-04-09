package com.ashley.objectmaster;

public class Human{
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;
	protected String name;
	protected static int numOfPeople;
	
	public Human(String name) {
	this.strength = 3;
	this.intelligence = 3;
	this.stealth = 3;
	this.health = 100;
	this.name = name;
	}
	

	public int getStrength() {
		return strength;
	}
	
	public int getIntelligence() {
		return intelligence;
	}


	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
		
	public int displayStrength() {
		String name = this.getName();
		System.out.println(name + ", your strength is now " + this.strength);
		return(this.strength);
	}
	
	public int displayIntelligence() {
		String name = this.getName();
		System.out.println(name + ", your intelligence is now " + this.intelligence);
		return(this.intelligence);
	}
	
	public int displayStealth() {
		String name = this.getName();
		System.out.println(name + ", your strength is now " + this.strength);
		return(this.stealth);
	}
	
	public int displayHealth() {
		String name = this.getName();
		System.out.println(name + ", your health is now " + this.health);
		return(this.health);
	}
	
	public void attack(Human target){
		String name = this.getName();
		System.out.println("You were attacked by " + name + " !");
		target.health -= this.strength;
		System.out.println(target.name + ", your health is now " + target.health);
	}
	
}
