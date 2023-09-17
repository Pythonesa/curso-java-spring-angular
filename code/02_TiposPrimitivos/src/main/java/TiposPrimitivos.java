public class TiposPrimitivos {
    public static void main(String[] args) {
        //boolean: ocupa un solo bit
        boolean verdadero = true;
        boolean falso = false;

        //char: ocupa 16 bits. El valor debe ir comillas simples.
        char letra = 'a';
        char numero = 65; // 65 = 'A'
        char emojiCorazon = '\u2764';
        char saltoDeLinea = '\n';

        //Enteros:
        //byte: ocupa 8 bits, valor entre -128 y 127
        byte numeroEntero = 58;
        //short: ocupa 16 bits, valor entre -32768 y 32767
        short numeroEntero2 = 12345;
        //int: ocupa 32 bits, valor entre -2147483648 y 2147483647
        int numeroEntero3 = 123456789;
        //long: ocupa 64 bits, valor entre -9223372036854775808 y 9223372036854775807
        long numeroEntero4 = 123456789123456789L;

        //Reales:
        //float: ocupa 32 bits, valor entre 1.4E-45 y 3.4E+38
        float numeroReal = 3.14159F;
        //double: ocupa 64 bits, valor entre 4.9E-324 y 1.7E+308
        double numeroReal2 = 5.2E+95;
    }
}
