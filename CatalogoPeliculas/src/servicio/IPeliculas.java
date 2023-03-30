/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

/**
 *
 * @author Alexis
 */
public interface IPeliculas {
	public static final String NOMBRE_RECURSO = "peliculas.txt";
	
	void agregarPeliculas(String nombrePelicula);
	
	void listarPeliculas();
	
	void buscarPelicula(String buscar);
	
	void iniciarPeliculas();
}
