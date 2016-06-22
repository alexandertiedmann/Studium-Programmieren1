import java.util.Scanner;
public class GgT {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie die erste Zahl ein: ");
    int ein1 = scan.nextInt();
    System.out.print("Bitte geben Sie die zweite Zahl ein: ");
    int ein2 = scan.nextInt();
    
    System.out.println("Der größte gemeinsame Teiler ist " + rechne(ein1,ein2));    
  }
  
  public static int rechne (int x, int y){
    if (x == y) {
      return x;
    }else{
      if (x < y) {
        y = y - x;
        y = rechne(x,y);
        return y;
      }else{
        x = x - y;
        x = rechne(x,y);
        return x;
      }
    } 
  }
}
