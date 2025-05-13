//Ejercicio 1
public class Ejercicio1 {
    public static void main(String[] args) {

        par(8);

    }
    public static boolean par (int numero){

            boolean resultado = numero % 2 == 0;
            System.out.println("¿Es par? " + resultado);
            return resultado;
        }
    }
