/*
Libretto.java: i voti stanno in un int[] private, con una variabile che conta gli elementi in uso.
Costruttore Libretto(int capienza); aggiungi(int voto) restituisce false se il voto non `e fra 18 e
30 o il libretto `e pieno; getQuanti(), il predicato isPieno(), media() e massimo() (0 se vuoto). Nessun
metodo restituisce l’array. Il programma di prova riceve i voti dalla riga di comando (java ProvaLibretto
28 30 17 24) e stampa quanti sono registrati, quanti rifiutati, la media con 2 decimali e il massimo.
*/

public class Libretto{

    private int[] voti;
    private int contatore;
    
    public Libretto(int capienza){
        if(capienza <= 0){
        System.out.println("Capienza errata. Creo un libretto da 10 posti.");
        this.voti = new int[10];
        }
        else {
        this.voti = new int[capienza];
            }
        this.contatore = 0;
    }

    public boolean isPieno(){
        return this.contatore == this.voti.length;
    }

    public boolean aggiungi(int voto){
        if( (voto < 18 || voto > 30)){
        System.out.println("Voto respinto");
        return false;
        }
        if(isPieno()){
            System.out.println("Libretto pieno");
            return false;
        } else {
            this.voti[this.contatore] = voto;
            this.contatore++;
            return true;
        }
    }

    public int getQuanti(){
        return this.contatore;
    }

    public double media(){
        if(this.contatore == 0){
        return 0.0;
        }

        double somma=0;
        for(int i = 0; i < this.contatore; i++){
        somma += this.voti[i];
        }
        return somma/this.contatore;
    }

    public int massimo(){
        int max = 0; 
        for(int i = 0; i < this.contatore; i++){
            if(voti[i] > max){
                max = voti[i];
            }
        }
        return max;
    }

}
