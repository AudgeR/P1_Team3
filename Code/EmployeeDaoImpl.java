package com.example.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Employee;



public class EmployeeDaoImpl implements EmployeeDao {
	
	private static String url="jdbc:oracle:thin:@mysql.cwzypcg5kxzh.us-east-2.rds.amazonaws.com:1521:mysql";
	private static String username="kare";
	private static String password="unico";

	@Override
	public int insertEmployee(Employee e) {
		try (Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("INSERT INTO Employee VALUES(?,?)");
			ps.setString(1, e.getFirstName());
			ps.setString(2, e.getLastName());
			ps.executeUpdate();
			
		} catch (SQLException t) {
			t.printStackTrace();
		}
	
		return 0;
	}

	@Override
	public Employee selectEmployeeByName(String Firstname) {
		Employee employee = null;
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Employee WHERE p_name=?");
			ps.setString(1, Firstname);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				employee = new Employee(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6));
			}
		}
			
			 catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
		}
		
			
	@Override
	public List<Employee> selectAllEmployee() {
		List<Employee> employee = new ArrayList<>();
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM Employee");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				employee.add(new Employee(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4),rs.getString(5), rs.getString(6)));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	
	@Override
	public int updateEmployee(Employee e) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("UPDATE Pets SET p_type=? WHERE p_name=?");
			ps.setString(1, e.getFirstName());
			ps.setString(2, e.getLastName());
			ps.executeUpdate();
		} catch (SQLException t) {
			t.printStackTrace();
		}
		return 0;
	}

	@Override
	public int deleteEmployee(Employee e) {
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			PreparedStatement ps = conn.prepareStatement("DELETE FROM Pets WHERE p_name=?");
			ps.setString(1, e.getFirstName());
			ps.executeUpdate();
		} catch (SQLException t) {
			t.printStackTrace();
		} 
		return 0;
	}

}