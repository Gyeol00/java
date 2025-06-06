package controller;

import java.util.Scanner;

import entity.Customer;
import service.CustomerService;

public class CustomerController {
		
	// 서비스 객체
	private CustomerService service = CustomerService.getInstance();
	
	public Customer manage(Scanner sc) {
		
		// 로그인 Customer 객체
		Customer loginedCustomer = null;
		
		while(true) {
			System.out.println("------------- 회원관리 -------------");
			
			if(loginedCustomer == null) {
				System.out.println("0:메인, 1:회원가입, 2:로그인, 3:회원목록");
			}else {
				System.out.println("0:메인, 1:나의정보, 2:로그아웃, 3:회원목록");
			}
			System.out.print("선택 : ");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			case 0:
				// 메인 이동
				return loginedCustomer; // 메서드 종료
			case 1:
				// 회원가입
				break;
			case 2:
				//로그인
				break;
			case 3:
				// 회원목록
				break;
			default:
				break;
			}
			
			
			
		}
	}
}