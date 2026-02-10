error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java:java/util/Scanner#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java
empty definition using pc, found symbol in pc: java/util/Scanner#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 68
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java
text:
```scala
package Semana09;
import java.util.LinkedList;
import java.util.Sc@@anner
public class Clase01ListaEnlazadaDoble {
    
public static void main(String[] args) {
LinkedList<String> lista = new LinkedList<>();
Scanner scanner = new Scanner(System.in);
int opcion;
String valor;
// Preguntar cuántos valores desea ingresar
System.out.print("¿Cuantos valores desea ingresar?: ");
int cantidadValores = scanner.nextInt();
scanner.nextLine(); // Limpiar el buffer
// Ingreso de valores iniciales
for (int i = 0; i < cantidadValores; i++) {
System.out.print("Ingresa el valor #" + (i + 1) + ": ");
valor = scanner.nextLine();
lista.add(valor);
} 


do {
// Mostrar lista actualizada en cada iteración del menú
System.out.println("\n--- Lista Actual ---");
for (int i = 0; i < lista.size(); i++) {
System.out.println("Índice " + i + ": " + lista.get(i));
}
// Menú de opciones
System.out.println("\n--- Menu ---");
System.out.println("1. Agregar valor");
System.out.println("2. Buscar valor");
System.out.println("3. Editar valor");
System.out.println("4. Eliminar valor");
System.out.println("5. Salir");
System.out.print("Elige una opción: ");
opcion = scanner.nextInt();
scanner.nextLine(); // Limpiar el buffer
switch (opcion) {
case 1:
System.out.print("Ingresa el valor a agregar: ");
valor = scanner.nextLine();
lista.add(valor);
System.out.println("Valor agregado.");
break;

case 2:
System.out.println("\n--- Buscar Valor ---");
// Mostrar lista con índices
for (int i = 0; i < lista.size(); i++) {
System.out.println("Índice " + i + ": " + lista.get(i));
}
System.out.print("Ingresa el valor a buscar: ");
valor = scanner.nextLine();
if (lista.contains(valor)) {
int indice = lista.indexOf(valor);
System.out.println("El valor '" + valor + "' se encuentra en el indice " + indice
+ ".");
} else {
System.out.println("El valor '" + valor + "' no se encontro.");
}
break;

case 3: 

System.out.print("Ingresa el valor a editar: ");
valor = scanner.nextLine();
if (lista.contains(valor)) {
int indice = lista.indexOf(valor);
System.out.println("El valor '" + valor + "' se encuentra en el indice "
+ indice + ".");
System.out.print("Ingresa el nuevo valor: ");
String nuevoValor = scanner.nextLine();
lista.set(indice, nuevoValor);
System.out.println("Valor editado.");
} else {
System.out.println("El valor '" + valor + "' no se encontro.");
}
break;

case 4:
System.out.print("Ingresa el valor a eliminar: ");
valor = scanner.nextLine();
if (lista.remove(valor)) {
System.out.println("Valor eliminado.");
} else {
System.out.println("El valor '" + valor + "' no se encontro.");
}
break;
case 5:
System.out.println("Saliendo del programa...");
break;
default:
System.out.println("Opcion no valida.");
break;
}
} while (opcion != 5);
}
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/Scanner#