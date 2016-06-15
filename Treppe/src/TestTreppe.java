public class TestTreppe {
    public static void main(String[] args) {
        System.out.println("Static-Treppe:");
        Treppe.zeichneTreppe(10,3);
        System.out.println("OO-Treppe");
        TreppeOO treppe1 = new TreppeOO(7,4);
        treppe1.zeichneTreppeOO();
    }
}
