package com.classes.concrete;

public class FinalClass {
    public static void main(String[] args) {
    	
        // Instantiate the final class
        Base_Class bc = new Base_Class();
        bc.Display(); // Output: Final_Class::Display()
        bc.getValue();
    }
}

// Final class that cannot be extended
final class Base_Class {
	
    private String value = "Some Value";
    
    void Display() {
        System.out.println("Final_Class::Display()");
    }
    
    //No setter/getters for Immutable Objects
    public String getValue() {
        return value;
    }
}

