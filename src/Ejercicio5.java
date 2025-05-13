//Ejercicio 5
//Al ejercicio le agregué 2 prints por pantalla, para que devuelva al usuario un mensaje cuando la cédula
// tiene formato incorrecto y también cuando el dígito verificador no coincide
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número de cédula con sin puntos ni guiones");
        String cedula = leer.nextLine();
        System.out.println("Cédula válida " + ValidarCedula(cedula));

        leer.close();
    }
    public static boolean ValidarCedula(String cedula) {
        // Se valida que la cédula no sea nula y que tenga entre 7 y 8 dígitos
        if (cedula == null || cedula.length() < 7 || cedula.length() > 8) {
            System.out.println("Cédula inválida: Ingrese el número de cédula en formato correcto");
            return false;// Si no cumple, imprime mensaje de error y retorna falso
        }
        // Se recorre la cédula para verificar que todos los caracteres sean dígitos
            for (int i = 0; i < cedula.length(); i++) {
            char c = cedula.charAt(i);
            if (!Character.isDigit(c)) {
                return false;// Si encuentra un carácter no numérico, retorna falso
            }
        }

        // Si la cédula tiene 7 dígitos, se le agrega un 0 al inicio para completar 8 dígitos
        if (cedula.length() == 7) {
            cedula = "0" + cedula;
        }

        // Se obtiene el último dígito (dígito verificador) convirtiéndolo a número
        int digitoVerificador = cedula.charAt(7) - '0';

        // Se realiza la suma ponderada de los primeros 7 dígitos con los factores correspondientes
        int suma =  (cedula.charAt(0) - '0') * 2 +
                (cedula.charAt(1) - '0') * 9 +
                (cedula.charAt(2) - '0') * 8 +
                (cedula.charAt(3) - '0') * 7 +
                (cedula.charAt(4) - '0') * 6 +
                (cedula.charAt(5) - '0') * 3 +
                (cedula.charAt(6) - '0') * 4;

        // Se obtiene el módulo 10 de la suma
        int modulo = suma % 10;

        // Se calcula el dígito esperado según el algoritmo
        int digitoEsperado;
        if (modulo == 0) {
            digitoEsperado = 0;
        } else {
            digitoEsperado = 10 - modulo;
        }

        // Se compara el dígito verificador con el esperado
        if (digitoVerificador != digitoEsperado) {
            System.out.println("Cédula inválida: El dígito verificador no coincide.");
            return false;
        }
            return true; // Si es correcto
    }
}

