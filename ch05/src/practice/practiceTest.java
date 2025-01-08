package practice;

public class practiceTest {

	public static void main(String[] args) {
		Car sonata = new Car("소나타", "검정", 0);
		
		sonata.speedUp(50);
		sonata.speedDown(30);
		sonata.show();
		
		sonata.setColor("흰색");
		sonata.show();
		
		Book B1 = new Book("자바의 정석", "남궁성", 0);
		
		B1.increasePrice(5000);
		B1.show();
		
		Book B2 = new Book("안녕", "허허", 0);
		
		B2.increasePrice(10000);
		B2.show();
		
		// 가격 비교 만들어보기
	}
}
