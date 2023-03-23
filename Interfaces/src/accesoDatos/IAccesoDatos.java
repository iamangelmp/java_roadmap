/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package accesoDatos;

/**
 *
 * @author Alexis
 */
public interface IAccesoDatos {
    public static final int MAX_REGISTRO= 10;
    
    void insertar();
    
    void listar();
    
    void actualizar();
    
    void eliminar();
    
    
    
}
