/*
Libretto.java: i voti stanno in un int[] private, con una variabile che conta gli elementi in uso.
Costruttore Libretto(int capienza); aggiungi(int voto) restituisce false se il voto non `e fra 18 e
30 o il libretto `e pieno; getQuanti(), il predicato isPieno(), media() e massimo() (0 se vuoto). Nessun
metodo restituisce l’array. Il programma di prova riceve i voti dalla riga di comando (java ProvaLibretto
28 30 17 24) e stampa quanti sono registrati, quanti rifiutati, la media con 2 decimali e il massimo.
*/


public class Main {
    public static void main(String[] args) {
        Libretto libretto = new Libretto(args.length);
        int votiRifiutati = 0;
        for(int i = 0; i < args.length; i++){
            String testoVoto = args[i];
            int votoConvertito = Integer.parseInt(testoVoto);
            boolean accettato = libretto.aggiungi(votoConvertito);
            if (!accettato){
                votiRifiutati++;
            }
        }
        System.out.println("\n--- RISULTATI LIBRETTO ---");
        System.out.println("Voti registrati: " + libretto.getQuanti());
        System.out.println("Voti rifiutati: " + votiRifiutati);
        System.out.printf("Media dei voti: %.2f%n", libretto.media());
        System.out.println("Voto massimo: " + libretto.massimo());
        System.out.println("--------------------------");
    }
}
