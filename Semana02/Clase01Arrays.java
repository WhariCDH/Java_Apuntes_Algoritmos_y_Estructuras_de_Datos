package Semana02;
//Realizar un programa que muestre impreso los nombres de 5 cursos con su precio. (Empleando Arrays).
public class Clase01Arrays {
    public static void main(String[] args) {   //(void) indica que el método no devuelve ningún resultado, solo imprime

        String[] nombres=new String[5];  //Arrays de nombre, guarda 5 textos (String)
        int[] costos=new int[5];         //Arrays de costo, guarda 5 números enteros (int)
        
        //Valores
        nombres[0] = "Excel";
        nombres[1] = "Word";
        nombres[2] = "Netbeans";
        nombres[3] = "MySql";
        nombres[4] = "Oracle";

        costos[0] = 350;
        costos[1] = 300;
        costos[2] = 1200;
        costos[3] = 1500;
        costos[4] = 1700;

        System.out.println("El programa " + nombres[0] + " cuesta " + costos[0] + " soles");
        System.out.println("El programa " + nombres[1] + " cuesta " + costos[1] + " soles");
        System.out.println("El programa " + nombres[2] + " cuesta " + costos[2] + " soles");
        System.out.println("El programa " + nombres[3] + " cuesta " + costos[3] + " soles");
        System.out.println("El programa " + nombres[4] + " cuesta " + costos[4] + " soles");
    }
}