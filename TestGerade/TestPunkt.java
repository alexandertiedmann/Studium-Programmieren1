public class TestPunkt {
  public static void main (String[] args){
    Punkt p1 = new Punkt();
    p1.setX(1); p1.setY(2);

    Punkt p2 = new Punkt();

    Punkt p3 = new Punkt();
    p3.setX(2);p3.setY(4);


    System.out.println("P1 X=" + p1.getX() + " Y=" + p1.getY());
    System.out.println("P2 X=" + p2.getX() + " Y=" + p2.getY());
    System.out.println("P3 X=" + p3.getX() + " Y=" + p3.getY());

    p1.spiegelAnX(p1);
    p2.spiegelAnY(p2);
    p3.spiegelAnUrsprung(p3);

    System.out.println("P1 X=" + p1.getX() + " Y=" + p1.getY());
    System.out.println("P2 X=" + p2.getX() + " Y=" + p2.getY());
    System.out.println("P3 X=" + p3.getX() + " Y=" + p3.getY());

    Gerade g1 = new Gerade(5,3);
    g1.spiegelAnX(g1);
    System.out.println(g1.getGleichung());
    g1.verschiebeGerade(p1);
    System.out.println(g1.getGleichung());
    System.out.println(g1.checkPunkt(p1));
    System.out.println(g1.checkPunkt(p2));
  }
}