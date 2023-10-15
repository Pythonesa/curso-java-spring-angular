import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Pedir un número al usuario y mostrar si es par o impar
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        String parImpar = numero % 2 == 0 ? "par" : "impar";
        JOptionPane.showMessageDialog(null, "El numero " + numero + " es " + parImpar);
    }
}
