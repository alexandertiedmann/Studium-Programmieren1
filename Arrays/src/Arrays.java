public class Arrays {

    public double[] kehreUm(double[] zahlenArray){
        double[] rueckArray = new double[zahlenArray.length];
        for (int i=0; i < zahlenArray.length; i++){
            rueckArray[i] = zahlenArray[zahlenArray.length - i-1];
        }
        return rueckArray;
    }

    public String arrayToString(double[] zahlen){
        String text = new String();
        for (int i=0; i < zahlen.length; i++){
            text = text + zahlen[i] + ",";
        }
        return text;
    }

    public double mittelwert (double[] zahlen){
        double mitt=0.0;
        double tmp=0.0;
        for (int i=0; i < zahlen.length;i++){
            mitt = mitt + zahlen[i];
        }
        mitt = mitt / zahlen.length;
        return mitt;
    }

    public int diff (int[] zahlen){
        int groesste = groesste(zahlen);
        int kleinste = kleinste(zahlen);
        return groesste - kleinste;
    }

    public void zdAA(int[] [] zw){
        for (int i=0; i < zw.length;i++){
            System.out.println(intArrayToString(zw[i]));
        }
    }

    public String intArrayToString(int[] zahlen){
        String text = new String();
        for (int i=0; i < zahlen.length; i++){
            text = text + zahlen[i] + ",";
        }
        return text;
    }

    private int groesste(int[] zahlen) {
        int zahl = zahlen[0];
        for (int i = 0; i < zahlen.length; i++) {
            if (zahl < zahlen[i]){
                zahl=zahlen[i];
            }
        }
        return zahl;
    }

    private int kleinste(int[] zahlen) {
        int zahl = zahlen[0];
        for (int i = 0; i < zahlen.length; i++) {
            if (zahl > zahlen[i]){
                zahl=zahlen[i];
            }
        }
        return zahl;
    }
}
