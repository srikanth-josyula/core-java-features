package com.variables;

public class StaticVariableExample {

    // Static variable declared private
    protected static int staticCounter = 0;

    // This static block is executed when the class is first loaded into memory.
    // It initializes static variables.
    static {
        staticCounter = 1;
        System.out.println("Static initializer block executed");
    }

    // Instance variable
    private int instanceCounter = 0;

    // Constructor
    public StaticVariableExample() {
        staticCounter++; // Increment static variable
        instanceCounter++; // Increment instance variable
    }

    // Static method to access static variable
    public static void displayStaticCounter() {
        System.out.println("Static Counter: " + staticCounter);
    }

    // Instance method to access instance variable
    public void displayInstanceCounter() {
        System.out.println("Instance Counter: " + instanceCounter);
        System.out.println("Static Counter: " + staticCounter);
    }

    public static void main(String[] args) {
        // Create first instance of superclass
        StaticVariableExample obj1 = new StaticVariableExample();
        obj1.displayStaticCounter(); // Output: Static Counter: 2
        obj1.displayInstanceCounter(); // Output: Instance Counter: 1

        // Create second instance of superclass
        StaticVariableExample obj2 = new StaticVariableExample();
        obj2.displayStaticCounter(); // Output: Static Counter: 3
        obj2.displayInstanceCounter(); // Output: Instance Counter: 1

        // Create instance of subclass to change the instance variable
        MyClassStaticTest subclassObj = new MyClassStaticTest();
        subclassObj.displayStaticCounter(); // Output: Static Counter: 101
        subclassObj.displayInstanceCounter(); // Output: Instance Counter: 1

        System.out.println("After subclass modification: checking super class static variables");
        obj1.displayStaticCounter(); // Output: Static Counter: 101 (affected by subclass change)
        obj2.displayStaticCounter(); // Output: Static Counter: 101 (affected by subclass change)
    }
}

class MyClassStaticTest extends StaticVariableExample {

    public MyClassStaticTest() {
        // Modify the static variable in the subclass constructor
        StaticVariableExample.staticCounter = 100;
    }
}
