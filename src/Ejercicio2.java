//Ejercicio 2
public class Ejercicio2 {
    public static void main(String[] args){
        int [] array = {3,9,1,7,4};
        mayorValor (array);
    }
    public static void mayorValor(int[] array){
        int mayor = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] >= mayor){
                mayor = array[i];
            }
        }
        System.out.println("Mayor valor: " + mayor);
    }
}
