//Ejercicio: Obtener la extensión del nombre de un archivo

public class SolucionEjercicio {
    public static void main(String[] args) {
        String archivo1 = "archivo1.txt";
        String archivo2 = "archivo2.image.png";
        String archivo3 = "archivo3.jpeg";

        System.out.println(getExtension(archivo1));
        System.out.println(getExtension(archivo2));
        System.out.println(getExtension(archivo3));
    }

    public static String getExtension(String nombreArchivo){
        return nombreArchivo.substring(nombreArchivo.lastIndexOf(".")+1);
    }
}
