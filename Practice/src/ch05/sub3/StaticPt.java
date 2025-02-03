package ch05.sub3;

class Counter {
	// static 변수로, 객체가 생성될 때마다 증가하는 변수
	static int objectCount = 0;
	
	// 생성자에서 객체가 만들어질 때마다 objectCount 값을 증가시킴
	public Counter() {
		objectCount++; // 객체가 생성될 때마다 objectCount를 1 증가시킴
	}
	
	// static 메서드로 객체 생성 개수를 출력하는 메서드
	public static void printObjectCount() {
		System.out.println("현재까지 생성된 객체의 개수 : " + objectCount);
	}
}

class Calculator {
	// static 변수 : 누적된 결과를 저장하는 변수
	static int result = 0;
	
	// 더하기 메서드 (static 메서드)
	public static void add(int value) {
		result += value; // result에 value를 더함
		System.out.println("더하기: " + value + ", 누적 결과: " + result);
	} 
	
	// 빼기 메서드 (static 메서드)
	public static void subtract(int value) {
		result -= value; // result에서 value를 뺌
		System.out.println("빼기: " + value + ", 누적 결과: " + result);
	}
	
	// static 메서드로 누적 결과를 출력
	public static void printResult() {
		System.out.println("현재까지의 누적 결과: " + result);
	}
}

public class StaticPt {
	public static void main(String[] args) {
		// 객체 3개 생성
		Counter c1 = new Counter(); // objectCount = 1
		Counter.printObjectCount(); // 현재까지 생성된 객체의 개수: 1
		
		Counter c2 = new Counter(); // objectCount = 2
		Counter.printObjectCount(); // 현재까지 생성된 객체의 개수: 2
		
		// Calculatoe의 static 메서드를 사용하여 계산 진행
		Calculator.add(10);
		Calculator.subtract(3);
		Calculator.add(20);
		Calculator.printResult();
	}
}
