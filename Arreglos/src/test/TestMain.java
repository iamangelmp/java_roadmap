package test;

public class TestMain {
    public static void main(String[] args) {
        
        //arreglos
        int myNumbers[][] = { {1,2,3}, {10, 20, 30}, {100,200,300} };
        
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
                
            } 
            
        }
        
        
    }
}
