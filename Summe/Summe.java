/*
Programm: Summe
Beschreibung: 
Berechnet die Summe von 0 bis n

Autor: Alexander Tiedmann (556127)
Version: 1.0
*/
import java.util.Scanner;
public class Summe {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie n ein: ");
    int n = scan.nextInt(); 
    
    System.out.println("Die Summe betr�gt " + (rekursiv(n)) + " (rekursiv) " + iterativ(n) + " (iterativ)");
  }
  
  public static int rekursiv (int n){
    if (n <= 0) {
      return 0;
    }
    return n + rekursiv(n-1);
  }
  
  public static int iterativ (int n){
    int sum = 0;
    for (int i = 0; i <= n ;i++ ) {
      sum =  sum + i;
    } // end of for
    return sum;
  }
}
