error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase04Pila.java:
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase04Pila.java
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 245
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana11/Clase04Pila.java
text:
```scala
package Semana11;

import java.util.Scanner;

public class Clase04Pila {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Nodo cima=null; // Pila inicializada como vacía
        int@@ opcion;

        do {
            System.out.println("\n--- Menu del Navegador ---");
            System.out.println("1. Visitar nueva pagina web");
            System.out.println("2. Retroceder a la pagina anterior");
            System.out.println("3. Mostrar pagina actual");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            
            opcion=scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese la URL de la página: ");
                    String url=scanner.nextLine();

                    Nodo nuevoNodo = new Nodo(url);
                    nuevoNodo.siguiente = cima; // Apuntar al anterior nodo
                    cima = nuevoNodo; // La nueva página es ahora la cima

                    System.out.println("Visitando: " + url);
                    break;

                case 2:
                    if (cima == null) { // Pop
                        System.out.println("No hay más páginas a las que retroceder.");
                    } else {
                        String paginaAnterior = cima.url;
                        cima = cima.siguiente; // La cima ahora es el nodo anterior
                        System.out.println("Retrocediendo desde: " + paginaAnterior);
                    }
                    break;

                case 3:
                    if (cima == null) { // Peek
                        System.out.println("No hay páginas abiertas.");
                    } else {
                        System.out.println("Página actual: " + cima.url);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del navegador...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        scanner.close();
    }

    // Clase Nodo anidada
    static class Nodo {   //clase aparte 
        String url;       //Guarda la dirección de la pagina web
        Nodo siguiente;

        public Nodo(String url) {
            this.url = url;           //Guarda la URL que recibiste en el nodo
            this.siguiente = null;    //Inicialmente no apunta a ningún otro nodo.
        }
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: 