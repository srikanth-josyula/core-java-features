package com.methods.accessModifiers.errortesting;

import com.methods.accessModifiers.ProtectedClassExample;
import com.methods.accessModifiers.PublicClassExample;

public class AccessModifierErrorTesting extends ProtectedClassExample {

	public void showPublicMessage() {
		// Accessing the public method
		PublicClassExample pub = new PublicClassExample();
		pub.displayMessage();
		
	}
	
	public void showProtectedMessage() {
		// Accessing the protected method
		ProtectedClassExample pro = new ProtectedClassExample();
		pro.displayMessage(); //ERROR - Accessible within the same package
	}
	
	public void showDefaultMessage() {
		// Accessing the protected method
		DefaultClassExample def = new DefaultClassExample(); //ERROR - Class itself is not Accessible within the different package
		
	}
	
	// Method in SubClass to access the protected method of SuperClass
	public void showMessage() {
		displayMessage(); 
	}
	
	
	public static void main(String[] args) {
		AccessModifierErrorTesting ac = new AccessModifierErrorTesting();
		ac.showPublicMessage();
		ac.showMessage(); //Hello, this is a protected method! (from subclass)
	}
}