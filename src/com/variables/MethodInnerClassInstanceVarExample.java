package com.variables;

public class MethodInnerClassInstanceVarExample {
	
	private String instanceVariable = "Instance Variable";
	
	 public void outerMethod() {
	        final int finalLocalVariable = 10; // Must be final or effectively final
	        int effectivelyFinalLocalVariable = 20; // Effectively final
	        
	        //If I add this below, I will get error at line 24
	        //Local variable effectivelyFinalLocalVariable defined in an enclosing scope must be final or effectively final
	        effectivelyFinalLocalVariable = 30; // Compilation error


	        // Method-local inner class
	        class LocalInnerClass {
	            public void innerMethod() {
	                // Access instance variable of the outer class
	                System.out.println("Accessing instance variable: " + instanceVariable);
	                
	                // Access local variables of the enclosing method
	                System.out.println("Accessing final local variable: " + finalLocalVariable);
	                // Compilation error: local variables referenced from an inner class must be final or effectively final if below java8
	                System.out.println("Accessing effectively final local variable: " + effectivelyFinalLocalVariable);
	            }
	        }
	        
	        // Create an instance of the method-local inner class
	        LocalInnerClass inner = new LocalInnerClass();
	        inner.innerMethod();
	        
	        // Uncommenting the following line would cause a compilation error
	        // effectivelyFinalLocalVariable = 30; // This will break the effectively final constraint
	    }

	    public static void main(String[] args) {
	    	MethodInnerClassInstanceVarExample outer = new MethodInnerClassInstanceVarExample();
	        outer.outerMethod();
	    }

}
