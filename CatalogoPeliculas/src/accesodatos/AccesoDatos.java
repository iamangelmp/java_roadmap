/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesodatos;

import domain.Pelicula;
import exceptions.*;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexis
 */
public class AccesoDatos implements IAccesoDatos {

	@Override
	public boolean existe(String nombreRecurso) throws AccesoDatosEX {
		File archivo = new File(nombreRecurso);
		return archivo.exists();
	}

	@Override
	public List<Pelicula> listar(String nombrePelicula) throws LecturaDatosEx {
		File archivo = new File(nombrePelicula);
		List<Pelicula> peliculas = new ArrayList<>();
		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			while (linea != null) {
				var pelicula = new Pelicula(linea);
				peliculas.add(pelicula);
				linea = entrada.readLine();
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
			throw new LecturaDatosEx("Excepción al listar peliculas: " + ex.getMessage());

		} catch (IOException ex) {
			ex.printStackTrace(System.out);
			throw new LecturaDatosEx("Excepción al listar peliculas: " + ex.getMessage());
		}
		return peliculas;

	}

	@Override
	public void escribir(Pelicula pelicula, String nombrePelicula, boolean anexar) throws EscrituraDatosEx {
		var archivo = new File(nombrePelicula);
		try {
			var salida = new PrintWriter(new FileWriter(archivo, anexar));
			salida.println(pelicula.toString());
			salida.close();
			System.out.println("Se ha escrito la información en el archivo: " + pelicula);
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
			throw new EscrituraDatosEx("Excepción al escribir pelicula: " + ex.getMessage());
		}
	}

	@Override
	public String buscar(String nombrePelicula, String buscar) throws LecturaDatosEx {
		var archivo = new File(nombrePelicula);
		String resultado = null;

		try {
			var entrada = new BufferedReader(new FileReader(archivo));
			String linea = null;
			linea = entrada.readLine();
			int indice = 1;
			while(linea != null){
				if(buscar != null && buscar.equalsIgnoreCase(linea)){
					resultado = "Pelicula "+ linea + " en el indice" + indice;
					break;
				}
				linea = entrada.readLine();
				indice++;
			}
			entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace(System.out);
			throw new LecturaDatosEx("Excepción al escribir pelicula: " + ex.getMessage());
		} catch (IOException ex) {
			ex.printStackTrace(System.out);
			throw new LecturaDatosEx("Excepción al escribir pelicula: " + ex.getMessage());
		}

		return resultado;
	}

	@Override
	public void crear(String nombrePelicula) throws AccesoDatosEX {
		var archivo = new File(nombrePelicula);
		try {
			var salida = new PrintWriter (FileWriter(archivo));
			salida.close();
			System.out.println("Se ha creado el archivo");
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new AccesoDatosEX ("error: "+ ex.getMessage());
		}
	}

	@Override
	public void borrar(String nombrePelicula) throws AccesoDatosEX {
		var archivo = new File(nombrePelicula);
		if(archivo.exists()){
			archivo.delete();
			System.out.println("se ha borrado el archivo");
		}
		
	}

}
