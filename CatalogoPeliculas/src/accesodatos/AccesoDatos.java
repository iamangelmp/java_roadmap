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
public class AccesoDatos implements IAccesoDatos{

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
			BufferedReader entrada = new BufferedReader(new FileReader(nombrePelicula));
			String linea = null;
			linea = entrada.readLine();
			 while(linea != null){
				 var pelicula = new Pelicula(linea);
				 peliculas.add(pelicula);
				 linea = entrada.readLine();
			 }
			 entrada.close();
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
			throw new LecturaDatosEx("Excepción al listar peliculas: "+ ex.getMessage());
			
		} catch (IOException ex) {
			Logger.getLogger(AccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
		}
		return peliculas;
		
	}

	@Override
	public void escribir(Pelicula pelicula, String nombrePelicula, boolean anexar) throws EscrituraDatosEx {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public String buscar(String nombrePelicula, String buscar) throws LecturaDatosEx {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void crear(String nombrePelicula) throws AccesoDatosEX {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}

	@Override
	public void borrar(String nombrePelicula) throws AccesoDatosEX {
		throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
	}
	
}
