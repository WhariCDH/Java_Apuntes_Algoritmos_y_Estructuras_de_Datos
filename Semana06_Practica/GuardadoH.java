package Semana06_Practica;
import java.util.ArrayList;

public class GuardadoH {

    public static void main(String[] args) {
        ArrayList<String> Hentay=new ArrayList<>();

        Hentay.add("True B");

        System.out.println("Anime Hentay en listas para descarga.");
        int i=1;

        for (String descarga : Hentay){
            System.out.println( +i+ ". Hentay por descargar: " +descarga);
            i++;
        }



    }
    
}
