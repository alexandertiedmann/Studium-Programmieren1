public class EuklidischerAlgorithmus {
  public static void main ( String [] args ) {
    //Initialisierung der Variablen:
    int x = 12;
    int y = 3;
    while (x != y) { 
      if (x < y) {
        y = y - x;
      } else {
        x = x - y;
      } // end of if-else
    } // end of while
    System.out.println( x + " ist größter gemeinsamer Teiler."); //Ausgabe des GgT
  }
}