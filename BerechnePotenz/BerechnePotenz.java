import java.util.Scanner;
public class BerechnePotenz {
  public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    System.out.print("Bitte geben Sie die Basis ein: ");
    int x = scan.nextInt();
    System.out.print("Bitte geben Sie n ein: ");
    int n = scan.nextInt();
    
    if ( x <= 1) {
      System.out.println("Basis muss größer 1 sein!!! ");
    }else{
      System.out.println("Die " + n + "te Potenz von " + x + " ist " + potenz(x,n));
    }
  } // end of main
  
  private static int potenz(int x, int n){
    if ( n <= 1) {
      return x;
    }
    x = x * potenz(x,n-1);
    return x;
  } //end of potenz
} // end of class BerechnePotenz
