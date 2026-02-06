error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase03ListaEnlazada.java:java/util/ArrayList#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase03ListaEnlazada.java
empty definition using pc, found symbol in pc: java/util/ArrayList#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 450
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase03ListaEnlazada.java
text:
```scala
package Semana07;
import java.util.ArrayList;
import java.util.Scanner;

//Desarrolla un menú con 4 opciones: En la primera 
// opción me pide que ingrese n números de notas en 
// un rango de 0 a 20, en la segunda opción que muestre 
// el promedio de las notas, en la tercera opción que muestre 
// la nota mayor y en la cuarta opción salir.

public class Clase03ListaEnlazada {

    public static void main(String[] args) {

        @@ArrayList<Double> notas=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar notas");
            System.out.println("2. Mostrar promedio de las notas");
            System.out.println("3. Mostrar la nota mayor");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    notas.clear(); // Limpiar la lista antes de ingresar nuevas notas
                    System.out.print("¿Cuántas notas desea ingresar?: ");
                    int cantidadNotas = scanner.nextInt();

                    for (int i = 0; i < cantidadNotas; i++) {
                        double nota;
                        do {
                            System.out.print(
                                    "Ingrese la nota " + (i + 1) + " (entre 0 y 20): ");
                            nota = scanner.nextDouble();

                            if (nota < 0 || nota > 20) {
                                System.out.println(
                                        "Error: la nota debe estar entre 0 y 20.");
                            }
                        } while (nota < 0 || nota > 20);

                        notas.add(nota);
                    }

                    System.out.println("Notas ingresadas correctamente.");
                    break;

                case 2:
                    if (notas.isEmpty()) {
                        System.out.println("No hay notas ingresadas.");
                    } else {
                        double suma = 0;

                        for (double nota : notas) {
                            suma += nota;
                        }

                        double promedio = suma / notas.size();
                        System.out.println("El promedio de las notas es: " + promedio);
                    }
                    break;

                case 3:
                    if (notas.isEmpty()) {
                        System.out.println("No hay notas ingresadas.");
                    } else {
                        double mayor = notas.get(0);

                        for (double nota : notas) {
                            if (nota > mayor) {
                                mayor = nota;
                            }
                        }

                        System.out.println("La nota mayor es: " + mayor);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/ArrayList#