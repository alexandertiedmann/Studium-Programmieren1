public class TreppeOO {
    private int anzahlStufen;
    private int breite;

    public TreppeOO(int a, int b){
        anzahlStufen = a;
        breite = b;
    }

    public void zeichneTreppeOO(){
        int stufen = this.breite;
        for (int i = 1; i <= this.anzahlStufen; i++){
            System.out.println(schreibeStufe(stufen));
            stufen=stufen+this.breite;
        }
    }

    private static String schreibeStufe(int anzahl){
        String stufe = new String ("");
        for (int i = 1; i <= anzahl; i++){
            stufe = stufe + "* ";
        }
        return stufe;
    }
}
