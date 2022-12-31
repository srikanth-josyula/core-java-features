package java8.lambda;

@FunctionalInterface
interface Greetings {
	void greetings(String message);
}

@FunctionalInterface
interface CalOperations {
	int operation(int a, int b);
}

@FunctionalInterface
interface EndProgram {
	void endStatement();
}

public class LambdaParameters01 {
	public static void main(String[] args) {

		// can be
		// (message) -> System.out.println("Hello " + message);
		// message -> {System.out.println("Hello " + message);};

		Greetings greet = message -> System.out.println("Hello " + message);
		greet.greetings("World !");

		// with type declaration
		CalOperations addition = (int a, int b) -> a + b;
		System.out.println("Addition - "+addition.operation(2, 1));

		// with out type declaration
		CalOperations subtraction = (a, b) -> a - b;
		System.out.println("Subtraction - "+subtraction.operation(2, 1));

		// with return statement along with curly braces
		CalOperations multiplication = (int a, int b) -> {
			return a * b;
		};
		System.out.println("Multiplication - "+multiplication.operation(2, 1));
		
		// without return statement and without curly braces
		CalOperations division = (int a, int b) -> a / b;
		System.out.println("Division - "+division.operation(2, 1));
		
		EndProgram end = () -> System.out.println("End !");
		end.endStatement();

	}

}
