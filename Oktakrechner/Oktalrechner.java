/*
Programm: Oktalrechner
Beschreibung: 
Wandelt eine Oktalzahl in eine Dezimalzahl um

Autor: Alexander Tiedmann (556127)
Version: 1.0
*/
import java.util.Scanner;
public class Oktalrechner {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Bitte geben Sie ein Oktalzahl ein: ");
    int okt = scan.nextInt(); 
    
    System.out.println(okt + " ist " + wandel(okt) + " in Dezimaler schreibweise");
  }
  
  public static int wandel (int okt){
    int faktor = 1;
    int dez = 0;
    while (okt > 0) { 
      dez = dez + (okt % 10 ) * faktor;
      faktor = faktor*8;
      okt=okt/10;
    } // end of while
    return dez;
  }
}
