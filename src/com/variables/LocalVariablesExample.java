package com.variables;

public class LocalVariablesExample {

    // Class-level variable
    int classVar = 10;

    // Method demonstrating best practices for local variables
    public void demonstrateLocalVariables(int parameter) {
    	
        // Method parameter is a local variable and shadows classVar
        System.out.println("Method parameter (shadows classVar): " + parameter); //10

        // Local variable declaration
        int localVar = 20;
        System.out.println("Local variable: " + localVar);

        // Best Practice: Declare variables close to where they're used
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop variable: " + i);
        }

        // Best Practice: Re-initialize variables only when needed
        if (localVar > 15) {
            localVar = 25;  // Safe reassignment
        }
        System.out.println("Updated localVar: " + localVar);

        // Example of variable shadowing
        int classVar = 50;  // Shadows class-level variable
        System.out.println("Local shadowed classVar: " + classVar);
        // Reuse of variable name 'classVar' can be confusing, avoid this practice
        
    }
    
    // Best Practice: Avoid large method bodies with too many local variables
    public void tooManyLocalVariables() {
        
    	int var1 = 10, var2 = 20, var3 = 30, var4 = 40, var5 = 50, var6 = 60, var7 = 70;
        
        // Avoid overloading methods with too many local variables; this is bad practice
        System.out.println("Too many local variables: " + (var1 + var2 + var3 + var4 + var5 + var6 + var7));
    }

    // Best Practice: Avoid using uninitialized local variables
    public void uninitializedVariableExample() {
        int uninitializedVar;
        System.out.println(uninitializedVar); // Compilation Error: variable uninitializedVar might not have been initialized
    }

    // Example of illegal operations on local variables
    public void illegalLocalVariableOperations() {
        final int finalVar = 10;
        finalVar = 20; // Compilation Error: cannot assign a value to final variable finalVar
    }

    // Example of scoping issues with local variables
    public void scopingIssues() {
    	
        if (true) {
            int blockVar = 30;
            System.out.println("Inside block: " + blockVar);
        }
        System.out.println(blockVar); // Compilation Error: cannot find symbol (blockVar is out of scope)
    }

    
    public static void main(String[] args) {
        LocalVariablesExample example = new LocalVariablesExample();

        example.demonstrateLocalVariables(5);
        example.uninitializedVariableExample();
        example.illegalLocalVariableOperations();
        example.scopingIssues();
        example.tooManyLocalVariables();
    }
}
