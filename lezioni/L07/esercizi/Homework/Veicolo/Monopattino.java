package lezioni.L07.esercizi.Homework.Veicolo;

public class Monopattino extends Veicolo {
    private double voltaggioBatteria;

    public Monopattino(String id, double livelloEnergia, double voltaggioBatteria){
        super(id, livelloEnergia); // Delega alla classe Veicolo di ricavare id e livelloEnergia
        this.voltaggioBatteria = voltaggioBatteria;
    }
    @Override 
    // Questa etichetta dice a Java che si sta intenzionalmente modificando un metodo ereditato
    public double calcolaAutonomia(){
        return this.livelloEnergia * 0.5;
    }
}
