import java.util.Scanner;
public class AegyptischerAlgorithmus {
  public static void main ( String [] args ) {
    //Variablen initialisieren
    Scanner scan = new Scanner (System.in);
    
    System.out.println("Geben Sie eine Zahl ein:");
    int zahl1 = scan.nextInt();
    System.out.println("Geben Sie eine weitere Zahl ein:");
    int zahl2 = scan.nextInt();
    int ergebnis = 0;
    
    //Verarbeitung mit dem �gyptischen Algorithmus
    while ( zahl1 > 0 ) {
      if ((zahl1 % 2) != 0) {     //ist die Zahl ungerade?
        ergebnis = ergebnis + zahl2;
      } 
      zahl1 = zahl1 / 2;
      zahl2 = zahl2 * 2;
    }
    
    //Ausgabe
    System.out.println("Das Ergebnis ist: " + ergebnis);
  }
}