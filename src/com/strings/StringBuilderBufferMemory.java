package com.strings;

public class StringBuilderBufferMemory {
	
	public static void main(String[] args) {
		
		// StringBuilder example
		StringBuilder sb = new StringBuilder("Initial");
		System.out.println("StringBuilder buffer address: " + System.identityHashCode(sb)); //498931366

		// Append to exceed initial capacity
		sb.append(" and more text to exceed the initial capacity of the buffer.");
		System.out.println("StringBuilder buffer address after append: " + System.identityHashCode(sb)); //498931366

		// StringBuffer example
		StringBuffer sbf = new StringBuffer("Initial");
		System.out.println("StringBuffer buffer address: " + System.identityHashCode(sbf)); //2060468723

		// Append to exceed initial capacity
		sbf.append(" and more text to exceed the initial capacity of the buffer.");
		System.out.println("StringBuffer buffer address after append: " + System.identityHashCode(sbf)); //2060468723
	}
}
