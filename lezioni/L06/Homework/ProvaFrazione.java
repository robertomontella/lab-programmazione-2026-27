package lezioni.L06.Homework;

/*
Il programma di prova legge da tastiera due frazioni 
(quattro interi): se un denominatore è 0 stampa un 
messaggio e termina, altrimenti stampa le due frazioni,
 la somma e il prodotto."
*/


import java.util.Scanner;

public class ProvaFrazione {

    public static void main(String[] args){
        int numA;
        int denA;
        int numB;
        int denB;

        Scanner in = new Scanner(System.in);
        System.out.print("Inserisci numeratore A: ");
        numA = in.nextInt();
        System.out.print("Inserisci denominatore A: ");
        denA = in.nextInt();
        System.out.print("Inserisci numeratore B: ");
        numB = in.nextInt();
        System.out.print("Inserisci denominatore B: ");
        denB = in.nextInt();

        in.close();

        //Caso denominatori = 0
        if (denA == 0 || denB == 0) {
            System.out.println("Errore: il denominatore non può essere zero.");
            return; // Termina l'esecuzione del main
        }

        Frazione A = new Frazione(numA,denA);
        Frazione B = new Frazione(numB,denB);

        System.out.println("Frazione A: " + A.descrizione());
        System.out.println("Frazione B: " + B.descrizione());

        
        System.out.println("Somma: " + A.somma(B));
        System.out.println("Prodotto: " + A.prodotto(B));
        
        
    }
}
