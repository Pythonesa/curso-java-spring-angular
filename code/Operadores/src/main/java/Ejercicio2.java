import javax.swing.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        /* Pedir al usuario que ingrese 3 notas,
        calcular el promedio y mostra si aprobo o no. */
        double matematicas, fisica, quimica;
        double promedio = 0;
        double minimoAprobado = 6.5;

        matematicas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de matematicas"));
        fisica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de fisica"));
        quimica = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de quimica"));

        promedio = (matematicas + fisica + quimica) / 3;

        String resultado = promedio >= minimoAprobado ? "Aprobado" : "Reprobado";

        JOptionPane.showMessageDialog(null, "Tu promedio es de " + promedio + ". Resultado: " + resultado);
    }
}
