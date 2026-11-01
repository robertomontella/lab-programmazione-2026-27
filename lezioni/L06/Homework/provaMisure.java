package lezioni.L06.Homework;
/*
Misure.java: una serie di misure, per esempio le temperature di una giornata, in un double[] private final.
Costruttore Misure(double[] valori), con precondizione di almeno un valore; getQuante(), getValore(int i),
getValori(); media(), massimo(); aggiungi(double v) crea una serie con una misura in pi`u, in coda. Nessun
privacy leak: n´e l’array passato al costruttore n´e quello restituito da getValori devono permettere al client di
modificare la serie. Il programma di prova modifica entrambi gli array e stampa la serie: deve risultare immutata.
*/


public class provaMisure {

    // Metodo per visualizzare gli elementi di un oggetto Misure
    public static void stampaSerie(String etichetta, Misure m) {
        System.out.print(etichetta + ": [");
        for (int i = 0; i < m.getQuante(); i++) {
            System.out.print(m.getValore(i));
            if (i < m.getQuante() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("=== TEST COSTRUTTORE E PRIVACY LEAK IN ENTRATA ===");
        double[] datiIniziali = { 15.0, 20.0, 25.0 };
        Misure m = new Misure(datiIniziali);

        stampaSerie("Serie m iniziale", m);

        // Modifica dell'array del client dopo la creazione
        System.out.println("\n--> Modifico datiIniziali[0] impostandolo a 999.0...");
        datiIniziali[0] = 999.0;

        // Verifica: la serie m NON deve essere cambiata
        stampaSerie("Serie m dopo la modifica di datiIniziali", m);
        if (m.getValore(0) == 15.0) {
            System.out.println("ESITO: OK! Nessun privacy leak dal costruttore.");
        } else {
            System.out.println("ESITO: FALLITO! Privacy leak rilevato nel costruttore.");
        }

        System.out.println("\n=== TEST GETVALORI E PRIVACY LEAK IN USCITA ===");
        double[] arrayEstratto = m.getValori();

        // Modifica della copia ricevuta
        System.out.println("--> Modifico arrayEstratto[0] impostandolo a -100.0...");
        arrayEstratto[0] = -100.0;

        // Verifica: la serie m NON deve essere cambiata
        stampaSerie("Serie m dopo la modifica di arrayEstratto", m);
        if (m.getValore(0) == 15.0) {
            System.out.println("ESITO: OK! Nessun privacy leak dal getter getValori().");
        } else {
            System.out.println("ESITO: FALLITO! Privacy leak rilevato in getValori().");
        }

        System.out.println("\n=== TEST CALCOLI STATISTICI ===");
        System.out.printf("Numero misure: %d%n", m.getQuante());
        System.out.printf("Media: %.2f%n", m.media());
        System.out.printf("Massimo: %.2f%n", m.massimo());

        System.out.println("\n=== TEST METODO AGGIUNGI (IMMUTABILITA') ===");
        Misure mEstesa = m.aggiungi(30.0);

        stampaSerie("Serie m originale (non deve cambiare)", m);
        stampaSerie("Nuova serie mEstesa (con 30.0 in coda)", mEstesa);
        System.out.printf("Nuova media: %.2f%n", mEstesa.media());
        System.out.printf("Nuovo massimo: %.2f%n", mEstesa.massimo());
    }
}

