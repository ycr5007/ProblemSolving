package db.manage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO {
	
	Connection conn = null;
	
	public void Join() throws SQLException {
		try {
			// 1. Driver Loding
			Class.forName("com.mysql.jdbc.Driver");
			
			// 2. Connecting
			String url = "jdbc:mysql://localhost/register";
			String id = "root";
			String password = "orcl1234";
			conn = DriverManager.getConnection(url, id, password);
			
			System.out.println("Success!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Fail Driver Loading...");
		} 
	}
	
	public int Register(User user) {
		PreparedStatement pstmt = null;
		String sql = "insert into user(id, password, name, regis_num, email) values(?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user.getId());
			pstmt.setString(2, user.getPw());
			pstmt.setString(3, user.getName());
			pstmt.setString(4, user.getRegis_num());
			pstmt.setString(5, user.getEmail());
			
			return pstmt.executeUpdate(); // Success
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
				if(conn != null && !conn.isClosed()) {
					conn.close();
				}
			} catch (SQLException close_e) {
				close_e.printStackTrace();
			}
		}
		return -1; // Database Error
	}
	
	public ArrayList<User> ShowUserList() throws SQLException{
		String sql = "select * from user";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			ArrayList<User> list = new ArrayList<User>();
			
			while(rs.next()) {
				User user = new User(rs.getString("id"), rs.getString("password"), rs.getString("name"), rs.getString("regis_num"), rs.getString("email"));
				list.add(user);
			}
			return list;
		} finally {
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		}
	}
}
