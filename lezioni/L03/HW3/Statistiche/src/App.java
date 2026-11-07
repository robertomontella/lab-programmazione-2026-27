/*
Statistiche.java: legge quanti voti si vogliono inserire, li mette in un array e stampa minimo,
massimo, media (2 decimali) e quanti voti sono sopra la media. Un metodo per ogni statistica:
minimo(int[]), massimo(int[]), media(int[]), quantiSopra(int[], double).
*/
import java.util.Scanner;
public class App {
    
    public static int minimo(int[] voti){
        int min=30;
        for(int i=0; i<voti.length; i++){
            if(voti[i] < min){
                min = voti[i];
            }
        }
        return min;
    }

    public static int massimo(int[] voti){
        int max=0;
        for(int i=0; i<voti.length; i++){
            if(voti[i] > max){
                max = voti[i];
            }
        }
        return max;
    }

    public static double media(int[] voti){
        double media=0;
        for(int i=0; i<voti.length; i++){
            media+=voti[i];
        }
        return media/voti.length;
    }

    public static int quantiSopra(int[] voti, double media){
        int quantiSopra=0;
        for(int i=0; i<voti.length; i++){
            if(voti[i] > media){
                quantiSopra++;
            }
        }
        return quantiSopra;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Quanti voti vuoi inserire: ");
        int n = in.nextInt();
        int[] voti = new int[n];
        for(int i=0; i<n; i++){
            System.out.printf("Voto %d:", i+1);
            voti[i] = in.nextInt();
            if(voti[i] < 0 || voti[i] > 30){
                System.out.println("Voto non valido");
                i--;
            }
        }
        in.close();
        System.out.print("Voto Massimo: " + massimo(voti) + "\nVoto Minimo: " + minimo(voti) + "\nMedia: " + media(voti) + "\nNumero voti sopra la media: " + quantiSopra(voti, media(voti)) + "\n");
    }
}
 