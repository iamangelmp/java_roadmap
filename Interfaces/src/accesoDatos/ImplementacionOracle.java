/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accesoDatos;

/**
 *
 * @author Alexis
 */
public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde ORACLE");
    }

    @Override
    public void listar() {
        System.out.println("Consultar desde ORACLE");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde ORACLE");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde ORACLE");
    }
}
