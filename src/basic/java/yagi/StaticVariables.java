package basic.java.yagi;

public class StaticVariables {
	// counter variable is a static variable / class variable because it has static keyword
	public static int counter = 0;
	
	// instanceVar variable is instance variable that will belong to object of this class
	public int instanceVar = 0;
	
	public void incrementCounter() {
		counter++;
	}
	
	public void decrementCounter() {
		counter--;
	}
	
	public void incrementInstance() {
		instanceVar++;
	}
	
	public void decrementInstance() {
		instanceVar--;
	}
}
