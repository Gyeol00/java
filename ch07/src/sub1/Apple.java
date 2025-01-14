package sub1;

public class Apple { // 암묵적으로 Object 클래스 상속, 지금까지 했던 모든 클래스들이 암묵적으로 object를 상속받고 있음

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	// 마우스 오른쪽 - 소스 - 제너레이트 투 스트링
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	

	
	
}
