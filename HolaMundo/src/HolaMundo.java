
import java.util.Scanner;

class HolaMundo{
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        
        System.out.println("nombre libro");
        var nombre_libro = consola.nextLine();
        
        System.out.println("autor libro");
        String autor = consola.nextLine();
        
        System.out.println("autor = " + autor);
        System.out.println("libro = "+ nombre_libro);
    }
}