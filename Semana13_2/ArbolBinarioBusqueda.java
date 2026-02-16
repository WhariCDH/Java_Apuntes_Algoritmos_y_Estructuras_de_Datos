package Semana13_2;

class ArbolBinarioBusqueda {

    Nodo raiz;

    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    // Insertar
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) {
            return new Nodo(valor);
        }

        if (valor < raiz.valor) {
            raiz.izquierdo = insertarRecursivo(raiz.izquierdo, valor);
        } else if (valor > raiz.valor) {
            raiz.derecho = insertarRecursivo(raiz.derecho, valor);
        }

        return raiz;
    }

    // Buscar
    public boolean buscar(int valor) {
        return buscarRecursivo(raiz, valor);
    }

    private boolean buscarRecursivo(Nodo raiz, int valor) {
        if (raiz == null) return false;

        if (valor == raiz.valor) return true;

        if (valor < raiz.valor)
            return buscarRecursivo(raiz.izquierdo, valor);
        else
            return buscarRecursivo(raiz.derecho, valor);
    }

    // Recorrido en orden
    public void recorridoEnOrden() {
        recorridoEnOrdenRecursivo(raiz);
    }

    private void recorridoEnOrdenRecursivo(Nodo raiz) {
        if (raiz != null) {
            recorridoEnOrdenRecursivo(raiz.izquierdo);
            System.out.print(raiz.valor + " ");
            recorridoEnOrdenRecursivo(raiz.derecho);
        }
    }
}
