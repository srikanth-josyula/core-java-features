package com.classes.abstractc;

public abstract class AbstractDemo {
	
	String msg = "Hello";

	//Static block in abstract class - LEGAL but beware of usage
	static {
		System.out.println("Tablet static block.");
	}

	public AbstractDemo() {
		System.out.println("Contstuctor inside");
	}

	public abstract void printMessage();

	public static void main(String[] args) {

		AbstractDemo demo = new Subclass();
		demo.printMessage();
	}

}

class Subclass extends AbstractDemo {

	@Override
	public void printMessage() {
		System.out.println("Subclass Extension of abstract class");
	}

}
