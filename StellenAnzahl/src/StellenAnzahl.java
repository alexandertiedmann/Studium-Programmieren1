import java.util.Scanner;
public class StellenAnzahl {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine natürliche Zahl an: ");
        int zahl = scan.nextInt();

        System.out.println("Die der Stellen ist: " + bestimmen(zahl));
    }

    public static int bestimmen (int zahl){
        if (zahl <= 0) return 0;
        int x = zahl;
        int i = 1;
        while (x > 9){
            x = x / 10;
            i++;
        }
        return i;
    }
}
