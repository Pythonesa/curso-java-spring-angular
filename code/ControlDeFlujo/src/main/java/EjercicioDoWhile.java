import java.util.Scanner;

public class EjercicioDoWhile {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero: ");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        do{
            System.out.println(numero);
            numero++;
        } while (numero <= 10);
    }
}
