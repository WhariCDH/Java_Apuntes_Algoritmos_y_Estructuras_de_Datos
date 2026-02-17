package Semana14;

public class Clase01ArbolBinario {

    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario();

        // Insertar nodos en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);

        // Mostrar todos los elementos en orden ascendente
        System.out.println("Recorrido Inorden del arbol (todos los elementos en orden):");
        arbol.recorridoInorden();

        // Buscar un valor en el árbol
        System.out.println("Buscar 40 en el arbol: " + arbol.buscar(40));
        System.out.println("Buscar 100 en el arbol: " + arbol.buscar(100));

        // Queda pendiente para eliminar
    }
}
