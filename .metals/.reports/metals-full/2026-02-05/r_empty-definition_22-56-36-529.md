error id: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase01ListaEnlazadas.java:javax/swing/JOptionPane#
file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase01ListaEnlazadas.java
empty definition using pc, found symbol in pc: javax/swing/JOptionPane#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 113
uri: file:///C:/Users/Dayana/OneDrive/Escritorio/Algoritmos%20y%20Estructuras%20de%20Datos/Semana07/Clase01ListaEnlazadas.java
text:
```scala
package Semana07;

public class Clase01ListaEnlazadas {
    
import java.util.ArrayList;
import javax.swing.@@JOptionPane;

ArrayList miAL = new ArrayList(); //Array List simple
public static void main(String args[]){
ArrayList2 obA = new ArrayList2();
obA.menu();
}
public void menu(){
String op;
do{
op = JOptionPane.showInputDialog(null,"1.
Introducir datos: "
+"2. Modificar datos: "
+"3. Eliminar datos: "
+"4. Buscar datos: "
+"5. Mostrar datos: "
+"6. Salir ");
switch(op){
case "1"://Bloque para introducir datos al array list
String a;
a = JOptionPane.showInputDialog(null, "Digite dato a ingresar: ");
miAL.add(a);
break;
case "2"://Bloque para Modificar dato del array
String b, c;
int indice;
b = JOptionPane.showInputDialog(null, "Ingrese el dato a Modificar: ");
if(miAL.contains(b)){
indice = miAL.indexOf(b);
c = JOptionPane.showInputDialog(null, "Ingrese el nuevo dato: ");
miAL.set(indice, c);
}else{
JOptionPane.showMessageDialog(null, "No existe el dato a modificar
!", "", JOptionPane.ERROR_MESSAGE);
}
break;
```


#### Short summary: 

empty definition using pc, found symbol in pc: javax/swing/JOptionPane#