/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import static ManejoArchivo.ManejoArchivo.escribirArchivo;
import static ManejoArchivo.ManejoArchivo.crearArchivo;
/**
 *
 * @author Ebit PC 2
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreDoc = "prueba.txt";
	
	//crea el archivo
        //crearArchivo(nombreDoc);
	
	
	//agrega contenido al archivo
	escribirArchivo(nombreDoc, "Este es el contenido");
	
	
    }
}
