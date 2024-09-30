public class TipoVar {
    public static void main(String[] args) {
        //Sin el uso de var
        String nombre1 = "Cano";
        System.out.println("nombre1 = " + nombre1);
        //Con el uso de var
        var nombre2 = "cano";
        System.out.println("nombre2 = " + nombre2);
        var edad =30;
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; //Tipo float
        var isCasado = false;
        //isCasado = "No" //Tiene que ser del mismo tipo

        //var precio
        //precio = 10    Se debe asignar valor cuando se crea variable

        //var apellido = null; Debe de ser de algun tipo
    }
}
