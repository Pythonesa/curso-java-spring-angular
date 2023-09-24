public class Cadenas {
    public static void main(String[] args) {
        String str1 = "Hola";
        String str2 = new String("Hola");
        String str3 = str2;
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1.equals(str2));
        String str4 = "hola";
        System.out.println(str1.equals(str4));
        System.out.println(str1.equalsIgnoreCase(str4));

        String nombre = "Alexito_UY";
        String saludoNombre = nombre.transform(n -> {
            return "Hola " + n + "!";
        });
        System.out.println( saludoNombre);
    }
}
