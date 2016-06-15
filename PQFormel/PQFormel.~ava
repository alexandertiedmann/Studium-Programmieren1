import java.lang.Math;
public class PQFormel {
  public static void main(String[] args) {
    //2x^2-4x-16=0
    //Variablen
    int a = 2;
    int p = -4;
    int q = -16;
    double x1 = 0;
    double x2 = 0;
    //Ausgabe der ursprünglichen Gleichung
    System.out.println("Ursprünglich: " + a + "x^2 + " + p + "x + " + q + " = 0");
    
    //in die Normalform bringen:
    p = p / a;
    q = q / a; 
    //Ausgabe der Normalform
    System.out.println("Normalform: x^2 + " + p + "x + " + q + " = 0");
    
    //Berechnung für x1 und x2 mit der p-q-Formel
    x1 =  -((double)p/2) +  Math.sqrt(Math.pow(((double)p/2),2)-(double)q);
    x2 =  -((double)p/2) -  Math.sqrt(Math.pow(((double)p/2),2)-(double)q);
    
    //Ergebnisausgabe
    System.out.println("Die Nullstellen sind:");
    System.out.println("x2: " + x1);
    System.out.println("x2: " + x2);
  }
}
