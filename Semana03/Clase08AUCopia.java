package Semana03;

public class Clase08AUCopia {
    
    public static void main(String[] args) {

        // Arreglo original
        int[] arregloOriginal={10, 20, 30, 40, 50};

        // Copiar el arreglo usando el método clone()
        int[] arregloCopia=arregloOriginal.clone();

        // Mostrar el arreglo copiado
        System.out.println("Arreglo copiado con clone():");
        for (int i=0; i<arregloCopia.length; i++) {
            System.out.println("Elemento en indice "+i+": "+arregloCopia[i]);
        }
    }
}