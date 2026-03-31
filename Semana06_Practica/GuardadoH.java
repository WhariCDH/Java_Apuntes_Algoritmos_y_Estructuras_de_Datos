package Semana06_Practica;
import java.util.ArrayList;
public class GuardadoH {

    public static void main(String[] args) {
        ArrayList<String> anime=new ArrayList<>();

        anime.add("One piece");
        
        System.out.println("Anime en listas para descarga.");
        int i=1;

        for (String descarga : anime){
            System.out.println( +i+ ". Animes por descargar: " +descarga);
            i++;
        }
    System.out.println("Final del listado......");

    }
    
}
