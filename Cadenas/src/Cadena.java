public class Cadena {
    public static void main(String[] args) {
        System.out.println("***Manejo de cadenas en Java");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Hola Mundo");
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        // Cadena multiples lineas
        var cadena4= """
                Holamundo1
                Holamundo2
                Holamundo3
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
