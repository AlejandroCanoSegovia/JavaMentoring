public class CaracteresEspeciales {
    public static void main(String[] args) {
        // \n salto linea
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);
        
        // \t tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);
        
        // \' tambien \" para imprimir ' o "
        var cadena3 = "Hola \' Mundo";
        System.out.println("cadena3 = " + cadena3);
        
        // \\ caracter \
        var cadena4= "Hola \\ Mundo";
        System.out.println("cadena4 = " + cadena4);
    }
}
