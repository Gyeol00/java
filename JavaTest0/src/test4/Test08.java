package test4;

import java.util.ArrayList;
import java.util.List;

class Member {
	String id;
	String name;
	int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + age ;
	}
	
	
}

public class Test08 {

	public static void main(String[] args) {
		Member m1 = new Member("hong", "홍길동", 30);
		Member m2 = new Member("lee", "이순신", 30);
		Member m3 = new Member("kim", "김유신", 30);
		
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(m1);
		memberList.add(m2);
		memberList.add(m3);
		
		for(Member m : memberList) {
			System.out.println(m);
		}
		
	}
}
