package Semana13;

class Nodo {
    int valor;   //numero almacenado 
    Nodo izquierdo, derecho;  //direcciones en memoria 

    public Nodo(int valor) {  //Constructor 
        this.valor = valor; //"this" mi propio objeto (this.valor → el valor DEL nodo) (valor → el valor QUE ME DIERON)
        izquierdo = null;   //"null" no apunta a nada, significa que este nodo aun no tiene hijos
        derecho = null;
    }
}
