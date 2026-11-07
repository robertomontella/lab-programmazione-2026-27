import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Insersci l'ora di inizio dell'evento (0-23): ");
        int h = in.nextInt();
        System.out.print("Insersci i minuti di inizio dell'evento (0-59): ");
        int m = in.nextInt();

        Orario orarioInizio = new Orario(h,m);

        System.out.print("Inserisci la durata dell'evento in minuti: ");
        int durata = in.nextInt();
        in.close();

        System.out.println("L'evento inizia alle: " + orarioInizio.descrizione());

        Orario orarioFine = new Orario(orarioInizio);

        boolean successo = orarioFine.avanza(durata);
        if(successo){
            System.out.println("L'evento finisce alle: " + orarioFine.descrizione());
        }
        if(orarioInizio.precede(orarioFine)){
            System.out.println("La fine è in un orario precedente all'orario di inizio o in un giorno successivo.");
        }
        else if(durata < 0){
            System.out.println("\nERRORE: La durata non può essere un valore negativo!\n");
        }
    }
}
