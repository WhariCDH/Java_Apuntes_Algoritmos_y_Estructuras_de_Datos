error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java:java/lang/System#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 1177
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java
text:
```scala
package Semana09;

import java.util.LinkedList;
import java.util.Scanner;

public class Clase01ListaEnlazadaDoble {

    public static void main(String[] args) {

        LinkedList<String> lista=new LinkedList<>();
        Scanner scanner=new Scanner(System.in);

        int opcion;    //"opcion" Guarda la opción del menu 
        String valor;  //"valor" Guarda los textos ingresados 

        // Preguntar cuántos valores desea ingresar
        System.out.print("¿Cuántos valores desea ingresar?: ");
        int cantidadValores=scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Repite el valor segun la cantidad que se ingreso 
        for (int i=0; i<cantidadValores; i++) {
            System.out.print("Ingresa el valor #" +(i + 1)+ ": ");
            valor=scanner.nextLine();  //el texto escrito se guarda en la variable valor 
            lista.add(valor);          //Toma lo que esta en valor y lo agrega en la lista 
        }

        do {
            // Mostrar lista actual
            System.out.println("\n--- Lista Actual ---");
            for (int i=0; i<lista.size(); i++) {
                Sy@@stem.out.println("Índice " +( i + 1 )+": " +lista.get(i));
            }

            // Menú de opciones
            System.out.println("\n--- Menú ---");
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
                    System.out.print("Ingresa el valor a buscar: ");
                    valor = scanner.nextLine();

                    if (lista.contains(valor)) {
                        int indice = lista.indexOf(valor);
                        System.out.println("El valor '" + valor + "' se encuentra en el índice " + indice + ".");
                    } else {
                        System.out.println("El valor '" + valor + "' no se encontró.");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el valor a editar: ");
                    valor = scanner.nextLine();

                    if (lista.contains(valor)) {
                        int indice = lista.indexOf(valor);
                        System.out.println(
                            "El valor '" + valor + "' se encuentra en el índice " + indice + "."
                        );
                        System.out.print("Ingresa el nuevo valor: ");
                        String nuevoValor = scanner.nextLine();
                        lista.set(indice, nuevoValor);
                        System.out.println("Valor editado.");
                    } else {
                        System.out.println("El valor '" + valor + "' no se encontró.");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa el valor a eliminar: ");
                    valor = scanner.nextLine();

                    if (lista.remove(valor)) {
                        System.out.println("Valor eliminado.");
                    } else {
                        System.out.println("El valor '" + valor + "' no se encontró.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#