/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoArchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ebit PC 2
 */
public class ManejoArchivo {

	public static void crearArchivo(String nombreArchivo) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (FileNotFoundException e) {
			System.out.println("Ocurrio un error: ");
			e.printStackTrace(System.out);
			System.out.println(e.getMessage());
		}
	}

	public static void escribirArchivo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(archivo);
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha sobreescrito el cuerpo del archivo");
		} catch (FileNotFoundException e) {
			System.out.println("Ocurrio un error: ");
			e.printStackTrace(System.out);
			System.out.println(e.getMessage());
		}
	}

	public static void anexarInfo(String nombreArchivo, String contenido) {
		File archivo = new File(nombreArchivo);
		try {
			PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
			salida.println(contenido);
			salida.close();
			System.out.println("Se ha escrito el cuerpo del archivo");
		} catch (FileNotFoundException ex) {
			System.out.println("Ocurrio un error: ");
			ex.printStackTrace(System.out);
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println("Ocurrio un error: ");
			ex.printStackTrace(System.out);
			System.out.println(ex.getMessage());
		}
	}

	public static void leerArchivo(String nombreArchivo) {
		var archivo = new File(nombreArchivo);
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			var lectura = entrada.readLine();
			while (lectura != null) {
				System.out.println("-> " + lectura);
				lectura = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(ManejoArchivo.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}
