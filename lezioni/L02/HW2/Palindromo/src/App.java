/*
Palindromo.java: legge una frase e dice se `e palindroma ignorando spazi, maiuscole e
punteggiatura (“I topi non avevano nipoti” lo `e). Un metodo soloLettere(String) che
costruisce con StringBuilder la versione “pulita”, poi la logica di AnalisiParola.
*/
import java.util.Scanner;

public class App {

    public static String soloLettere(String frase){ // metodo che elimina spazi e punteggiatura
    StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<frase.length(); i++){
        if(frase.charAt(i) != ' '){
        sb.append(frase.charAt(i));
        }
    }
    return sb.toString();
    }

    public static String invertiStringa(String frasePulita){ // metodo che inverte la stringa
    StringBuilder sb = new StringBuilder(frasePulita);
    return sb.reverse().toString();
    }

    public static boolean AnalisiParola(String frase, String frasePulita){ // metodo che confronta le due stringhe
    if(frase.equalsIgnoreCase(frasePulita)){
        return true;
    }
    else {
        return false;
    }
    }
    

    public static void main(String[] args) {
    System.out.print("Inserisci una frase: ");
    Scanner in = new Scanner(System.in);
    String frase = in.nextLine();
    in.close();
    String frasePulita = soloLettere(frase);
    String fraseInvertita = invertiStringa(frasePulita); 
    if(AnalisiParola(fraseInvertita, frasePulita)){
        System.out.println("La frase è un palindromo");
    }
    else {
        System.out.println("La frase non è un palindromo");
    }
    }
}

