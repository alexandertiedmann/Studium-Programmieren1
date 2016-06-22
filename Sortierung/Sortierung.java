import java.util.Scanner; //Scanner Klasse importieren
public class Sortierung {
  public static void main ( String [] args ) {
    //Initialisierung der Variablen:
    Scanner scan = new Scanner(System.in); //Scanner Klasse für Eingabe
    int x1;
    int x2;
    int x3;
    int zahl1;
    int zahl2;
    int zahl3;
    
    //Eingabe der Zahlen
    System.out.println("Geben Sie eine Zahl ein: ");
    x1 = scan.nextInt();
    System.out.println("Geben Sie eine weitere Zahl ein: ");
    x2 = scan.nextInt();
    System.out.println("Geben Sie eine letzte Zahl ein: ");
    x3 = scan.nextInt();
    
    //Sortierung der Zahlen
    if (x1 < x2) {
      zahl1=x1;
      zahl2=x2;
      if (x3 <= zahl1) {
        zahl1=x3;
        zahl2=x1;
        zahl3=x2;
      }else{
        if (x3 <= zahl2) {
          zahl1=x1;
          zahl2=x3;
          zahl3=x2;
        }else{
          zahl1=x1;
          zahl2=x2;
          zahl3=x3;
        }
      }
    }else{
      zahl1=x2;
      zahl2=x1;
      if (x3 <= zahl1) {
        zahl1=x3;
        zahl2=x2;
        zahl3=x1;
      }else{
        if (x3 <= zahl2) {
          zahl1=x3;
          zahl2=x2;
          zahl3=x1;
        }else{
          zahl1=x2;
          zahl2=x1;
          zahl3=x3;
        }
      }
    }
    System.out.println(zahl1 + " < " + zahl2 + " < " + zahl3);
  }
}