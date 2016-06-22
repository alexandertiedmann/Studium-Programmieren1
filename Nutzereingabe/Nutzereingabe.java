import java.util.Scanner;
public class Nutzereingabe {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie die erste Zahl ein: ");
    int ein1 = scan.nextInt();
    System.out.print("Bitte geben Sie die zweite Zahl ein: ");
    int ein2 = scan.nextInt();
    
    System.out.println("Die Summe der beiden Zahlen ist " + summe(ein1,ein2));    
  }
  
  public static int summe (int zahl1,int zahl2){
    int aus = zahl1 + zahl2;
    return aus; 
  }
}
