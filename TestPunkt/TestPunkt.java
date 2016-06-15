public class TestPunkt {
  public static void main (String[] args){
    Punkt p1 = new Punkt();
    p1.setX(1); p1.setY(2);
    /* Lassen Sie hier die x- und y-Koordinaten von p1 auf der
    Konsole ausgeben, aber in einer Zeile und durch Komma
    getrennt */
    System.out.println("X von Punkt1: " + p1.getX() + "| Y von Punkt1: " + p1.getY());
    
    p1.verschiebe(2,2);
    System.out.println(p1.getX()); //Ausgabe: 3
    System.out.println(p1.getY()); //Ausgabe: 4
    //Verschieben Sie p1 um den Vektor (1,-3)
    p1.verschiebe(1,-3);
    //Lassen Sie die x- und y-Koordinaten von p1 ausgeben
    System.out.println("X von Punkt1: " + p1.getX() + "| Y von Punkt1: " + p1.getY());
    //Erzeugen Sie den zweiten Punkt p2 = (3,5)
    Punkt p2 = new Punkt();
    p2.setX(3);p2.setY(5);
    //Verschieben Sie p2 um den Vektor (0,0)
    p2.verschiebe(0,0);
    //Lassen Sie die x- und y-Koordinaten von p2 ausgeben
    System.out.println("X von Punkt2: " + p2.getX() + "| Y von Punkt2: " + p2.getY());
    //Erzeugen Sie den dritten Punkt p3 = (2,4)
    Punkt p3 = new Punkt();
    p3.setX(2);p3.setY(4);

    //verschiebenInerhalb Tests
    p3.verschiebeInerhalb(5,-5);
    p3.verschiebeInerhalb(-5,-6);
    p3.verschiebeInerhalb(-5,10);
    p3.verschiebeInerhalb(-7,7);
    System.out.println("X:" + p3.getX() + " Y:" + p3.getY());
    p3.verschiebeInerhalb(-1,0);
    p3.verschiebeInerhalb(0,1);
    System.out.println("");
    //BerechneGeradeGleichung Test:
    p2.berechneGeradenGleichung(p3);
    p1.setX(-3);p1.setY(4);
    p3.setX(-3);p3.setY(3);
    p1.berechneGeradenGleichung(p3);
  }
}