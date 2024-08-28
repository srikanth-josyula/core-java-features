package com.classes.concrete;

public final class ImmutableClass {
	
	private final String msg;
	
	public ImmutableClass(String value) {
		this.msg=value;
	}

	// Getter methods
    public String getMsg() {
        return msg;
    }
    
    private final void print() {
    	System.out.println("Hello World");
    }
    
    public static void main(String[] args) {
    	ImmutableClass im = new ImmutableClass("String");
    	im.print();
	}
}

