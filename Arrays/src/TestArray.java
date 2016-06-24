public class TestArray {
    public static void main(String[] args) {
        System.out.println("##################double Array##################");
        double[] doubleArray = {1.5,2.7,3.5};
        Arrays ar = new Arrays();
        System.out.println("Umgekehrtes Array: " + ar.ArrayToString(ar.kehreUm(doubleArray)));
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
}
