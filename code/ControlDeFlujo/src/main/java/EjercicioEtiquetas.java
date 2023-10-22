public class EjercicioEtiquetas {
    public static void main(String[] args) {
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String[] anios = {"2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011"};

        forAnios:
        for (String anio : anios) {
            for (String mes : meses) {
                System.out.println(mes + " " + anio);
                if(anio.equals("2001") && mes.equals("Marzo")){
                    break forAnios;
                }
            }
        }
    }
}
