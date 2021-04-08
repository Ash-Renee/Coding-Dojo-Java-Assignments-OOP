public class Gorilla extends Mammal{
	
	public Gorilla(int energyLevel) {
		super(energyLevel);
	}
	
	public void throwSomething() { //it's a void method because it's just printing
		//not being an actual method/function
		System.out.println("Duck you dumb bastards!");
		energyLevel -= 5;
	}
	
	public void eatBananas() {
		System.out.println("Banana yum yum in my tum tum");
			energyLevel += 10;
		}
	
	public void climb() {
		System.out.println("Look at him go!");
			energyLevel -= 10;
		}



//Create a separate class Gorilla that can throwSomething(), eatBananas(), and climb()
// For the throwSomething() method, have it print out a message indicating that the 
//gorilla has thrown something, as well as decrease the energy level by 5
	
// For the eatBananas() method, have it print out a message indicating the gorilla's 
// satisfaction and increase its energy by 10
// For the climb() method, have it print out a message indicating the 
// gorilla has climbed a tree and decrease its energy by 10
}