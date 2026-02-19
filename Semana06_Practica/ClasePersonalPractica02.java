package Semana06_Practica;
import java.util.ArrayList;

public class ClasePersonalPractica02 {
    public static void main(String[] args) {
        ArrayList<String> nefumar=new ArrayList<>();

            nefumar.add("Girasol");
            nefumar.add("Gisante");
            nefumar.add("Nefumar");
            nefumar.add("Chile");
            nefumar.add("Nuez");

            System.out.println("El orden de las plantas de PVZ que mas me gusta son: ");

        int i=1;
        for (String puesto : nefumar){
            System.out.println("El puesto " +i+ " es para la planta: " +puesto);
            i++;
        }



        }
    }
    