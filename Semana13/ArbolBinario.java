package Semana13;

class ArbolBinario {

    Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Insertar un nodo
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
        }
        else if (valor > raiz.valor) {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }

        return raiz;
    }

    // Recorrido en orden
    public void enOrden() {
        enOrdenRecursivo(raiz);
    }

    private void enOrdenRecursivo(Nodo nodo) {
        if (nodo != null) {
            enOrdenRecursivo(nodo.izquierdo);
            System.out.print(nodo.valor + " ");
            enOrdenRecursivo(nodo.derecho);
        }
    }
}
