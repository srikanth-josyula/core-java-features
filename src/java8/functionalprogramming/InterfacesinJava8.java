package java8.functionalprogramming;

@FunctionalInterface
interface ProgramPrints {

	// static method
	static void startProgram() {
		System.out.println("Program is Starting");
	}

	// Abstract method, Functional interface allows only one abstract method
	void print();

	// default method
	default void endProgram() {
		System.out.println("Program Ended !!");
	}
}

public class InterfacesinJava8 {
	public static void main(String[] args) {

		ProgramPrints.startProgram(); // Calling a static Method

		ProgramPrints pp = new ProgramPrints() {
			@Override
			public void print() {
				System.out.println("Normal way of calling anonymous inner class");
			}
		};
		pp.print();

		ProgramPrints pp2 = () -> {
			System.out.println("Lambda way of calling anonymous inner class");
		};
		pp2.print();
		
		

	}

}
