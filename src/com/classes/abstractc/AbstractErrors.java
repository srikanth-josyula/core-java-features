package com.classes.abstractc;

//Abstract class declared as final or static or both - ERROR
public abstract final static class AbstractErrors {
	
	 abstract int speed; // Error: Variables cannot be abstract.
	 
	// Abstract methods do not specify a body
	public abstract void printMessage() {
		
	};

	// Abstract methods cant be static or final or both
	abstract static void printMessage2(); 
	
	// Abstract methods cant be private
	private abstract void printMessage3(); 
	
	// Error: Abstract methods cannot be synchronized.
	synchronized abstract void printMessage4(); 
	
	public static void main(String[] args) {
		
		//Abstract class cannot be instantiated - ERROR
		AbstractErrors demo = new AbstractErrors();
	}
}
