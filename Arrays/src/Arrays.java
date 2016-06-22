public class Arrays {

    public double[] kehreUm(double[] zahlenArray){
        //ein zweites Array in das die umgedrehten Daten übernommen werden
        double[] rueckArray = new double[zahlenArray.length];
        //Durchgehen und den letzten Wert an die erste Stelle des neuen Arrays schreiben
        for (int i=0; i < zahlenArray.length; i++){
            rueckArray[i] = zahlenArray[zahlenArray.length - i-1];
        }
        return rueckArray;
    }

    public String arrayToString(double[] zahlen){
        //statt einen String zurückzugeben hätte an dieser Stelle auch direkt ausgegeben werden können
        String text = new String();
        for (int i=0; i < zahlen.length; i++){
            text = text + zahlen[i] + ",";
        }
        return text;
    }

    public double mittelwert (double[] zahlen){
        //Die Zahlen des Arrays addieren
        double mitt=0.0;
        for (int i=0; i < zahlen.length;i++){
            mitt = mitt + zahlen[i];
        }
        //Die Summe des Arrays durch die Länge um den Mittelwert zu errechnen
        mitt = mitt / zahlen.length;
        return mitt;
    }

    public int diff (int[] zahlen){
        //Funktionsaufrufe um die kleinste/größte Zahl zu ermitteln
        int groesste = groesste(zahlen);
        int kleinste = kleinste(zahlen);
        return groesste - kleinste;
    }

    public void zdAA(int[] [] zw){
        //zdAA(zweidimensionalesArrayAusgeben)
        //das Arrays in der 2. dimension ausgeben
        //da alle Zahlen gleich viele Stellen haben, hier kein printf
        for (int i=0; i < zw.length;i++){
            System.out.println(intArrayToString(zw[i]));
        }
    }

    public String intArrayToString(int[] zahlen){
        //statt einen String zurückzugeben hätte an dieser Stelle auch direkt ausgegeben werden können
        String text = new String();
        for (int i=0; i < zahlen.length; i++){
            text = text + zahlen[i] + ",";
        }
        return text;
    }

    private int groesste(int[] zahlen) {
        //die erste Zahl des Arrays mit allen anderen Vergleichen
        //und bei Bedarf tauschen
        int zahl = zahlen[0];
        for (int i = 0; i < zahlen.length; i++) {
            if (zahl < zahlen[i]){
                zahl=zahlen[i];
            }
        }
        return zahl;
    }

    private int kleinste(int[] zahlen) {
        //die erste Zahl des Arrays mit allen anderen Vergleichen
        //und bei Bedarf tauschen
        int zahl = zahlen[0];
        for (int i = 0; i < zahlen.length; i++) {
            if (zahl > zahlen[i]){
                zahl=zahlen[i];
            }
        }
        return zahl;
    }
}
