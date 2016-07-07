import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
	    //Aufgabe 12.7
        System.out.println("Aufgabe12.7:");
        int[] unsortArray = {8,5,3,12,7,9,10};
        insertionsort(unsortArray);
        System.out.println(Arrays.toString(unsortArray));
        //Aufgabe 12.8
        System.out.println("Aufgabe12.8:");
        printPascalTriangle();
    }

    /**
     * Gibt ein sortiertes Arrays zurück
     * @param unsortArray unsortiertes Array
     * @return sortiertes Array
     */
    private static int[] insertionsort(int[] unsortArray){
    int value = 0; //Zwischenspeicher für den Wert aus dem Array
    int laenge = unsortArray.length;
    for (int i = 0; i < laenge; i++){
        value = unsortArray[i];
        int j = i-1;
        while (( j > -1) && ( unsortArray[j] > value) ){
            unsortArray[j+1] = unsortArray[j];
            j--;
        }
        unsortArray[j+1] = value;
    }
    return unsortArray;
    }

    /**
     * Aufruf der Berechnung und Ausgabe des Pascalschen Dreiecks
     */
    private static void printPascalTriangle(){
        int lines = 13;
        printTriangle(calcTriangle(lines));
    }

    /**
     * Berechnet das Pascalsche Dreieck für die übergebene Anzahl Zeilen
     * @param lines Anzahl der Zeilen des Dreiecks
     * @return Matrix wo 0en eine leere Stelle markieren
     */
    private static int[][] calcTriangle(int lines){
        int[][] triangle = new int [lines][2*lines+1];
        triangle[0][lines] = 1;
        for (int i = 1; i < triangle.length; i++){
            for (int j = 1; j < 2*lines; j++){
                triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j+1];
            }
        }
        return triangle;
    }

    /**
     * Gibt das Pascalsche Dreieck in formatierter Form aus.
     * Die Formatierung funktioniert bis zu 13 Zeilen, da danach
     * 4-stellige Zahlen auftauchen.
     * @param triangle Matrix (Pascalsches Dreieck)
     */
    private static void printTriangle(int[][] triangle){
        for (int i = 0; i < triangle.length; i++){
            for (int j = 0; j < triangle[i].length; j++){
                if ( triangle[i][j] == 0 ){
                    System.out.printf("%3s "," ");
                }else {
                    System.out.printf("%3d ", triangle[i][j]);
                }
            }
            System.out.println("");
        }
    }
}
