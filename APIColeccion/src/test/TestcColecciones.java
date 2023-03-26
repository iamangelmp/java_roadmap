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
		
		//List and ArrayList
		List semana = new ArrayList();
		semana.add("Lunes");
		semana.add("Martes");
		semana.add("Miercoles");
		semana.add("Jueves");
		semana.add("Viernes");
		
		//imprimir(semana);
		
		//Set and hashSet
		Set meses = new HashSet();
		meses.add("enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		
		imprimir(meses);

	}

	public static void imprimir(Collection lista) {
		//using a native foreach
//		for (Object dia : semana) {
//			System.out.println("dia: " + dia);
//		}

		//using an lambda expresion (arrow function)
		lista.forEach(elemento -> {
			System.out.println("dia: " + elemento);
		});
	}
}
