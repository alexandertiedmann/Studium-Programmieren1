public class Digitsum {
  public static void main(String[] args) {
    final int MAX = 1000; 
    final int QUER = 15;
    final int VIEL = 7;
    
    System.out.println("Folgende Zahlen haben die Quersumme 15: " + summquer(MAX,QUER));
    System.out.println("Die Folgenden Zahlen haben eine Quersumme mit einem Vielfachen von 7: " + sumviel(MAX,VIEL));
    
  }
  
  public static int calculateDigitsum (int n){
    int rest = 11;
    int zahl = n;
    int quer = 0;
    while (zahl > 0 ) { 
      rest = zahl % 10;
      zahl = zahl / 10;
      quer = quer + rest;
    }
    return quer;
  }
  
  public static String summquer(int max,int quer){
    String zahlen = "";
    for (int i = 0;i <= max ;i++ ) {
      if ( calculateDigitsum(i) == 15 ) {
        zahlen = i + ", " + zahlen;
      }
    }
    return zahlen;
  }
  
  public static String sumviel(int max,int viel){
    String zahlen = "";
    for (int i = 0;i <= max ;i++ ) {   
      if ( ((calculateDigitsum(i)) % 7) == 0 ) { 
        if ((calculateDigitsum(i) != 0)) {
          zahlen = i + ", " + zahlen;
        }
      }  
    }
    return zahlen;
  }
}        