import java.util.ArrayList;
import java.util.Scanner;

public class AttoriPrefe {
    ArrayList<String> mieiAttori = new ArrayList<String>();
    public String attore;

    public void addList(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserisci il nome del tuo attore preferito: "); 
        attore = in.nextLine();
        while (!attore.equalsIgnoreCase("stop")){
            mieiAttori.add(attore);
            System.out.println("Inserisci un altro nome di attore, oppure digita 'stop' per finire");
            attore = in.nextLine();
        }
        System.out.println();
        in.close();
        stampaLista();
    }

    public void stampaLista(){
        for(String el : mieiAttori){
            System.out.println(el);
        }
    }
}
