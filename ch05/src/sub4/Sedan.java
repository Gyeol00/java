package sub4;
            // 자식        // 부모
public class Sedan extends Car{

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);
		this.cc = cc;
	}
	
	public void turbo() {
		// 부모클래스 속성 speed 접근 권한을 protected로 변경
		speed += 20;
	}

	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("배기량 : " + this.cc);
		System.out.println("현재 속도 : " + this.speed);
	}
}