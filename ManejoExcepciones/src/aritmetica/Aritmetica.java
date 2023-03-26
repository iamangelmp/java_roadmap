/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

import exceptions.OperacionException;

/**
 *
 * @author Alexis
 */
public class Aritmetica {
	public static int division(int numerador, int denominador) throws OperacionException{
		if(denominador == 0){
			throw new OperacionException("division entre 0");
		}
		return numerador / denominador;
	}
}
