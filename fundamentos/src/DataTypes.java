import java.util.Scanner;

import javax.print.attribute.SupportedValuesAttribute;

class DataTypes {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        System.out.println("TIPOS DE DATOS EN JAVA !");

        System.out.println("\t PRIMITIVOS");
        /*
         * Hay 2 tipos enteros y decimales
         * 
         * ENTEROS
         * byte (8 bits)
         * short (16 bits)
         * int (32 bits)
         * long (64 bits)
         * 
         */

        /* BYTE de -128 a 127 */
        byte numeroByte = 10; // mientras el número este en el rango no hay problema
        var rango_superior_Byte = Byte.MAX_VALUE;
        var rango_inferiorByte = Byte.MIN_VALUE;
        System.out.println("\t\t Byte: " + numeroByte + "\n" + "\t\t\t Valor minimo Byte: " + rango_inferiorByte + "\n"
                + "\t\t\t Valor máximo Byte: " + rango_superior_Byte);

        short numeroShort = 13;
        var rango_superior_Short = Short.MAX_VALUE;
        var rango_inferior_Short = Short.MIN_VALUE;
        System.out.println(
                "\t\t Short: " + numeroShort + "\n" + "\t\t\t Valor minimo Short: " + rango_inferior_Short + "\n"
                        + "\t\t\t Valor máximo Short: " + rango_superior_Short);

        int numeroInt = 13;
        var rango_superior_Int = Integer.MAX_VALUE;
        var rango_inferior_Int = Integer.MIN_VALUE;
        System.out.println(
                "\t\t Int: " + numeroInt + "\n" + "\t\t\t Valor minimo Integer: " + rango_inferior_Int + "\n"
                        + "\t\t\t Valor máximo Integer: " + rango_superior_Int);

        int numeroLong = 173;
        var rango_superior_Long = Long.MAX_VALUE;
        var rango_inferior_Long = Long.MIN_VALUE;
        System.out.println(
                "\t\t Long: " + numeroLong + "\n" + "\t\t\t Valor minimo Long: " + rango_inferior_Long + "\n"
                        + "\t\t\t Valor máximo Long: " + rango_superior_Long);

        System.out.println("\t NORMALES O NO PRIMIVITOS");
    }
}