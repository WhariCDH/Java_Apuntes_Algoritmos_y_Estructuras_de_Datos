error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana03/Clase04ArrayUni.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana03/Clase04ArrayUni.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 106
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana03/Clase04ArrayUni.java
text:
```scala
package Semana03;

public class Clase04ArrayUni {
    
}

package prjsemana3_arrays_unidim;
import @@java.util.Scanner;
public class PrjBuscar_ingresando_num {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Solicitar el tamaño del arreglo
System.out.print("Ingresa el tamaño del arreglo: ");
int tamaño = scanner.nextInt();
// Declarar e inicializar el arreglo
int[] numeros = new int[tamaño];
// Solicitar los elementos del arreglo
System.out.println("Ingresa " + tamaño + " numeros:");
for (int i = 0; i < tamaño; i++) {
System.out.print("Numero en la posicion " + (i + 1) + " es:
");
numeros[i] = scanner.nextInt();
}
// Solicitar el número a buscar
System.out.print("Ingresa el numero que deseas buscar: ");
int buscar = scanner.nextInt();
// Variable para indicar si se encontró el elemento
boolean encontrado = false;
// Bucle para buscar el elemento en el arreglo
for (int numero : numeros) {
if (numero == buscar) {
encontrado = true;
break;
}
}
// Mostrar el resultado
if (encontrado) {
System.out.println("El numero " + buscar + "
fue encontrado en el arreglo.");
} else {
System.out.println("El numero " + buscar + "
no fue encontrado en el arreglo.");
}
}
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 