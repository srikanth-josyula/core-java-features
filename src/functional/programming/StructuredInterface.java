package functional.programming;

interface Square {
	int calculate(int x);
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
		};

		System.out.println(ans.calculate(a));
	}
}
