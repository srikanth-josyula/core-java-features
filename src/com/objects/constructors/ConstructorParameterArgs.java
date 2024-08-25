package com.objects.constructors;

public class ConstructorParameterArgs {

	public ConstructorParameterArgs(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		ConstructorParameterArgs noArgs = new ConstructorParameterArgs("Hello");
		System.out.println(System.identityHashCode(noArgs));
	}
}


/**
 * The constructor ConstructorParameterArgs() is undefined In Java, if you
 * define any constructors (with parameters or otherwise), the compiler does not
 * automatically provide a no-argument constructor.
 **/

ConstructorParameterArgs noArgs = new ConstructorParameterArgs();