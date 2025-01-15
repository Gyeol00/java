package ch08;

import java.util.ArrayList;
import java.util.List;

public class ListPt {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		list.add(1, 10);
		System.out.println(list);
		
		list.remove(3);
		System.out.println(list);
		
		list.getFirst();
		System.out.println(list);
		
	}
}
