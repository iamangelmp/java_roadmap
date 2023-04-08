package data;

import static data.Conexion.getConexion;
import domain.Persona;
import java.sql.*;
import java.util.*;

public class PersonaDAO {

	private static final String SQL_SELECT = "SELECT * FROM PERSONA";
	private static final String SQL_INSERT = "INSERT INTO PERSONA (nombre, apellido, email, telefono) VALUES (?,?,?,?)";

	public List<Persona> seleccionar() {
		Connection conn = null;
		PreparedStatement stmnt = null;
		ResultSet rs = null;
		Persona persona = null;
		List<Persona> personas = new ArrayList<>();

		try {
			conn = getConexion();
			stmnt = conn.prepareStatement(SQL_SELECT);
			rs = stmnt.executeQuery();

			while (rs.next()) {
				int idPersona = rs.getInt("id_persona");
				String nombre = rs.getNString("nombre");
				String apellido = rs.getNString("apellido");
				String email = rs.getNString("email");
				String telefono = rs.getNString("telefono");

				persona = new Persona(idPersona, nombre, apellido, email, telefono);
				personas.add(persona);

			}
		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(conn);
				Conexion.close(stmnt);
				Conexion.close(rs);
			} catch (SQLException ex) {
				ex.printStackTrace(System.out);
			}
		}
		return personas;
	}

	public int insertar(Persona persona) {
		Connection conn = null;
		PreparedStatement tsmnt = null;
		int registros = 0;

		try {
			conn = getConexion();
			tsmnt = conn.prepareStatement(SQL_INSERT);
			tsmnt.setString(1, persona.getNombre());
			tsmnt.setString(2, persona.getApellido());
			tsmnt.setString(3, persona.getEmail());
			tsmnt.setString(4, persona.getTelefono());

			registros = tsmnt.executeUpdate();

		} catch (SQLException ex) {
			ex.printStackTrace(System.out);
		} finally {
			try {
				Conexion.close(conn);
				Conexion.close(tsmnt);
			} catch (SQLException ex) {
				ex.printStackTrace(System.out);
			}
		}
		return registros;

	}

}
