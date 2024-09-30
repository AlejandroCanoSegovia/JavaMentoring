import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.print("** Recetas de cocina **");
        var consola = new Scanner(System.in);
        System.out.print("Nombre de la receta: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingrediente principales: ");
        var ingredientesPrincipales = consola.nextLine();
        System.out.print("Tiempo de preparación: ");
        //var tiempoPreparacion = consola.nextDouble();
        var tiempoPreparacion = Double.parseDouble(consola.nextLine());
        System.out.print("Dificultad (Facil / Media / Alta): ");
        var Dificultad = consola.nextLine();

        System.out.println("Nombre de la receta ->" + nombreReceta);
        System.out.println("Ingredientes princpales ->" + ingredientesPrincipales);
        System.out.println("Tiempo de preparacion ->" + tiempoPreparacion);
        System.out.println("Dificultad -> " + Dificultad);
    }
}
