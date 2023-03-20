package test;

public class testArgumntosVariables {
    public static void main(String[] args) {
        //imprimeNumeros(1,2,4,5);
        imprimeArgumentos("Angel", 1,2,3,4,5,6,7,3);
    }
    
    private static void imprimeArgumentos(String nombre, int... numero){
        System.out.println(nombre);
        imprimeNumeros(numero);
    }
    
    private static void imprimeNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
