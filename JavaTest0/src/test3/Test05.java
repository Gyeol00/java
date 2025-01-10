package test3;

class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("===============");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("---------------");
	}
	
}

class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static name() {
		
	}
}

public class Test05 {

	public static void main(String[] args) {
		
	}
}
