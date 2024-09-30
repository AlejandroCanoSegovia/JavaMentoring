public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");
        // Comparacion de cadenas (==)
        System.out.print("cadena1 igual a cadena 2: ");
        System.out.println(cadena1==cadena2);
        System.out.println(cadena1==cadena3);//Compara referencia

        //Ahora comparar contenido
        System.out.print("Cadena1 es igual en contenido que cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
