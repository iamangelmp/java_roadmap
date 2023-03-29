/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManejoArchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author Ebit PC 2
 */
public class ManejoArchivo {
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo");
        }catch(FileNotFoundException e){
            System.out.println("Ocurrio un error: ");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);
        try{
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito el cuerpo del archivo");
        }catch(FileNotFoundException e){
            System.out.println("Ocurrio un error: ");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
    }
}
