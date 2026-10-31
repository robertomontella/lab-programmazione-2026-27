package lezioni.L06.Homework;
/*
Misure.java: una serie di misure, per esempio le temperature di una giornata, in un double[] private final.
Costruttore Misure(double[] valori), con precondizione di almeno un valore; getQuante(), getValore(int i),
getValori(); media(), massimo(); aggiungi(double v) crea una serie con una misura in pi`u, in coda. Nessun
privacy leak: n´e l’array passato al costruttore n´e quello restituito da getValori devono permettere al client di
modificare la serie. Il programma di prova modifica entrambi gli array e stampa la serie: deve risultare immutata.
*/

import java.util.Arrays;

public class Misure {
 
    private final double[] valori;

    public Misure(double[] valori){
        if(valori.length == 0 || valori == null) { // alloca direttamente nello heap un nuovo array di double di lunghezza 1 contenente il singolo valore 0.0.
            this.valori = new double[]{0.0};
        }else{
            this.valori = Arrays.copyOf(valori, valori.length);  // copia dell'array per gestire il privacy leak
        }
    }

    public int getQuante(){
        return this.valori.length;
    }

    public double getValore(int i){
        return this.valori[i];
    }

    public double[] getValori(){
        return Arrays.copyOf(valori, valori.length);  // restituiamo una copia dell'array interno per evitare privacy leak
    }

    public double media(){
        double somma = 0;
        for(double v : this.valori){ //forEach
            somma += v;  // v è una copia di valori[i]
        }
        return somma / this.valori.length;
    }

    public double massimo(){
        double max = this.valori[0];
        for (double v : this.valori) {
            if(max < v){
                max = v;
            }
        }
        return max;
    }

    public Misure aggiungi(double v){
    // Alloca un nuovo array con una casella in più copiando i valori attuali
    double[] esteso = Arrays.copyOf(this.valori, this.valori.length + 1);
     //Inserisce il nuovo valore nell'ultima posizione libera
    esteso[esteso.length - 1] = v;
    //Crea e restituisce la nuova istanza di Misure
    return new Misure(esteso);
    }


}


