package operaciones;

public class Aritmetica {
    //atributos de la clase
    int a;
    int b;

    public Aritmetica() {
        System.out.println("Desde constructor");
    }
    
 
    
    //metodos
    public void suma(){
        int resultado = (a+b);
        System.out.println("resultado: "+resultado);
    }
    
    public int sumaReturn(){
        return (a+b);
    }
    
    public int sumarParams(int num1, int num2){
        this.a = num1;
        this.b = num2;
        return sumaReturn();
    }
}
