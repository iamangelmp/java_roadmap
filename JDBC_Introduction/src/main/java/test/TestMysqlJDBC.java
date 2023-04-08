package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestMysqlJDBC {
	
	public static void main(String[] args) {
		
		var url = "jdbc:mysql://localhost:3306/java_test?useSSL=false&useTimezone=true&serverTimezone=America/Mexico_City&allowPublicKeyRetrieval=true";
		
		try {
			//Class.forName("com.mysql.cj.jdbc.Drver");	//en apps web puede ser requerida
			Connection conn = DriverManager.getConnection(url, "root", "root");
			Statement command = conn.createStatement();
			var query = "SELECT * FROM persona";
			ResultSet res = command.executeQuery(query);
			while (res.next()) {
				System.out.println("id: " + res.getInt("id_persona") + " Nombre: " + res.getNString("nombre") + " apellido: " + res.getNString("apellido") + " email: " + res.getNString("email") + " telefono: " + res.getNString("telefono"));
			}
			
			res.close();
			conn.close();
			command.close();
			
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		}
		
	}
	
}
