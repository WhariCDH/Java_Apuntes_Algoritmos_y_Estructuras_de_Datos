package Semana13_3Ejemplo;

class ArbolBinarioEjemplo {   //la clase que controla el árbol 

    Nodo raiz;   //El primer nodo del arbol (El inicio)

    //Constructor del arbol 
    public ArbolBinarioEjemplo() {
        raiz=null;  //cuando hagamos "ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();" el arbol iniciara vacio
    }

    //Insertamos 
    public void insertar(int valor){
        raiz=insertarValor(raiz, valor);  //Este método recibe un número y lo manda al método valor.
    }

    private Nodo insertarValor(Nodo raiz, int valor) { //raiz → nodo actual donde estoy parado, valor → número que quiero insertar
        if (raiz == null){
            return new Nodo(valor);  //Si llegué a un espacio vacío → aquí va el número
        }
        if (valor<raiz.valor){
            raiz.izquierdo=insertarValor(raiz.izquierdo, valor);  //Si el número es menor → baja por la izquierda.
        } else if (valor>raiz.valor) {
            raiz.derecho=insertarValor(raiz.derecho, valor);  //Si el número es mayor → baja por la derecha
        }
        return raiz; //Esto permite que todos los nodos queden conectados correctamente.
    }

    //Buscar 
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

    //Recorrido en orden 
    public void recorridoEnOrden(){
        recorridoEnOrdenValor(raiz);
    }
    private void recorridoEnOrdenValor(Nodo raiz){
        if (raiz != null) { 
        recorridoEnOrdenValor(raiz.izquierdo);
        System.out.print(raiz.valor + " ");
        recorridoEnOrdenValor(raiz.derecho);
        }

    }

}
