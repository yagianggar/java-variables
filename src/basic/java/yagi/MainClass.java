package basic.java.yagi;

public class MainClass {
	public static void main (String[] args) {
		/*
		 * Static Variable can be also directly called by using class name because it belongs to class not object
		 * E.g : StaticVarables.counter;
		 */
		StaticVariables sv = new StaticVariables();
		System.out.println("Static Var Value : "+sv.counter);
		System.out.println("Instance Var Value : "+sv.instanceVar);
		sv.incrementCounter();
		sv.incrementInstance();
		System.out.println("Static Var Value after increment : "+sv.counter);
		System.out.println("Instance Var Value after increment : "+sv.instanceVar);
		
		/*
		 * Static Variable (counter) here will save the last change (increment) because it belongs to class
		 * While instance variable (instanceVar) here will have the new value / default value as 0
		 */
		StaticVariables sv2 = new StaticVariables();
		System.out.println("========= SV2 ========");
		System.out.println("Static Var Value : "+sv2.counter);
		System.out.println("Instance Var Value : "+sv2.instanceVar);
		sv2.incrementCounter();
		sv2.incrementInstance();
		System.out.println("Static Var Value after increment : "+sv2.counter);
		System.out.println("Instance Var Value after increment : "+sv2.instanceVar);
		
	}
}
