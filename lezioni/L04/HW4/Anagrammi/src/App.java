/*
Anagrammi.java: legge due frasi e dice se sono una l’anagramma dell’altra, ignorando spazi,
punteggiatura e maiuscole (“Calendario” e “locandiera” lo sono). Un metodo char[]
lettereOrdinate(String s) crea l’array delle sole lettere, rese minuscole con Character e
ordinate con Arrays.sort; il confronto si fa con Arrays.equals.
*/
import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static char[] lettereOrdinate(String s){
        char conta = 0; 
        for(int i =0; i < s.length(); i++){
           if(Character.isLetter(s.charAt(i))) {
            conta++;
           }
        }
        char[] lettere = new char[conta];
        int indice = 0; 
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                lettere[indice] = Character.toLowerCase(c);
                indice++;
            }
        }
        Arrays.sort(lettere);
        return lettere;
    }


    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("Frase 1: ");
        String s1 = in.nextLine();
        System.out.print("Frase 2: ");
        String s2 = in.nextLine();
        if(Arrays.equals(lettereOrdinate(s1), lettereOrdinate(s2))){ // UNICO METODO PER CONFRONTARE IL CONTENUTO DEI 2 ARRAY
            System.out.println("E' un anagramma");
        } else {
            System.out.println("Non è un anagramma");

        }
        
    }
}
