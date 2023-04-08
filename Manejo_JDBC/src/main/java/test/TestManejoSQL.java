package test;

import data.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoSQL {
	public static void main(String[] args) {
		
		PersonaDAO personaDao = new PersonaDAO();
		List<Persona> personas = personaDao.seleccionar();
		for(Persona persona: personas){
			System.out.println(persona);
		}
	}
}
