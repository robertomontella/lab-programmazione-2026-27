package lezioni.L06.Homework;
/*
Frazione.java: numeratore e denominatore int, sempre ridotti ai minimi termini e con il denominatore positivo
(6/−8 diventa−3/4). Costruttori Frazione(int num, int den), con precondizione den diverso da 0, e
Frazione(int n), la frazione n/1; getNum(), getDen(); somma(Frazione f) e prodotto(Frazione f) creano una
nuova frazione; valore() restituisce il double corrispondente; descrizione() una stringa come "-3/4". Il massimo
comune divisore lo calcola un metodo private static. Due costanti di classe: ZERO e UNO. Il programma di prova
legge da tastiera due frazioni (quattro interi): se un denominatore `e 0 stampa un messaggio e termina, altrimenti
stampa le due frazioni, la somma e il prodotto.
*/

public class Frazione {
    //Dichiarazione private per rispettare l'incapsulamento (information hiding) quindi i campi vengono protetti dall'accesso esterno, final per l'immutabilità
    private final int num;
    private final int den;


    //Costanti di classe ZERO e UNO
    //Per essere costanti devono essere visibili a tutti, appartenere alla classe stessa e essere final
    public static final Frazione ZERO = new Frazione(0,1);
    public static final Frazione UNO = new Frazione (1,1);


    //Metodo per calcolare MCD (algoritmo di euclide)
    private static int mcd(int a, int b){
        while(b != 0){
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }

    //Costruttore principale per la frazione
    public Frazione(int num, int den){
        // Caso denominatore = 0
        if(den == 0){
            System.out.println("Il denominatore non può essere 0");
            this.den = 1;
            this.num = 0;
            return;
        } 
        // Caso denominatore < 0
        if(den < 0) {
            num = -num;
            den = -den;
        }   
        // Caso generale
        //Math.abs = valore assoluto
        int d = mcd(Math.abs(num),den);
        this.num = num / d;
        this.den = den / d;
    }
    
    //Crea n/1 riusando il primo costruttore (frazione con solo numeratore)
    public Frazione(int n){
        this(n,1);
    }

    //Metodi getter
    public int getNum(){
        return this.num;
    }
    public int getDen(){
        return this.den;
    }

    //metodo somma: nuovo denominatore = prodotto tra i 2 den, nuovo numeratore = moltiplicazioni a incrocio e somma
    public Frazione somma(Frazione f){
        int newDen = this.den * f.den;
        int newNum = (f.den * this.num) + (this.den * f.num);
        return new Frazione(newNum, newDen);
    }

    //metodo prodotto = prodotto num * num e den * den
    public Frazione prodotto(Frazione f){
        int newDen = this.den * f.den;
        int newNum = this.num * f.num;
        return new Frazione(newNum, newDen);
    }

    //Metodo valore: restituisce la divisione con decimali
    public double valore(){
        //bisogna usare il cast (double) per eseguire la divisione reale tra gli interi
        return (double)this.num/this.den;
    }

    //Metodo descrizione: se den = 1 restituisce solo numeratore invece per frazione restituisce num/den
    public String descrizione(){
        if(den == 1){
            return "" + this.num;
        }
        else {
            return  this.num + "/" + this.den;
        }
    }

    //Metodo equals: restituisce true se num e den delle 2 frazioni sono uguali
    public boolean equals(Frazione f){
        return this.num == f.num && this.den == f.den;
    }

    //Metodo notEqual: negazione di equals
    public boolean notEqual(Frazione f){
        return !equals(f);
    }

}