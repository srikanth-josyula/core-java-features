package java8.functionalprogramming;

@FunctionalInterface
interface Square3 {
	
	int calculate(int x);

	// adding this will throw a compile time error
	// void secondMethod();

	// we can add many default methods
	default String defaultMethod(String y) {
		return y;
	}

	default void defaultMethod1() {
	}

}

public class FunctionaInterfacewithoutLambda implements Square3 {
	public static void main(String[] args) {
		int a = 5;

		FunctionaInterfacewithoutLambda fun = new FunctionaInterfacewithoutLambda();
		System.out.println(fun.calculate(a));

	}

	@Override
	public int calculate(int x) {
		int ans = (x * x);
		return ans;
	}

}
