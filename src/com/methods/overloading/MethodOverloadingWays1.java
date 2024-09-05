package com.methods.overloading;

class MethodOverloadingWays1 {
	
	// Changing Data Types of the Arguments
	
	
    // Method with int parameter
    void show(int a) {
        System.out.println("Integer parameter: " + a);
    }

    // Overloaded method with double parameter
    void show(double a) {
        System.out.println("Double parameter: " + a);
    }

    public static void main(String[] args) {
    	MethodOverloadingWays1 obj = new MethodOverloadingWays1();
        obj.show(5);        // Calls method with int parameter
        obj.show(5.5);      // Calls method with double parameter
    }
}

