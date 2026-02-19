error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06_Practica/ClasePersonalPractica04.java:java/util/ArrayList#add(+2).
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06_Practica/ClasePersonalPractica04.java
empty definition using pc, found symbol in pc: java/util/ArrayList#add(+2).
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 518
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana06_Practica/ClasePersonalPractica04.java
text:
```scala
package Semana06_Practica;
import java.util.ArrayList;
public class ClasePersonalPractica04 {
    public static void main(String[] args) {
        ArrayList<String> RPG=new ArrayList<>();

        RPG.add("Marina");
        RPG.add("Veronica");
        RPG.add("Deysi");
        RPG.add("Morrian");
        RPG.add("Paimon");

        System.out.println("Orden de personajes de GT: ");

        System.out.println("Lista de personajes de GT en orden: " +RPG);

        //Añadir personajes
        RPG.@@add(0, "Angie");
        
        
    }
    
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: java/util/ArrayList#add(+2).