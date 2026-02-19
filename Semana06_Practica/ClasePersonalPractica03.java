package Semana06_Practica;
import java.util.ArrayList;

//For nos ayuda a que la lista se mande ordenadamente 1 en 1 en este caso 

public class ClasePersonalPractica03 {
    public static void main(String[] args) {
        ArrayList<String> PersonajeDeGT=new ArrayList<>();

        PersonajeDeGT.add("Marina");
        PersonajeDeGT.add("Veronica");
        PersonajeDeGT.add("Morrian");
        PersonajeDeGT.add("Anna");
        PersonajeDeGT.add("Eva");
        PersonajeDeGT.add("Angie");
        PersonajeDeGT.add("Dohwa");
        PersonajeDeGT.add("Paimon");
        PersonajeDeGT.add("Mawina Collab");

        System.out.println("Top personajes de GT que me gustan en diseño: ");
     
        int i=1;
        for (String Puesto : PersonajeDeGT) {
            System.out.println("El puesto " +i+ " es para: " +Puesto);
            i++;

        }
    }
}
