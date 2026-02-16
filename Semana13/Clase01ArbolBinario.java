package Semana13;

public class Clase01ArbolBinario {

    public static void main(String[] args) {

        ArbolBinario arbol = new ArbolBinario();

        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(1);

        System.out.println("Recorrido en orden del árbol:");
        arbol.enOrden();
    }
}
