package functional.programming;

@FunctionalInterface
interface Square2 {
	int calculate(int x);
	
}

public class FunctionaInterface {
	public static void main(String[] args) {
		int a = 5;
		// lambda expression to define the calculate method
		Square2 s = (int x) -> x * x;
		int ans = s.calculate(a);
		System.out.println(ans);
	}

}
