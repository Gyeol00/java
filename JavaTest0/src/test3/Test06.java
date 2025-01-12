package test3;

class Adder {
	private static int instance = new Adder();
	public static int getInstance() {
		return instance;
	}
	public Adder() {}
	
	private Adder(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	
	public void add(int arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	
	public static void add(int a2) {
		a2.x += 10;
	}
	
	public static Adder add(int a3, int value) {
		return new Adder(value);
	}
	
	public void show() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}

public class Test06 {

	public static void main(String[] args) {
		
		Adder a1 = Adder.;
		
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		Adder.add(a1);
		a1.show();
		
		a1 = Adder.add(a1, 3);
		a1.show();
		
	}
}










