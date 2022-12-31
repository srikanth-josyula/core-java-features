package java8.functionalprogramming;

interface Square {
	int calculate(int x);
	void test();
	default void defaultMethod() {}
}

class StructuredInterface {
	public static void main(String args[]) {
		int a = 5;

		// create anonymous inner class object
		Square ans = new Square() {
			@Override
			public int calculate(int x) {
				int y = x * x;
				return y;
			}

			@Override
			public void test() {
				// TODO Auto-generated method stub
			}
		};

		System.out.println(ans.calculate(a));
	}
}
