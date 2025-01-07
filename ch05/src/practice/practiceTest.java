package practice;

public class practiceTest {

	public static void main(String[] args) {
		Car sonata = new Car("소나타", "검정", 0);
		
		sonata.speedUp(50);
		sonata.speedDown(30);
		sonata.show();
	}
}
