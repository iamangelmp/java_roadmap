package mx.com.gm.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class TestVentas {
    public static void main(String[] args) {
        Producto prod1 = new Producto("Lapiz", 5);
        Producto prod2 = new Producto("Hojas", 1);
              
        Orden compra = new Orden();

        compra.agregarProducto(prod2);
        compra.agregarProducto(prod1);
        compra.mostrarOrden();
    }
}
