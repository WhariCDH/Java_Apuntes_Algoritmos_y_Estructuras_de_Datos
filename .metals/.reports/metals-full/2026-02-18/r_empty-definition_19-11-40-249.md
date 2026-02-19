error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06_Practica/ClasePersonalPractica05.java:java/lang/System#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06_Practica/ClasePersonalPractica05.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 538
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06_Practica/ClasePersonalPractica05.java
text:
```scala
package Semana06_Practica;
import java.util.Scanner;
import java.util.ArrayList;

public class ClasePersonalPractica05 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> valor=new ArrayList<>();

        System.out.print("Escribia los numero de loteria que quisieras del 1 al 10: ");
        int loteria=scanner.nextInt();

        for (int i=1; i<loteria; i++){
            valor.add("El numero de loteria " +i+ " no es ganador...");
        }
        @@System.out.println("Sigue intentando....");
        scanner.close();
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#