/*
Calcolatrice.java: legge due numeri reali e un operatore (+ - * /) e stampa il risultato con 3
decimali. Un metodo statico per ogni operazione; gestite la divisione per zero con un messaggio.
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner in = new Scanner(System.in);
       System.out.print("Inserisci il primo numero: ");
       double n1 = in.nextDouble();
       System.out.print("Inserisci il secondo numero: ");
       double n2 = in.nextDouble();
       in.nextLine();
       System.out.print("Che operazione vuoi fare? ");
       String op = in.nextLine();
       switch(op){
        case "+":
            System.out.printf("Il risultato dell'operazione %.3f + %.3f è: %.3f\n", n1, n2, n1+n2);            
            break;
        case "-":
            System.out.printf("Il risultato dell'operazione %.3f - %.3f è: %.3f\n", n1, n2, n1-n2);
            break;
        case "*":
            System.out.printf("Il risultato dell'operazione %.3f * %.3f è: %.3f\n", n1, n2, n1*n2);
            break;
        case "/":
            if(n2==0){
                System.out.println("Non puoi dividere per 0.");
                break;
            }
            else{
            System.out.printf("Il risultato dell'operazione %.3f / %.3f è: %.3f\n", n1, n2, n1/n2);
            break;
            }
       }

    }
}
