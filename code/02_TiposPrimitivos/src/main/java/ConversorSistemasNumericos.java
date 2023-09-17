import javax.swing.*;

public class ConversorSistemasNumericos {
    public static void main(String[] args) {
        String decimalString = JOptionPane.showInputDialog(null, "Ingrese un número decimal");
        int decimal = Integer.parseInt(decimalString);
        String binario = Integer.toBinaryString(decimal);
        String octal = Integer.toOctalString(decimal);
        String hexadecimal = Integer.toHexString(decimal);
        String mensaje = "El número decimal " + decimal + " en binario es: " + binario + "\n" +
                "En octal es: " + octal + "\n" +
                "En hexadecimal es: " + hexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
        System.out.println("Binario: " + Integer.parseInt(binario, 2));
        System.out.println("Octal: " + Integer.parseInt(octal, 8));
        System.out.println("Hexadecimal: " + Integer.parseInt(hexadecimal, 16));

        System.out.println("HexaDePablo:" + Integer.decode("0x" + hexadecimal)); //Gracias Ivan!
        System.out.println("HexaDePablo2:" + Integer.valueOf(hexadecimal, 16));
    }
}
