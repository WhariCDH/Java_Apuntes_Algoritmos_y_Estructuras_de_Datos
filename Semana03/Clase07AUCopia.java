package Semana03;

public class Clase07AUCopia {

    public static void main(String[] args) {

        // Arreglo original
        int[] arregloOriginal={10, 20, 30, 40, 50};

        // Crear un nuevo arreglo con el mismo tamaño
        int[] arregloCopia=new int[arregloOriginal.length];

        // Copiar el arreglo usando System.arraycopy
        System.arraycopy(arregloOriginal, 0, arregloCopia, 0, arregloOriginal.length);

        // Mostrar el arreglo copiado
        System.out.println("Arreglo copiado con System.arraycopy:");
        for (int i=0; i<arregloCopia.length; i++) {
            System.out.println("Elemento en indice "+i+": "+arregloCopia[i]);
        }
    }
}
