public class Ejercicio4 {
    public static void main (String[] args){
        imprimirNumeros (4);

        }
        public static int imprimirNumeros (int numero){
            if (numero == 0) {
                return 1;
            }
            else {
                System.out.print(numero + " ");
                return imprimirNumeros (numero - 1);
            }
        }
}
