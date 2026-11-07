public class Main {
    public static void main(String[] args) {
        Rettangolo r1 = new Rettangolo(5.0, 3.0);
        Rettangolo r2 = new Rettangolo(10.0, 2.0);

        System.out.println("Rettangolo 1: " + r1);
        System.out.println("Rettangolo 2: " + r2);

        System.out.printf("Area r1: %.2f\n", r1.calcolaArea());
        System.out.printf("Area r2: %.2f\n", r2.calcolaArea());
    
        r1.setBase(8.0);
        r2.setAltezza(3.0);

        System.out.println("Primo rettangolo: " + r1);
        System.out.println("Secondo rettangolo: " + r2);
    }
}
