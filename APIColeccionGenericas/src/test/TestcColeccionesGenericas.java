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
public class TestcColeccionesGenericas {

	public static void main(String[] args) {
		
		//List and ArrayList
		List<String> semana = new ArrayList<>();
		semana.add("Lunes");
		semana.add("Martes");
		semana.add("Miercoles");
		semana.add("Jueves");
		semana.add("Viernes");
                                    		
		imprimir(semana);
                                    System.out.println("semana: "+ semana.get(0));
		
		//Set and hashSet
		Set meses = new HashSet();
		meses.add("enero");
		meses.add("febrero");
		meses.add("marzo");
		meses.add("abril");
		meses.add("mayo");
		
		//imprimir(meses);
		
		//imprime set
		Map frutas = new HashMap();
		frutas.put("1", "enero");
		frutas.put("2", "febrero");
		frutas.put("3", "marzo");
		frutas.put("4", "abril");
		frutas.put("5", "mayo");
		
		//System.out.println(frutas.get("1"));
		

	}

	public static void imprimir(Collection<String> lista) {
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
