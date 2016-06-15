public class Treppe {

    public static void zeichneTreppe(int h, int b){
        int stufen=b;
        for (int i = 1; i <= h; i++){
            System.out.println(schreibeStufe(stufen));
            stufen=stufen+b;
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
