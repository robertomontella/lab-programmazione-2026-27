
/*
Segment.java: un segmento del piano, dato dai suoi estremi: due Point2D (la classe di oggi, da copiare nella
cartella homework/ senza modifiche). Costruttore Segment(Point2D a, Point2D b); getA(), getB(); length();
midpoint() crea il punto medio; translate(double dx, double dy) crea il segmento spostato. Per equals il
segmento AB e il segmento BA sono uguali. Il programma di prova riceve le coordinate degli estremi dalla riga di
comando (java ProvaSegment 0 0 3 4) e stampa lunghezza, punto medio e confronto fra AB e BA, con equals e
con ==
*/


public static void main(String[] args) {
    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);

    Point2D A = new Point2D(x1,y1);
    Point2D B = new Point2D(x2,y2);

    Segment AB = new Segment(A, B);
    Segment BA = new Segment(B, A);
 
    System.out.println("Lunghezza: " + AB.length());
    
    Point2D mid = AB.midPoint();
    System.out.println("Punto medio: (" + mid.getX() + ", " + mid.getY() +")");

    System.out.println("Confronto con equals (AB e BA sono uguali?): " + AB.equals(BA));
    System.out.println("Confronto con == (puntano allo stesso oggetto?): " + (AB==BA));
    

   

} 