public class InmutabilidadCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Adios";
        System.out.println("cadena1 = " + cadena1);

    }
}
