package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/*
 * 날짜 : 2025/01/22
 * 이름 : 한결
 * 내용 : Java CRUD 실습하기
 */

public class PreparedDeleteTest {
	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:mysql://localhost:3306/studydb";
		String user = "root";
		String pass = "1234";
		
		try {
			
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			// SQL 실행 객체 생성
			String sql = "delete from `user1` where `uid`=? ";
			
			PreparedStatement psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, "A101");
			
			psmt.executeUpdate();
			
			psmt.close();
			conn.close();		
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("delete 완료...");
		
	}
}
