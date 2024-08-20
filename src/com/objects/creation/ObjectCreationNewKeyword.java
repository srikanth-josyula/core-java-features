package com.objects.creation;

/**
 * Using new() keywork
 **/
public class ObjectCreationNewKeyword {

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
		MainClass mainClass1 = new MainClass();
		
		System.out.println(mainClass.printSomething());

		System.out.println("Hashcode of Object 1: "+mainClass.hashCode());
		System.out.println("Hashcode of Method 1: "+mainClass.printSomething().hashCode());
		
		System.out.println("Hashcode of Object 2: "+mainClass1.hashCode());
		System.out.println("Hashcode of Method 1: "+mainClass1.printSomething().hashCode());
	}

}

class MainClass {
	public String printSomething() {
		return "Printing Something...";
	}
}
