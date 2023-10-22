public class EjercicioIf {
    public static void main(String[] args) {
        int mes = 4;
        int anio = 2023;

        if (mes == 2) {
            if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
                System.out.println("El mes tiene 29 días");
            } else {
                System.out.println("El mes tiene 28 días");
            }
        } else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            System.out.println("El mes tiene 31 días");
        } else {
            System.out.println("El mes tiene 30 días");
        }
    }
}
