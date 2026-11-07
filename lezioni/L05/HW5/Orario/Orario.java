/*
Orario.java: ore (0–23) e minuti (0–59). Costruttore Orario(int o, int m) (valori fuori intervallo:
00:00) e costruttore di copia; metodi get, nessun set. avanza(int m) sposta l’orario in avanti di m
minuti, anche oltre la mezzanotte (23:50 pi`u 20 minuti d`a 00:10), e restituisce false se m `e negativo; il
predicato precede(Orario altro); descrizione() restituisce una stringa come "09:05". Il programma
di prova legge ora di inizio e durata in minuti di un evento e ne stampa inizio e fine.
*/

public class Orario{

    private int h;
    private int m;

    // COSTRUTTORE ORARIO
    public Orario(int h, int m){
        if((h < 0 || h > 23) || (m < 0 || m > 59)){
            this.h = 0;
            this.m = 0;
        }else {
            this.h = h;
            this.m = m;
        }
    }

    public Orario(Orario altro){
        this.h = altro.h;
        this.m = altro.m;
    }

    // METODI GET
    public int getOre(int h){
        return this.h;
    }
    public int getMinuti(int m){
        return this.m;
    }

    public boolean avanza(int m){
    if(m < 0){
        return false;
        } 
        else {
        int minutiTotali = this.m + m;
        int oreExtra = minutiTotali / 60;
        this.m = minutiTotali % 60; // CALCOLA MINUTI RIMANENTI
        this.h = (this.h + oreExtra) % 24;  //AGGIORNA LE ORE
        return true;   // SEGNALA AL MAIN CHE L'OPERAZIONE è ANDATA A BUON FINE
        }
    }    

    public boolean precede(Orario altro){
    return (altro.h < this.h) || (this.h == altro.h && altro.m < this.m);  //Return true se la condizione è verificata (FORMA COMPATTA)
}

    public String descrizione(){
    return String.format("%02d:%02d", this.h, this.m); /*
    %: segna l'inizio della regola di formattazione per una variabile.   
    0: è il carattere di "riempimento" (padding). Dice a Java: "se il numero è troppo corto, riempi gli spazi vuoti aggiungendo uno zero davanti".
    2: indica la larghezza minima che il numero deve occupare. Come mostrato nelle slide (dove ad esempio %5d impone una larghezza minima di 5 spazi), qui stiamo dicendo che il numero deve occupare almeno 2 caratteri.  
    d: indica che la variabile da stampare è un numero intero 
                                                        */
    }
}

