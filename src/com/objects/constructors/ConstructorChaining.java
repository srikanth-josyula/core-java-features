package com.objects.constructors;

public class ConstructorChaining extends ConstructorChainingParent {

	private String msgChild;
	
	public ConstructorChaining() {
		this("Child"); // Calls parameterized constructor of the same class (constructor chaining)
		System.out.println("Child no-argument constructor");
		this("Child"); // This will throw error Constructor call must be the first statement in a constructor

	}
	
	// Parameterized constructor
    public ConstructorChaining(String parentValue, String childValue) {
        super(parentValue); // Calls parameterized constructor of the parent class (constructor chaining with super)
        this.msgChild = childValue;
        System.out.println("Child parameterized constructor with String value = " + this.msgChild);
    }
    
    public ConstructorChaining(String value) {
    	this.msgChild = value;
    	System.out.println("Child parameterized constructor with String value = " + this.msgChild);
    	super(parentValue); // Throws errors 'Constructor call must be the first statement in a constructor'
	}

	public static void main(String[] args) {
    	ConstructorChaining obj1 = new ConstructorChaining(); // Calls no-argument constructor of Child
        System.out.println();
        ConstructorChaining obj2 = new ConstructorChaining("Parent","Child"); // Calls parameterized constructor of Child with one argument
       
    }
}

class ConstructorChainingParent {

	private String msg;

	public ConstructorChainingParent() {
		this("Parent"); // Calls parameterized constructor of the same class (constructor chaining)
		System.out.println("Parent no-argument constructor");
	}

	// Parameterized constructor
	public ConstructorChainingParent(String value) {
		this.msg = value;
		System.out.println("Parent parameterized constructor with String = " + this.msg);
	}
}

/**
 * Parent parameterized constructor with String = Parent
 * Parent no-argument constructor
 * Child parameterized constructor with String value = Child
 * Child no-argument constructor
 * 
 * Parent parameterized constructor with String = Parent
 * Child parameterized constructor with String value = Child
 *
 **/
