/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.*;

/**
 *
 * @author Alexis
 */
public class TestcColecciones {

	public static void main(String[] args) {
		List semana = new ArrayList();
		semana.add("Lunes");
		semana.add("Martes");
		semana.add("Miercoles");
		semana.add("Jueves");
		semana.add("Viernes");

		//using a native foreach
		for (Object dia : semana) {
			System.out.println("dia: " + dia);
		}

		//using an lambda expresion (arrow function)
		semana.forEach(dia -> {
			System.out.println("dia: " + dia);
		});
	}
}
