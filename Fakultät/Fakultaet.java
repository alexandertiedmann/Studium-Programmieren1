import java.util.Scanner;
public class Fakultaet {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie n ein: ");
    int n = scan.nextInt(); 
    
    System.out.println("n! beträgt " + rekursiv(n) + " (rekursiv) " + iterativ(n) + " (iterativ)");
  }
  
  public static int rekursiv (int n){
    if (n <= 0) {
      return 1;
    }
    return n * rekursiv(n-1);
  }
  
  public static int iterativ (int n){
    int fak = 1;
    for (int i = 1; i <= n ;i++ ) {
      fak =  fak * i;
    } // end of for
    return fak;
  }
}
