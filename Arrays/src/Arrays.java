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
        text = text.substring(0, text.length() -1 );
        return text;
    }

    public String arrayToString(int[] zahlen){
        //statt einen String zurückzugeben hätte an dieser Stelle auch direkt ausgegeben werden können
        String text = new String();
        for (int i=0; i < zahlen.length; i++){
            text = text + zahlen[i] + ",";
        }
        text = text.substring(0, text.length() -1 );
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
            System.out.println(arrayToString(zw[i]));
        }
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

    /**
     * Die Methode erzeugt ein neues Array mit der Summe der Laengen der ersten beiden
     * und uebernimmt die Werte aus den ersten beiden Arrays.
     * @param zahlen1 wird als erstes in das neue Array uebernommen
     * @param zahlen2 wird als zweites in das neue Array uebernommen
     * @return die zu einem Array verketteten Arrays
     */
    public int[] verkette(int[] zahlen1, int[] zahlen2){
        int[] kettArray = new int[zahlen1.length + zahlen2.length];
        //einsortieren des ersten Arrays in das verkettete Array
        for (int i = 0; i<zahlen1.length; i++ ){
            kettArray[i] = zahlen1[i];
        }
        //einsortieren des zweiten Arrays in das verkettete Array
        int zahl = 0;
        for (int j = zahlen1.length; j < kettArray.length; j++){
            kettArray[j] = zahlen2[zahl];
            zahl++;
        }
        return kettArray;
    }

    /**
     * Der uebergebene Wert wird gesucht und vom letzten  gefundenen
     * Treffer wird die Position im Array angegeben.
     * Ansonsten wird -1 zurueckgegeben
     * @param zahlen zu uebergebenes Array in dem gesucht wird
     * @param suche Zahl nach der gesucht werden soll
     * @return -1 oder Position des Treffers
     */
    public int suche (int[] zahlen, int suche){
        boolean gefunden = false;
        int index=-1;
        for (int i = 0; i < zahlen.length; i++){
            if ( suche == zahlen[i] ) {
                gefunden = true;
                index = i;
            }
        }
        if ( gefunden ) {
            return index;
        }else{
            return -1;
        }
    }

    /**
     * Ein Array wir linear durchsucht und die Position im Array zurueck gegeben
     * Ansonsten -1
     * @param zahlen zu durchsuchendes Array
     * @param suche zu suchende Zahl
     * @return Position der Zahl im Array
     */
    public int linSuche(int[] zahlen, int suche){
        int gefunden = -1;
        int i=0;
        while ( gefunden < 0){
            if ( i >= zahlen.length){
                gefunden = -1;
                break;
            }
            if ( suche == zahlen[i]){
                gefunden = i;
            }
            i++;
        }
        return gefunden;
    }

    /**
     * Ein uebergebenes Array wird mit Hilfe der binaeren Suche
     * und iterativ nach eier bestimmten Zahl durchsucht
     * @param zahlen zu durchsuchendes Array
     * @param suche zu suchende Zahl
     * @return Position der gefundenen Zahl
     */
    public int binSucheIter(int[] zahlen, int suche){
        int gefunden = -1;

        return gefunden;
    }

    /**
     * Ein uebergebenes Array wird mit Hilfe der binaeren Suche
     * nach eier bestimmten Zahl durchsucht
     * @param zahlen zu durchsuchendes Array
     * @param suche zu suchende Zahl
     * @return Position der gefundenen Zahl
     */
    public int binSuche(int[] zahlen, int suche){
        int gefunden = -1;
        
        return gefunden;
    }
}
