/*
Segment.java: un segmento del piano, dato dai suoi estremi: due Point2D (la classe di oggi, da copiare nella
cartella homework/ senza modifiche). Costruttore Segment(Point2D a, Point2D b); getA(), getB(); length();
midpoint() crea il punto medio; translate(double dx, double dy) crea il segmento spostato. Per equals il
segmento AB e il segmento BA sono uguali. Il programma di prova riceve le coordinate degli estremi dalla riga di
comando (java ProvaSegment 0 0 3 4) e stampa lunghezza, punto medio e confronto fra AB e BA, con equals e
con ==
*/


public class Segment {

    private final Point2D A;
    private final Point2D B;

    //Costruttore segmento
    public Segment(Point2D a, Point2D b){
        this.A = a;  //PUNTO A DI COORD X Y
        this.B = b;  //PUNTO B DI COORD X Y
    }
    public Point2D getA(){
        return A;   //X E Y DI A
    }
    public Point2D getB(){
        return B;  //X E Y DI B
    }
    public double length(){
        return A.distance(B);  //B - A
    }
    public Point2D midPoint(){
        double midX = ((A.getX() + B.getX()) / 2);
        double midY = ((A.getY() + B.getY()) / 2);
        return new Point2D(midX, midY);
    }
    public Segment translate(double dx, double dy){
        return new Segment(A.translate(dx, dy), B.translate(dx, dy));
    }

    public boolean equals(Segment p){
        boolean stessoVerso = A.equals(p.A) && B.equals(p.B);
        boolean versoOpposto = A.equals(p.A) && B.equals(p.B);
        return stessoVerso || versoOpposto;
        }
    public boolean notEqual(Segment s) {
        return !equals(s);

    }
}
    
//IMPLEMENTARE EQUALS E NOT EQUAL

