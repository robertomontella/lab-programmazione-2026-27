package lezioni.L07.esercizi.Homework.Veicolo;

public abstract class Veicolo { // abstract impedisce all'utente di creare nuovi veicoli con new
        // Si usa protected per creare una variabile accessbile in tutta la classe e alle classi figlie (extends)
        protected String id;
        protected double livelloEnergia;

        public Veicolo(String id, double livelloEnergia){
                this.id = id;
                this.livelloEnergia = livelloEnergia;
        }
        public abstract double calcolaAutonomia(); // firma senza corpo terminata da ; che impone l'obbligo di implementazione a chiunque erediterà la classe.
}
