public class ReglasNombresVariables {
    public static void main(String[] args) {
        //Reglas nombres variables
        String nombreCompleto = "Juan Carlos";//Correcto, y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carlos 2";//No buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-cliente = "Juan"; //Incorrecto
        String nombre_cliente = "Juan"; //No buenas prácticas
        String _apellido = "Perez"; //Correcto y aceptable
        String $apellido = "Perez"; //Correcto y aceptable
        int totPzs = 10; // No buenas prácticas
        int totalPiezas = 10; //Correcto buenas practicas
        boolean casado = true; //Puede mejorar
        boolean isCasado = true; // Correcto y buenas prácticas
        boolean hasSaldo = true; // Correcto y buuenas prácticas
    }
}
