package Semana14;

public class ArbolBinario {

    private Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un valor en el árbol binario
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            raiz = new Nodo(valor);
            return raiz;
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }

        return raiz;
    }

    // Método para buscar un valor en el árbol binario
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            return false;
        }

        if (raiz.valor == valor) {
            return true;
        }

        return valor < raiz.valor
                ? buscarRecursivo(raiz.izquierdo, valor)
                : buscarRecursivo(raiz.derecho, valor);
    }

    // Método para recorrer el árbol en inorden
    public void recorridoInorden() {
        recorridoInordenRecursivo(raiz);
        System.out.println();
    }

    private void recorridoInordenRecursivo(Nodo raiz) {
        if (raiz != null) {
            recorridoInordenRecursivo(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            recorridoInordenRecursivo(raiz.derecho);
        }
    }
}
