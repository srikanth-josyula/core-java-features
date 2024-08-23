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
