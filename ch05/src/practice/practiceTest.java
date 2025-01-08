package practice;

public class practiceTest {

	public static void main(String[] args) {
		Car sonata = new Car("소나타", "검정", 0);
		
		sonata.speedUp(50);
		sonata.speedDown(30);
		sonata.show();
		
		sonata.setColor("흰색");
		sonata.show();
	}
	
	//public static void main(String[] args) {
		//Book B1 = new Book("한밤의 이야기", "김소영", 0);
		
		
	}
	
//}
