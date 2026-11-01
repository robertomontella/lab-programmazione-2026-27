package lezioni.L07.esercizi.Homework.Veicolo;

public class Flotta {
    public static void main(String[] args) {
        Veicolo[] flotta = new Veicolo[2];
        flotta[0] = new Monopattino("M1", 100.0, 36.0);
        flotta[1] = new Autobus("A1", 200.0, 50);

        for (Veicolo v : flotta) {
            System.out.println(v.id + ": Autonomia: " + v.calcolaAutonomia() + " km");
        }
        //Polimorfismo : La capacità di un oggetto di identificarsi con più tipi di dato
    }
}
