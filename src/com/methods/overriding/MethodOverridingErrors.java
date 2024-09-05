package com.methods.overriding;

//Superclass
class Parent {
	
	// Protected method
	protected Object getData() {
		return "Parent Data";
	}
	
	static String printSomething() {
		return "Static method in Parent class";
	}

	// Method throwing checked exception
	public void processData() throws Exception {
		System.out.println("Parent is processing data");
	}

	// Final method cannot be overridden
	public final void finalMethod() {
		System.out.println("Final method in Parent");
	}

	// Private method cannot be overridden (Method hiding)
	private void privateMethod() {
		System.out.println("Private method in Parent");
	}
}

//Subclass
public class MethodOverridingErrors extends Parent {
	
	
	@Override
	private String printSomething() { //ERROR Static method cant be overridden
		return "Child Data"; // This will cause a compile-time error due to access level.
	}
	
	@Override
	private String getData() { //ERROR PRIVATE will error
		return "Child Data"; // This will cause a compile-time error due to access level.
	}

	// Error: Overriding and throwing a checked exception that is not thrown by the
	// parent method
	@Override
	public void processData() throws Exception {
		throw new Exception("Checked Exception in Child");
		// If the parent does not throw a checked exception, this will cause a
		// compile-time error.
	}

	// Error: Overriding final method
	@Override
	public void finalMethod() {
		System.out.println("Trying to override final method in Child");
		// This will cause a compile-time error as final methods cannot be overridden.
	}

	// Method hiding: This hides the private method from Parent (does not override)
	public void privateMethod() {
		System.out.println("Method hiding: Private method in Child");
	}

	// Error: Covariant return type violation (int is not a subtype of long)
	@Override
	public int processData() {
		return 0; // Will cause compile-time error due to return type mismatch.
	}

	public static void main(String[] args) {
		MethodOverridingErrors child = new MethodOverridingErrors();

		// The following calls would raise errors during compilation if uncommented:
		// child.getData();
		// child.processData();
		// child.finalMethod();
	}
}
