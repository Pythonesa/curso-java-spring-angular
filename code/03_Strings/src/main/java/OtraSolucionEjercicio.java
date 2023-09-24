import java.lang.reflect.Array;

public class OtraSolucionEjercicio {
    public static void main(String[] args) {
        String archivo1 = "archivo1.image.png";
        String[] extensiones = archivo1.split("\\.");
        System.out.println(extensiones[extensiones.length-1]);
    }
}
