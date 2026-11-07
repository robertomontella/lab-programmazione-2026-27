/*
Rettangolo.java: base e altezza (double), sempre positive. Tre costruttori: senza argomenti (il
rettangolo 1 × 1), con base e altezza (un valore non positivo diventa 1), di copia. Metodi get; metodi set
che restituiscono false, senza modificare nulla, se il valore non `e positivo; area(), perimetro() e il
predicato isQuadrato().
*/


public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza){
        if(base <= 0 || altezza <= 0){
            System.out.println("Misure non valide. Impostate di base a 1");
            this.base = 1.0;
            this.altezza = 1.0;
        }else {
            this.base = base;
            this.altezza = altezza;
        }
    }

    public Rettangolo(){  // se creo un nuovo rettangolo senza parametri imposta di base le dimensioni 1.0 x 1.0
        this(1.0,1.0);
    }

    public double calcolaArea(){
        return this.base * this.altezza;
    }
    
    public double calcolaPerimetro(){
        return 2*(this.base+this.altezza);
    }

    // Il getter serve per "leggere" o restituire il valore della variabile
    public double getBase(){
        return this.base;
    }

    public double getAltezza(){
        return this.altezza;
    }
    // Il setter serve per "scrivere" o modificare il valore assegnato alla variabile
    public void setBase(double base){
        if(base > 0){
            this.base = base;
        } else {
            System.out.println("La base deve essere maggiore di zero.");
        }
    }  

    public void setAltezza(double altezza){
        if(altezza > 0){
            this.altezza = altezza;
        } else {
            System.out.println("L'altezza deve essere maggiore di zero");
        }
    }

    public String toString(){ //Metodo toString per rappresentare l'oggetto come stringa
        return "\nBase = " + base + "\nAltezza = " + altezza + "\nArea = " + calcolaArea() + "\nPerimetro = " + calcolaPerimetro() + "\n";
    }
}
