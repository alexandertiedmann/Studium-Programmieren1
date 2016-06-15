public class Funktion {
  public static void main ( String [] args ) {
    int x = 25;
    int y = 5;
    if( istGanzzahligTeilbar (x , y ) ) {
      System.out.println ( x + " ist ganzzahlig teilbar durch " + y ) ;
    } else {
      System.out.println ( x + " ist nicht ganzzahlig teilbar durch " + y ) ;
    }
  }
  public static boolean istGanzzahligTeilbar (int x , int y ) {
    if( x % y == 0) {
      return true ;
    } else {
      return false ;
    }
  }
}