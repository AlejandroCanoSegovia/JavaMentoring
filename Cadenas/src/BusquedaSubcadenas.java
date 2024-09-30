public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        // indexOf - Devuelve el índice de la primera aparicion
        var cadena1 = "Hola Mundo";
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        var indice2 = cadena1.indexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);

    }
}
