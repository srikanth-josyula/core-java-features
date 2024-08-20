package com.oops;

public class ExtendsExample extends MainClass {
	
	ExtendsExample(){
		super();
	}
	
	@Override
	public String printSomething() {
		return "Hello World";
	}

	public static void main(String[] args) {
		
	}
	

}

class MainClass{
 
	private String text;
	
	MainClass(){
		this.text="Dummy";
	}
	
	public String printSomething() {
		return "Hello World";
	}
	
}