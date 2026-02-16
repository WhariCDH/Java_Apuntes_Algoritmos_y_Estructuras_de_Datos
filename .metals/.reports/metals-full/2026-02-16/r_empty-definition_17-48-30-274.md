error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13/ArbolBinarioBusqueda.java:Semana13/Nodo#valor.
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13/ArbolBinarioBusqueda.java
empty definition using pc, found symbol in pc: Semana13/Nodo#valor.
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 788
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana13/ArbolBinarioBusqueda.java
text:
```scala
package Semana13;

class ArbolBinarioBusqueda {
Nodo raiz;
public ArbolBinarioBusqueda() {
raiz = null;
}
// Método para insertar un valor en el árbol
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
// Método para buscar un valor en el árbol
public boolean buscar(int valor) {
return buscarRecursivo(raiz, valor);
}
private boolean buscarRecursivo(Nodo raiz, int valor) {
if (raiz == null) {
return false;
}
if (valor == raiz.@@valor) {
return true;
}
return valor < raiz.valor
? buscarRecursivo(raiz.izquierdo, valor)
: buscarRecursivo(raiz.derecho, valor);
```


#### Short summary: 

empty definition using pc, found symbol in pc: Semana13/Nodo#valor.