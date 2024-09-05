package com.methods.overriding;

//Superclass
class BaseClass {
	
	//Using Object
	protected Object printSomething() {
		return "printSomething from BaseClass";
	}

	// Method with no exception
	public void printSomething2() throws Exception {
        throw new Exception("Checked Exception in Base");
    }
}

//Subclass
public class MethodOverridingExmaple extends BaseClass {
	
	// Overriding method with covariant return type (String is a subtype of Object)
	@Override
	public String printSomething() {
		return "printSomething from ChildClass";
	}

	// Overriding method, no exception thrown even though parent does throw one
	@Override
	public void printSomething2() {
		System.out.println(" NO Checked Exception in Child");
	}

	// Overriding method with call to parent class method using super keyword
	public void printSomething3() {
		System.out.println("Parent class sound: " + super.printSomething());
	}

	public static void main(String[] args) {
		BaseClass base = new BaseClass();
		MethodOverridingExmaple child = new MethodOverridingExmaple();

		// Runtime polymorphism: child printSomething method will be called
		System.out.println(base.printSomething()); 
		System.out.println(child.printSomething()); 

		// Calling overridden method
		child.printSomething2(); 
		child.printSomething2(); 
	}
}
