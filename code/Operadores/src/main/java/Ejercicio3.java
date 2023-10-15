import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        /* Pedir al usuario que ingrese 2 palabras
        y mostrar cuál tiene más caracteres. */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra: ");
        String palabra1 = scanner.next();
        System.out.println("Ingrese la segunda palabra: ");
        String palabra2 = scanner.next();

        String palabraMayor = palabra1.length() > palabra2.length() ? palabra1 : palabra2;

        System.out.println("La palabra mayor es = " + palabraMayor);
    }
}
