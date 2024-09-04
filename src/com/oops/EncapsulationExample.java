package com.oops;

class EncapsulationClass {

	// Private fields to restrict direct access
	private String name;
	private double value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "EncapsulationClass [name=" + name + ", value=" + value + "]";
	}

}

//Main class to test the Encapsulation
public class EncapsulationExample {
	public static void main(String[] args) {

		EncapsulationClass cls = new EncapsulationClass();

		cls.setName("Test");
		cls.setValue(20.39);

		System.out.println(cls.toString());
		System.out.println(cls.getName());

	}
}
