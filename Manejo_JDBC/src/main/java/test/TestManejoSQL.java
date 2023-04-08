package test;

import data.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoSQL {
	public static void main(String[] args) {
		PersonaDAO personaDao = new PersonaDAO();
		
		Persona nuevaPersona = new Persona("Estela","Sanchez", "senioraMendoza@gmail.com", "3344556677");
		personaDao.insertar(nuevaPersona);
		
		
		List<Persona> personas = personaDao.seleccionar();
		personas.forEach(persona->{
			System.out.println(persona);
		});
	}
}