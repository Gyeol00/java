package ch11;

@FunctionalInterface
interface A {
	public int method(int a, int b);
}

@FunctionalInterface
interface B {
	public void method(double a);
}

@FunctionalInterface
interface C {
	public boolean method();
}

@FunctionalInterface
interface D {
	public void method();
}

@FunctionalInterface
interface E {
	public double method(double num);
}


public class LambdaPt {

	public static void main(String[] args) {
		
		A a1 = (int a, int b) -> {
			int c = a + b;
			return c;
		};
		
		A a2 = (a, b) -> {
			return a + b;
		};
		
		A a3 = (a, b) -> a + b;
		
		int r1 = a1.method(1, 2);
		int r2 = a2.method(2, 3);
		int r3 = a3.method(2, 3);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		B b1 = (double a) -> {
			System.out.println("a : " + a);
		};
	}
}



















