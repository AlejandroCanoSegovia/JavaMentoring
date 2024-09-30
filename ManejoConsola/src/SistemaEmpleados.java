import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("** Sistema de empleados **");
        var consola = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //Es jefe de departamento
        System.out.println("¿Es jefe de departamento? (true/false) ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir valores
        System.out.println("\n Datos del Empleado: ");
        System.out.println("\tNombre: "+ nombreEmpleado);
        System.out.println("\tEdad: "+ edadEmpleado);
        System.out.printf("\tsalario: $%.2f%n", salarioEmpleado);
        System.out.println("\t¿Es jefe?: "+ esJefeDepartamento);
    }
}