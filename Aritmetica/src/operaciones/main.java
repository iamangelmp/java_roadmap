package operaciones;

public class main {
    public static void main(String[] args) {
        Aritmetica op1 = new Aritmetica();
        op1.a = 10;
        op1.b = 123;
        //op1.suma();
        //System.out.println("testando");
        //var suma = op1.sumaReturn();
        //System.out.println(suma);
        
        var resultado = op1.sumarParams(12, 12);
        System.out.println("resultado = " + resultado);
    }
    
}
