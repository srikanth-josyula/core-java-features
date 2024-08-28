package com.classes.concrete;

public class POJOClass {

	// Private fields
	private String name;
	private int value;

	// Default constructor
	public POJOClass() {
	}

	// Parameterized constructor
	public POJOClass(String name, int value) {
		this.name = name;
		this.value = value;
	}

	// Getter for name
	public String getName() {
		return name;
	}

	// Setter for name
	public void setName(String name) {
		this.name = name;
	}

	// Getter for value
	public int getValue() {
		return value;
	}

	// Setter for value
	public void setValue(int value) {
		this.value = value;
	}

	// Override the toString method to display the object's data
	@Override
	public String toString() {
		return "Person{" + "name='" + name + '\'' + ", value=" + value + '}';
	}
}

class Main {
    public static void main(String[] args) {
       
    	// Creating a POJOClass object using the default constructor
    	POJOClass pojo1 = new POJOClass();
    	pojo1.setName("Sample");
        pojo1.setValue(30);

        // Creating a POJOClass object using the parameterized constructor
        POJOClass pojo2 = new POJOClass("Sample2", 25);

        // Printing the POJOClass objects
        System.out.println(pojo1);
        System.out.println(pojo2);
    }
}
