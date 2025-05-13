//Ejercicio 3
public class Ejercicio3 {
    public static void main(String[] args) {

        int numero = 5;
        //factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        System.out.println("Factorial de " + numero + ": " + factorial(numero));
    }

    public static long factorial (int n){
        if (n == 0 || n == 1){
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
