package lezioni.L07.esercizi.Homework.Veicolo;

public class Autobus extends Veicolo {
    private int posti;

    public Autobus(String id, double livelloEnergia, int posti){
        super(id, livelloEnergia);
        this.posti = posti;
    }

    @Override 
    public double calcolaAutonomia(){
        return this.livelloEnergia * 0.1;
    }
}
