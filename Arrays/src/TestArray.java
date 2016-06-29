public class TestArray {
    public static void main(String[] args) {
        Arrays ar = new Arrays();
        System.out.println("Aufgabe 11.5:");
        aufgabe115(ar);
        System.out.println("Aufgabe 11.6:");
        aufgabe116(ar);
    }
    public static void aufgabe115(Arrays ar){
        int[] intArrayx = {1,2,3,4,5,6,7,8,9,10};
        int test1 = ar.linSuche(intArrayx,5);
        int test2 = ar.linSuche(intArrayx,11);
        if ( test1 == -1 ){
            System.out.println("Element nicht gefunden");
        }else{
            System.out.println(test1);
        }
        if ( test2 == -1 ){
            System.out.println("Element nicht gefunden");
        }else{
            System.out.println(test2);
        }
    }
    public static void aufgabe116(Arrays ar){
        int [] intArray = {2,4,6,8,10,12,14,16};
        aufgabe116Suche(intArray,ar,1);
        aufgabe116Suche(intArray,ar,2);
        aufgabe116Suche(intArray,ar,6);
        aufgabe116Suche(intArray,ar,11);
        aufgabe116Suche(intArray,ar,16);
        aufgabe116Suche(intArray,ar,17);

        aufgabe116Iter(intArray,ar,1);
        aufgabe116Iter(intArray,ar,2);
        aufgabe116Iter(intArray,ar,6);
        aufgabe116Iter(intArray,ar,11);
        aufgabe116Iter(intArray,ar,16);
        aufgabe116Iter(intArray,ar,17);
    }
    private static void aufgabe116Iter(int[] intArray, Arrays ar, int suche){
        int temp = ar.binSucheIter(intArray,suche);
        if ( temp > -1 ){
            System.out.println("Element (" + suche + ") am Index " + temp + " gefunden");
        }else{
            System.out.println("Element (" + suche + ") nicht gefunden!");
        }
    }
    private static void aufgabe116Suche(int[] intArray, Arrays ar, int suche){
        int temp = ar.binSuche(intArray,suche);
        if ( temp > -1 ){
            System.out.println("Element (" + suche + ") am Index " + temp + " gefunden");
        }else{
            System.out.println("Element (" + suche + ") nicht gefunden!");
        }
    }
    public static void aufgabe10(Arrays ar){
        System.out.println("##################double Array##################");
        double[] doubleArray = {1.5,2.7,3.5};
        System.out.println("Umgekehrtes Array: " + ar.arrayToString(ar.kehreUm(doubleArray)));
        System.out.println("Mittelwert des Arrays: " + ar.mittelwert(doubleArray));

        System.out.println("##################int Array##################");
        int[] intArray = {1,2,3,4,5,12,21};
        System.out.println("Differenz groesste und niedriegste: " + ar.diff(intArray));

        System.out.println("##################zweidimensionales Array##################");
        int [][] arrayU = new int [3][];
        arrayU [0] = new int [2];
        arrayU [1] = new int [3];
        arrayU [2] = new int [1];
        arrayU [0][1] = 2;
        arrayU [1][0] = 3;
        arrayU [1][2] = 5;
        arrayU [2][0] = 4;
        ar.zdAA(arrayU);
    }
    public static void aufgabe111(Arrays ar){
        int[] intArray1 = {1,2,3,4,5,12,21};
        int[] intArray2 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("1. Array: " + ar.arrayToString(intArray1));
        System.out.println("2. Array: " + ar.arrayToString(intArray2));
        System.out.println("Verkettetes Array: " + ar.arrayToString(ar.verkette(intArray1,intArray2)));
    }
    public static void aufgabe112(Arrays ar){
        int[] intArrayx = {1,2,3,4,5,6,7,8,9,10};
        aufgabe112(intArrayx,4,ar);
        aufgabe112(intArrayx,11,ar);
    }
    private static void aufgabe112(int[] intArrayx, int zahl,Arrays ar){
        int temp = ar.suche(intArrayx,zahl);
        if ( temp > -1 ){
            System.out.println("Suche " + zahl + ": " + temp);
        }else{
            System.out.println("Element (" + zahl + ") nicht gefunden!");
        }
    }


}
