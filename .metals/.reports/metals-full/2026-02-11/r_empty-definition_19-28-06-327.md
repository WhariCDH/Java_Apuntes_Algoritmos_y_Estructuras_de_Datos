error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana09/Clase01ListaEnlazadaDoble.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 534
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
        int@@ cantidadValores=scanner.nextInt();
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
            for (int i=0; i<lista.size(); i++) {   //"Lista.size()" Devuelve cuántos elementos hay dentro de la lista
                System.out.println("Índice " +( i )+": " +lista.get(i));
            }

            // Menú de opciones
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar valor");
            System.out.println("2. Buscar valor");
            System.out.println("3. Editar valor");
            System.out.println("4. Eliminar valor");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion=scanner.nextInt();  //Guardar el menu en opcion 
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingresa el valor a agregar: ");
                    valor=scanner.nextLine();  //El texto escrito se guarda en la variable valor 
                    lista.add(valor);          //Toma el contenido de valor y lo agrega al final de la lista 
                    System.out.println("Valor agregado.");
                    break;

                case 2:
                    System.out.println("\n--- Buscar Valor ---");
                    System.out.print("Ingresa el valor a buscar: ");
                    valor=scanner.nextLine();  //el texto se guarda en valor 

                    if (lista.contains(valor)) {  //el texto escrito anteriormente en "valor" es buscado en lista.contains 
                        int indice=lista.indexOf(valor);  //"indice" guarda el posicionamiento que se encuntra el valor en la lista
                        System.out.println("El valor '" +valor+ "' se encuentra en el índice " +indice+ ".");
                    } else {
                        System.out.println("El valor '" +valor+ "' no se encontró.");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el valor a editar: ");
                    valor=scanner.nextLine();   //El texto se guarda en "valor"

                    if (lista.contains(valor)) {  //Verifica si el valor existe en la lista, if si existe y else si no
                        int indice=lista.indexOf(valor);  //Busca la posición del valor y lo guarda en indice
                        System.out.println("El valor '" +valor+ "' se encuentra en el índice " +indice+ ".");
                        System.out.print("Ingresa el nuevo valor: ");
                        String nuevoValor=scanner.nextLine();   //se guarda en "nuevoValor"
                        lista.set(indice, nuevoValor);  //Reemplaza el valor antiguo por el nuevo
                        System.out.println("Valor editado.");
                    } else {
                        System.out.println("El valor '" +valor+ "' no se encontró.");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa el valor a eliminar: ");
                    valor=scanner.nextLine();

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

empty definition using pc, found symbol in pc: 