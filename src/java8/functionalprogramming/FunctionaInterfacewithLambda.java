package java8.functionalprogramming;

@FunctionalInterface
interface Square2 {
	int calculate(int x);
	
	// adding this will throw a compile time error
	//void secondMethod();
	
	// we can add many default methods
	 default String defaultMethod(String y) {
		 return y;
	 }
	 default void defaultMethod1() {}
	
}

public class FunctionaInterfacewithLambda {
	public static void main(String[] args) {
		
		int a = 5;
		// lambda expression to define the calculate method
		Square2 s = (int x) -> x * x;
		int ans = s.calculate(a);
		System.out.println(ans);
		
	}

}
