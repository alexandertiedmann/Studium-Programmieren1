import java.util.Scanner;
public class Kreisumfang {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie die den Radius ein: ");
    double ein1 = scan.nextDouble();
    final double PI=3.14159265359;
    
    System.out.println("Der Kreiumfang betr�gt " + rechne(ein1,PI));    
  }
  
  public static double rechne (double rad,double PI){
    double um = 2 * PI * rad;
    return um;    
  }
}
