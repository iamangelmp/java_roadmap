/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import accesoDatos.*;

/**
 *
 * @author Alexis
 */
public class TestInterfaces {

    public static void main(String[] args) {
        IAccesoDatos conexion = new ImplementacionMySQL();

        imprimir(conexion);

        conexion = new ImplementacionOracle();
        conexion.actualizar();

    }

    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
