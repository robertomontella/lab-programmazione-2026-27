/*
Acronimo.java: legge una frase e stampa le iniziali delle parole in maiuscolo: “java virtual
machine” JVM. Deve funzionare anche con spazi doppi o ai bordi (trim).
*/

import java.util.Scanner;
public class App {

   
    public static void main(String[] args) {
        System.out.print("Inserisci una frase: ");
        Scanner in = new Scanner(System.in);
        String frase = in.nextLine();
        in.close();
        StringBuilder sb = new StringBuilder();
        String frasePulita = frase.trim();
        for(int i=0; i<frasePulita.length(); i++){
        if(frasePulita.charAt(i) == ' '){
        sb.append(frasePulita.toUpperCase().charAt(i+1));  // Aggiungo iniziale di ogni parola dopo lo spazio alla sb
        }
        else if(i == 0){
        sb.append(frasePulita.toUpperCase().charAt(i));  // Aggiungo la prima lettera della parola 
        }
        }
        for(int i=0; i<sb.length(); i++){  // Elimino spazi dall'acronimo
            if(sb.charAt(i)==' '){
            sb.deleteCharAt(i);
            }
        }
        String acronimo = sb.toString();
        System.out.print(acronimo);
        System.out.print("\n");
    }
}
