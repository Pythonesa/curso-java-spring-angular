public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean and = 5 == 4 && 3 < 6;
        System.out.println(and);
        boolean or = 5 == 5 | 3 < 6;
        System.out.println(or);
        boolean negador = !(5 == 5);
        System.out.println(negador);
        boolean xor = 5 == 5 ^ 3 < 6;
        System.out.println(xor);

        boolean hola = true || true && false;
        System.out.println(hola);
    }
}
