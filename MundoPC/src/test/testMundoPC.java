package test;

import com.gm.mundopc.domain.*;

public class testMundoPC {
    public static void main(String[] args) {
        Teclado tec = new Teclado("usb", "logitech");
        Raton raton = new Raton("usb", "logitech");
        Monitor monitor = new Monitor("DELL", 32);
        
        Computadora compu1 = new Computadora("PC Gammer", monitor, raton, tec);
        
        
        Teclado tec2 = new Teclado("analogo", "hp");
        Raton raton2 = new Raton("usb", "dell");
        Monitor monitor2 = new Monitor("Lenovo", 24);
        
        Computadora compu2 = new Computadora("PC Gammer", monitor2, raton2, tec2);
        
        Orden compra = new Orden();
        compra.agregarComputadora(compu1);
        //compra.agregarComputadora(compu2);
        
        compra.mostrarOrden();
    }
}
