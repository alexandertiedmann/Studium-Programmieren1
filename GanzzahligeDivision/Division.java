import java.util.Scanner;
public class Division {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie eine Zahl ein: ");
    double ein1 = scan.nextDouble();
    System.out.print("Bitte geben Sie eine weitere Zahl ein: ");
    double ein2 = scan.nextDouble();
    
    System.out.println("Das Ergebnis von " + ein1 + " und " + ein2 + " beträgt " + integerDivision(ein1,ein2));    
  }
  
  public static int integerDivision (double a,double b){
    int div = (int)a / (int)b;
    return div;    
  }
}
