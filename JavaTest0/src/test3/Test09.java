package test3;

static class Shape{
	public abstract void draw();
}

class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
		
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Circle!");	
	}
}

public class Test09 {

	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
	}
	
	public void draw(String obj) {
		obj.draw();
	}
}
