package com.methods.overloading;

public class MethodOverloadingWays2 {

	//Changing the Number of Parameters
	
	// Method with one parameter
    void display(int a) {
        System.out.println("Single parameter: " + a);
    }
    
    // Overloaded method with two parameters
    void display(int a, int b) {
        System.out.println("Two parameters: " + a + " and " + b);
    }
    
    public static void main(String[] args) {
    	MethodOverloadingWays2 obj = new MethodOverloadingWays2();
        obj.display(5);         // Calls method with one parameter
        obj.display(5, 10);     // Calls method with two parameters
    }
}
