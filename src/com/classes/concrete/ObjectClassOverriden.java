package com.classes.concrete;

public class ObjectClassOverriden {

	private String name;
	private int value;

	ObjectClassOverriden(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public static void main(String[] args) {
		ObjectClassOverriden obj = new ObjectClassOverriden("Sample", 123);

		System.out.println(obj.getClass()); // class com.classes.concrete.ObjectClassDefault
		System.out.println(obj.toString()); // ObjectClassOverriden{name='Sample', value=123}
		System.out.println(obj.equals(obj)); // true
		System.out.println(obj.hashCode()); // -765470735

	}

	@Override
	public String toString() {
		return "ObjectClassOverriden{name='" + name + "', value=" + value + "}";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		if (!(obj instanceof ObjectClassOverriden)) {
			return false;
		}

		ObjectClassOverriden other = (ObjectClassOverriden) obj;
		return name.equals(other.name) && value == other.value;
	}
	
	@Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + value; //The use of the number 31 in the hashCode() method is a common convention in Java 
        return result;
    }
}
