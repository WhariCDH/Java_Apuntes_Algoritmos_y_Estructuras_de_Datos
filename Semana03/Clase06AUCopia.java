package Semana03;

public class Clase06AUCopia {

    public static void main(String[] args) {

        // Arreglo original
        int[] arregloOriginal={10, 20, 30, 40, 50};

        // Crear un nuevo arreglo con el mismo tamaño
        int[] arregloCopia=new int[arregloOriginal.length];

        System.out.println("Arreglo original:");

        // Copiar cada elemento del arreglo original al nuevo arreglo
        for (int i=0; i<arregloOriginal.length; i++) {
            arregloCopia[i]=arregloOriginal[i];
            System.out.println("Elemento en indice original "+i+": "+arregloOriginal[i]);
        }

        System.out.println("************************************");

        // Mostrar el arreglo copiado
        System.out.println("Arreglo copiado:");
        
        for (int i=0; i<arregloCopia.length; i++) {
            System.out.println("Elemento en indice copiado "+i+": "+arregloCopia[i]);
        }
    }
}
