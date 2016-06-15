
public class BerechnePi {
  
  public static void main(String[] args) {
    final double DURCH = 1000.0; // Anzahl der Durchläufe
    
    System.out.println(calculatePi(DURCH));
  }

  private static double calculatePi(double DURCH){
    double pi = 4.0;
    double z = 1.0;
    double zahl = 3.0;
    
    for (double i = 0.0; i <= 999.0 ; i++ ) {
      if (z % 2.0 != 0.0) {
        pi = pi - (4.0 / zahl);
      }else{
        pi = pi + (4.0 / zahl);
      }
      zahl = zahl + 2.0;
      z++;
    }    
    return pi;
  }

} 