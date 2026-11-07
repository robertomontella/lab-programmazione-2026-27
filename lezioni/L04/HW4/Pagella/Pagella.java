/*
Pagella.java: i voti arrivano dalla riga di comando (java Pagella 28 30 24 27 30 18). Un
metodo int[] inInteri(String[] testi) li converte con Integer.parseInt; il programma
stampa i voti, i voti ordinati (su una copia), la media con 2 decimali, la mediana, la media
arrotondata all’intero e la base di laurea in 110-esimi. Usate il modulo Statistiche di oggi senza
modificarlo: copiatelo nella cartella homework
*/

import java.util.Arrays;

public class Pagella {

    public static int[] inInteri(String[] testi){
    int[] voti = new int[testi.length];
    for(int i = 0; i < testi.length; i++){
        voti[i] = Integer.parseInt(testi[i]);
    }
    return voti;
}
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("Devi usare: java Pagella.java voto1 voto2 ...");
            return;
        }
        int[] voti = inInteri(args);
       
        System.out.println("Voti: " + Arrays.toString(voti)); //Stampa  voti
        
        int[] votiOrdinati = Arrays.copyOf(voti, voti.length);
        Arrays.sort(votiOrdinati);  //Voti ordinati
        System.out.println("Ordinati: " + Arrays.toString(votiOrdinati)); //Stampa voti ordinati
        
        double media = Statistiche.media(voti);
        double mediana = Statistiche.mediana(votiOrdinati);

        System.out.printf("\nMedia: %.2f", media);
        System.out.print("\nMediana: " + mediana);
        System.out.print("\nMedia Arrotondata: " + Math.round(media));
        double baseDiLaurea = media * 110/30;
        System.out.printf("\nBase di laurea:" + Math.round(baseDiLaurea));
    }

}

