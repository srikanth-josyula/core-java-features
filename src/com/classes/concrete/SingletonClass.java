package com.classes.concrete;

public class SingletonClass {

	// Static variable to hold the single instance of the class
	private static SingletonClass instance;

	// Private constructor to prevent instantiation from other classes
	private SingletonClass() {
		System.out.println("Inside Private Constructor");
	}

	// Public method to provide access to the single instance, with synchronized to
	// ensure thread safety
	public static synchronized SingletonClass getInstance() {
		if (instance == null) {
			instance = new SingletonClass();
		}
		return instance;
	}

	// Example method to demonstrate functionality
	public void showMessage() {
		System.out.println("Hello from Singleton!");
	}

	public static void main(String[] args) {
		// Getting two instances of SingletonClass
		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance();

		// Show messages to demonstrate the singleton behavior
		instance1.showMessage();
		
		System.out.println(System.identityHashCode(instance1)); //498931366
		System.out.println(System.identityHashCode(instance2)); //498931366

		// Prove that both instances are the same by comparing them
		if (instance1 == instance2) {
			System.out.println("Both instances are the same.");
		} else {
			System.out.println("Instances are different.");
		}
	}
}
