/*
Programm: PruefZahl
Beschreibung:
Prüft ob eine Zahl ein Exponent der Basis ist

Autor: Alexander Tiedmann (556127)
Version: 1.0
*/
import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void PruefZahl(String[] args) {
        Scanner scan = new Scanner (System.in);
        int basis = 0;
        int zahl = 0;

        System.out.print("Bitte Geben Sie eine basis ein: ");
        basis = scan.nextInt();
        System.out.print("Bitte Geben Sie einen Exponenten ein: ");
        zahl = scan.nextInt();

        System.out.println("Basis " + basis + ", Zahl: " + zahl + ", Rückgabe: " + pruef(zahl,basis));
        System.out.println(Math.pow(basis, 1.0/zahl));
            //Math.sqrt(Zahl) Wurzel ziehen
            //Math.pow(Basis, Exponent) Potenzieren
    }

    public static boolean pruef (int zahl, int basis){
        if (zahl == Math.pow(basis, 1.0/zahl)){
            return true;
        }else{
            return false;
        }
    }
}
