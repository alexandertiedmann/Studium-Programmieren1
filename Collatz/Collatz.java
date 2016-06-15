/*
Programm: Collatz
Beschreibung: 
Gibt die letzte Zahl der Zahlenfolge
mithilfe des Collatz Problem aus

Autor: Alexander Tiedmann (556127)
Version: 1.0
*/
import java.util.Scanner;
public class Collatz {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie eine Zahl ein: ");
    int ein1 = scan.nextInt();
    int i = 1; //Z�hler (1 da sonst nur die Schritte und nicht die Terme gez�hlt werden)
    System.out.println("Die Folge (iterativ) betraegt " + rechneIterativ(ein1,i));
    System.out.println("Die Folge (rekursiv) betraegt " + rechneRekursiv(ein1,i));
  }
  
  public static int rechneIterativ (int zahl,int i){
    while (zahl > 1) { 
      if ((zahl%2) == 0) {
        zahl = zahl/2;
      }else{
        zahl = 3 * zahl + 1;
      }
      i++;
    }
    return i;
  }
  
  public static int rechneRekursiv (int zahl, int i){
    if (zahl == 1) {
      return i;
    }
    if ((zahl%2) == 0) {
      zahl = zahl/2;
      i++;
      i = rechneRekursiv (zahl,i);
    }else{
      zahl = 3 * zahl + 1;
      i++;
      i = rechneRekursiv (zahl,i);
    }
    return i;
  }
}
