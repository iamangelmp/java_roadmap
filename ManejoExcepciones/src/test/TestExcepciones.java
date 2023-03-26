/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import aritmetica.Aritmetica;

/**
 *
 * @author Alexis
 */
public class TestExcepciones {

	public static void main(String[] args) {
		int resultado = 0;

//        try{
//            resultado = 10/0;
//            System.out.println("resultado = " + resultado);
//        }catch(Exception e){
//            System.out.println("Ocurrio un error: ");
//            e.printStackTrace();
//            System.out.println("resultado = " + resultado);  
//        }
		try {
			resultado = Aritmetica.division(10, 0);
			System.out.println("resultado = " + resultado);
		} catch (Exception e) {
			System.out.println("Ocurrio un error");
			//e.printStackTrace();
			//e.printStackTrace(System.out);
			System.out.println(e.getMessage());
		}finally{
			System.out.println("se revisio la division	");
		}

	}
}
