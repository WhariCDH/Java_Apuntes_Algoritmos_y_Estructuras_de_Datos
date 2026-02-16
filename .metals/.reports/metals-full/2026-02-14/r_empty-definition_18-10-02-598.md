error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase03Cola.java:_empty_/prjsemana12_al#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase03Cola.java
empty definition using pc, found symbol in pc: _empty_/prjsemana12_al#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 69
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana12/Clase03Cola.java
text:
```scala
package Semana12;

public class Clase03Cola {
    
package prjsem@@ana12_al;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
public class atencion_cliente {
public static void main(String[] args) {
Queue<cliente> colaClientes = new LinkedList<>();
Random random = new Random();
// Agregar clientes a la cola
colaClientes.add(new cliente("Cliente 1",
random.nextInt(10) + 1));
colaClientes.add(new cliente("Cliente 2",
random.nextInt(10) + 1));
colaClientes.add(new cliente("Cliente 3",
random.nextInt(10) + 1));
colaClientes.add(new cliente("Cliente 4",
random.nextInt(10) + 1));
int tiempoTotalEspera = 0;
}
// Procesar cada cliente en la cola
while (!colaClientes.isEmpty()) {
cliente clienteActual = colaClientes.poll(); // Desencolar cliente para atenderlo
System.out.println("Atendiendo a: " + clienteActual.nombre);
System.out.println("Tiempo de atencion estimado: " +
clienteActual.tiempoAtencion + " minutos");
// Calcular tiempo de espera total hasta este cliente
System.out.println("Tiempo total de espera para " + clienteActual.nombre + ": " +
tiempoTotalEspera + " minutos");
tiempoTotalEspera += clienteActual.tiempoAtencion; // Actualizar tiempo
total de espera
System.out.println();
}
System.out.println("Todos los clientes han sido atendidos.");
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: _empty_/prjsemana12_al#