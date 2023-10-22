public class EjercicioSwitch {
    public static void main(String[] args) {
        int mes = 2;
        int anio = 2023;

        boolean esBisiesto = anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0);
        String bisiesto = esBisiesto ? "bisiesto" : "no bisiesto";

        boolean mesDe30Dias = mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12;
        String mes30Dias = mesDe30Dias ? "El mes tiene 31 días" : "El mes tiene 30 días";

        switch (mes) {
            case 2 -> {
                switch (bisiesto) {
                    case "bisiesto" -> System.out.println("El mes tiene 29 días");
                    case "no bisiesto" -> System.out.println("El mes tiene 28 días");
                }
            }
            default -> System.out.println(mes30Dias);
        }
    }
}
