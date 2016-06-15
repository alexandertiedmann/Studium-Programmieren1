/*
Programm: FindePrim
Beschreibung: 
Findet und summiert alle
Primzahlen von 1 bis 100

Autor: Alexander Tiedmann (556127)
Version: 1.0
*/
public class FindePrim {
  public static void main(String[] args) {
    int max = 100;
    int min = 2; //da 1 keine Primzahl
    int sum = 0;
    int anz = 0;
    
    for (int i = min; i <= max; i++ ) {
      int zahl = 2;
      
      //Erhöhe zahl solange, wie i nicht durch zahl teilbar
      //und i noch nicht erreicht
      while (i % zahl != 0 && zahl <= i / 2) { 
        zahl = zahl + 1;
      } // end of while
      
      //falls Schleife bis i/2 gelaufen ist
      if (zahl >= i / 2 + 1 && i != 1) {
        //System.out.println(i);
        sum = sum + i; 
        anz = anz + 1;                                                                         
      }
    } // end of for
    
    //Ausgabe der Summe der Primzahlen
    System.out.println(sum);
    System.out.println(anz);
  }
}
