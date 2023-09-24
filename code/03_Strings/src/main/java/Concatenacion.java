public class Concatenacion {
    public static void main(String[] args) {
        String conSuma = "Hola" + " " + "Mundo";
        System.out.println(conSuma);
        String conConcat = "Hola";
        String finConcat = conConcat.concat(" ").concat("Mundo");
        System.out.println(conConcat);
        System.out.println(finConcat);
        //String inicial = "Hola";
        StringBuilder sb = new StringBuilder("Hola");
        sb.append(" ").append("Mundo");
        String strFinal = sb.toString();
        System.out.println(strFinal);

        long ini = System.currentTimeMillis();

        StringBuilder sb1 = new StringBuilder("Hola");
        for (int i = 0; i < 2000; i++) {
            //System.out.println(conConcat += " " + "Mundo");
            //System.out.println(conConcat.concat(" ").concat("Mundo"));
            sb1.append(" ").append("Mundo");
        }
        String strFinal1 = sb1.toString();
        System.out.println(strFinal1);
        long fin = System.currentTimeMillis();

        System.out.println(fin - ini);
    }
}
