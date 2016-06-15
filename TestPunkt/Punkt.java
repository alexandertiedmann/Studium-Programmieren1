public class Punkt {
  private int x;
  private int y;

  public void setX (int i) {
    x = i;
  }
  public void setY (int i) {
    y = i;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public void verschiebe(int deltaX, int deltaY){
    x = x + deltaX;
    y = y + deltaY;
  }
  public void verschiebeUmEins(int deltaX, int deltaY){
    x = x + deltaX;
    y = y + deltaY;
  }
  public void verschiebeInerhalb(int deltaX, int deltaY){
    if ((deltaX + x <= 10) && (deltaX + x) >= -10 && (deltaY + y <= 10) && (deltaY + y) >= -10){
        x = x + deltaX;
        y = y + deltaY;
    }else {
      System.out.println("Der zu verschiebende Wert muss größer -10 und kleiner 10 sein!");
    }
  }
  public void berechneGeradenGleichung(Punkt punkt){
    //y = mx + n
    if ( ( this.getX() - punkt.getX() ) == 0){
      System.out.println("Eine Division durch null ist nicht möglich.");
      return;
    }
    double m = ((double)this.getY() - (double)punkt.getY()) / (double)(this.getX() - (double)punkt.getX());
    double n = ((double)this.getY() - ( m * (double)this.getX() ));
    System.out.println("Die Gleichung lautet:");
    System.out.printf( "%s%.2f%s%.2f%n", "y = ",m,"x + ",n);
  }
  public void spiegelAnX (Punkt punkt){
    punkt.setY((punkt.getY() * -1));
  }
  public void spiegelAnY (Punkt punkt){
    punkt.setX((punkt.getX() * -1 ));
  }
  public void spiegelAnUrsprung (Punkt punkt){
    punkt.spiegelAnX(punkt);
    punkt.spiegelAnY(punkt);
  }
}