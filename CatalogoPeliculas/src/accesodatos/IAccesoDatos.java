/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package accesodatos;

import domain.Pelicula;
import exceptions.AccesoDatosEX;
import exceptions.EscrituraDatosEx;
import exceptions.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author Alexis
 */
public interface IAccesoDatos {
	
	boolean existe(String nombreRecurso) throws AccesoDatosEX;
	
	List <Pelicula> listar(String nombrePelicula) throws LecturaDatosEx;
	
	void escribir(Pelicula pelicula, String nombrePelicula, boolean anexar) throws EscrituraDatosEx;
	
	String buscar(String nombrePelicula, String buscar) throws LecturaDatosEx;
	
	void crear(String nombrePelicula) throws AccesoDatosEX;
	
	void borrar(String nombrePelicula) throws AccesoDatosEX;
	
}
