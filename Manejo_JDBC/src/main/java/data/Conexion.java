package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
	private static final String JDBC_URL= "jdbc:mysql://localhost:3306/java_test?useSSL=false&useTimezone=true&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true";
	private static final String JDBC_USER = "root";
	private static final String JDBC_PASS = "root";
	
	public static Connection getConexion() throws SQLException{
		return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
	}
	
	public static void close(Connection conn) throws SQLException{
		conn.close();
	}
	
	public static void close(Statement stmnt) throws SQLException{
		stmnt.close();
	}
	
	public static void close(PreparedStatement stmnt) throws SQLException{
		stmnt.close();
	}
	
	public static void close(ResultSet rs) throws SQLException{
		rs.close();
	}
}
