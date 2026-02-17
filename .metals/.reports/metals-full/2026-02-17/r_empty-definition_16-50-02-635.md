error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana14_2/ArbolBinario.java:java/lang/System#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana14_2/ArbolBinario.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1880
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana14_2/ArbolBinario.java
text:
```scala
package Semana14_2;

class ArbolBinario {
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
// Método para buscar un valor en el
árbol binario
public boolean buscar(int valor) {
return buscarRecursivo(raiz, valor);
}
private boolean
buscarRecursivo(Nodo raiz, int valor) {
if (raiz == null) {
return false;
}
if (raiz.valor == valor) {
return true;
}
return valor < raiz.valor ?
buscarRecursivo(raiz.izquierdo, valor) :
buscarRecursivo(raiz.derecho, valor);
}
// Método para eliminar un nodo en el árbol binario
public void eliminar(int valor) {
raiz = eliminarRecursivo(raiz, valor);
}
private Nodo eliminarRecursivo(Nodo raiz, int
valor) {
if (raiz == null) {
return raiz;
}
if (valor < raiz.valor) {
raiz.izquierdo =
eliminarRecursivo(raiz.izquierdo, valor);
} else if (valor > raiz.valor) {
raiz.derecho = eliminarRecursivo(raiz.derecho,
valor);
} else {
if (raiz.izquierdo == null) {
return raiz.derecho;
} else if (raiz.derecho == null) {
return raiz.izquierdo;
}
raiz.valor =
valorMinimo(raiz.derecho);
raiz.derecho =
eliminarRecursivo(raiz.derecho, raiz.valor);
}
return raiz;
}
private int valorMinimo(Nodo raiz) {
int min = raiz.valor;
while (raiz.izquierdo != null) {
min = raiz.izquierdo.valor;
raiz = raiz.izquierdo;
}
return min;
}
// Método para recorrer el árbol en inorden
public void recorridoInorden() {
recorridoInordenRecursivo(raiz);
Syst@@em.out.println();
}
private void recorridoInordenRecursivo(Nodo raiz) {
if (raiz != null) {
recorridoInordenRecursivo(raiz.izquierdo);
System.out.print(raiz.valor + " ");
recorridoInordenRecursivo(raiz.derecho);
}
}
}
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#