package DAO;

import entity.Customer;

public class CustomerDAO {

	// 싱글톤
	private static final CustomerDAO INSTENCE = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return INSTENCE;
	}
	private CustomerDAO() {}
	
	public void insertCustomer(Customer customer) {
		try {
			conn = getConnection();
			psmt = conn.prepa;
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}