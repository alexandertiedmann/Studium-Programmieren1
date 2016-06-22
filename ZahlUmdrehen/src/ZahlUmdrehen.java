import java.util.Scanner;
public class ZahlUmdrehen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bitte geben Sie eine natürliche Zahl an: ");
        int zahl = scan.nextInt();

        System.out.println("Die umgedrehte natürliche Zahl ist: " + umdrehen(zahl));
    }

    public static int umdrehen (int zahl){
        String ziffern = new String("" + zahl);
        System.out.println(ziffern);
        String zahlen = new String("");
        for (int i = 0; i < ziffern.length() ; i++){
            zahlen = zahlen + ziffern.charAt(((ziffern.length())-i));
        }
        System.out.println(zahlen);
        return zahl;
    }
}
