/*
Istogramma.java: legge n cifre (da 0 a 9) in un array e stampa, per ogni cifra, quante volte
compare, con una riga di asterischi. Un metodo int[] contaCifre(int[] dati) che restituisce
un array di 10 conteggi (il valore letto diventa un indice) e un metodo stampaIstogramma(int[]
conteggi).
*/

import java.util.Scanner;

public class App {

    /**
     * Conta quante volte compare ciascuna cifra (da 0 a 9) nell'array dati.
     */
    public static int[] contaCifre(int[] dati) {
       
        int[] conteggi = new int[10];

        // Ciclo for-each: scorre direttamente ciascun valore presente nell'array "dati".
        // A ogni giro, la variabile "valore" contiene il numero reale, non la posizione/indice.
        for (int valore : dati) {
            // Controllo difensivo per assicurarsi che il valore sia valido come indice (0-9)
            if (valore >= 0 && valore <= 9) {
                // TRUCCO CHIAVE: il valore stesso fa da indice nell'array dei conteggi.
                // Es: se valore == 3, incrementiamo di 1 la cella conteggi[3].
                conteggi[valore]++;
            }
        }

        // Restituisce l'array con le frequenze calcolate
        return conteggi;
    }

    /*
     * Stampa a video l'istogramma orizzontale usando gli asterischi.
     */
    public static void stampaIstogramma(int[] conteggi) {
        System.out.println("Istogrammi:");

        // CICLO ESTERNO: scorre le cifre da 0 a 9 (gli indici dell'array conteggi).
        for (int i = 0; i < conteggi.length; i++) {
            // Stampa l'etichetta della riga (es. "0: ", "1: ", ...) senza andare a capo
            System.out.print(i + ": ");

            // CICLO INTERNO: stampa tanti asterischi quant'è il valore di conteggi[i].
            // Se conteggi[i] vale 0, la condizione (j < 0) è subito falsa e il ciclo salta.
            for (int j = 0; j < conteggi[i]; j++) {
                System.out.print("*");
            }

            // Stampa a fine riga il conteggio numerico tra parentesi e va a capo (\n)
            System.out.println(" (" + conteggi[i] + ")");
        } 
    }

    public static void main(String[] args) {
        // Apertura dello Scanner per la lettura da tastiera (System.in)
        Scanner in = new Scanner(System.in);

        // 1. Chiediamo all'utente la quantità totale di cifre da inserire
        System.out.print("Quante cifre vuoi inserire (0-9): ");
        int n = in.nextInt();

        // Alloca l'array che conterrà le n cifre
        int[] dati = new int[n];

        // 2. Lettura e validazione dei dati di input
        for (int i = 0; i < n; i++) {
            System.out.printf("Cifra %d: ", i + 1);
            dati[i] = in.nextInt();

            // Controllo di validità: la cifra deve essere compresa tra 0 e 9
            if (dati[i] < 0 || dati[i] > 9) {
                System.out.println("La cifra deve essere compresa tra 0 e 9.");
                // TRUCCO: decrementiamo i per "annullare" il giro del ciclo corrente.
                // Al successivo giro (i++), l'indice punterà di nuovo alla stessa posizione,
                // costringendo l'utente a reinserire la cifra non valida.
                i--;
            }
        }  

        // 3. Elaborazione e Stampa:
        // - contaCifre(dati) genera l'array con i conteggi delle cifre
        // - stampaIstogramma(...) riceve il risultato e disegna le barre di asterischi
        stampaIstogramma(contaCifre(dati));

        in.close();
    }
}