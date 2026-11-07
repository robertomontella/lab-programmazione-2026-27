/*
ContaCaratteri.java: legge una frase (nextLine) e stampa quante vocali, consonanti, cifre,
spazi e altri caratteri contiene, pi`u il numero (approssimato) di parole. Un metodo static
boolean per ogni categoria: isVocale(char), isLettera(char), isCifra(char).
Suggerimento: c >= ’a’ && c <= ’z’.
*/



import java.util.Scanner;

public class App {

public static boolean isVocale(char c) {
     if ("aeiouAEIOU".indexOf(c) >= 0)
         { return true; }
     else
        { return false; } 
    }

public static boolean isLettera(char c)  {
 if(c>='a' && c<='z') return true;
 else return false;
}

public static boolean isCifra(char c) {
if(c>='0' && c<='9') return true;
else return false;

}
    public static void main(String[] args) {
    System.out.println("Inserisci una frase: ");
    Scanner in = new Scanner(System.in);
    String frase = in.nextLine();
    in.close();
    int Vocals=0;
    int Cons=0;
    int Cifre=0;    
    int Spazi=0;
       for(int i=0; i<frase.length(); i++){
        
        if(isVocale(frase.charAt(i))) {
            Vocals++;
            }
        else if(isLettera(frase.charAt(i))){
            Cons++;
        }
        else if(frase.charAt(i)==' '){
            Spazi++;
        }
        else if(isCifra(frase.charAt(i))){
            Cifre++;
        }
       }
    System.out.printf("Vocali: %d\nConsonanti: %d\nCifre: %d\nSpazi: %d\nParole: %d\n", Vocals, Cons, Cifre, Spazi,Spazi+1);
    }
}
