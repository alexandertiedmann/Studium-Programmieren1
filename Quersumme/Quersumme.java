import java.util.Scanner;
public class Quersumme {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie n ein: ");
    int n = scan.nextInt(); 
    
    System.out.println("Die Quersumme beträgt " + quersumme(n));
  }
  
  public static int quersumme (int n){
    int rest = 11;
    int zahl = n;
    int quer = 0;
    while (zahl > 0 ) { 
      rest = zahl % 10;
      zahl = zahl / 10;
      quer = quer + rest;
    } // end of while
    return quer;
  }
}
