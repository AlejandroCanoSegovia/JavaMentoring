public class GeneradorDeEmail {
    public static void main(String[] args) {
        var nombreDeUsuario = " Alejandro Cano Segovia ";
        var nombreEmpresa = " Universidad Politecnica de Valencia ";
        var extensionDominio = ".com.es";

        // Solución
        var usuarioNorm = nombreDeUsuario.trim().replace(" ",".").toLowerCase();
        var empresaNorm = nombreEmpresa.replace(" ","").toLowerCase();

        // Forma 1 - Concatenación simple
        var forma1 = usuarioNorm + "@" + empresaNorm + extensionDominio;
        System.out.println("forma1 = " + forma1);

        // Forma 2 - Método concat()
        var forma2 = usuarioNorm.concat("@").concat(empresaNorm).concat(extensionDominio);
        System.out.println("forma2 = " + forma2);

        // Forma 3 - Usando StringBuilder
        var forma3 = new StringBuilder();
        forma3.append(usuarioNorm);
        forma3.append("@");
        forma3.append(empresaNorm).append(extensionDominio);
        System.out.println("forma3 = " + forma3.toString());

        // Forma 4 - Usando StringBuffer
        var forma4 = new StringBuffer();
        forma4.append(usuarioNorm).append("@").append(empresaNorm).append(extensionDominio);
        System.out.println("forma4 = " + forma4.toString());

        // Forma 5 - Usando String.join
        var forma5 = String.join("@", usuarioNorm, empresaNorm) + extensionDominio;
        System.out.println("forma5 = " + forma5);
    }
}

