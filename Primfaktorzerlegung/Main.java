public class Main {
    public static void main(String[] args) {

        int zahl = 60;
        int temp = 2;
        System.out.println("Hi, ich berechne mal kurz die Primfaktorzerlegung für die Zahl " + zahl + " für dich.");
        System.out.println();

        while(zahl >= 2){

            if(isPrim(temp) && zahl%temp == 0){
                zahl = zahl/temp;

                if (zahl <= 1){
                    System.out.print(temp);
                }else{
                    System.out.print(temp + " * ");
                }

                temp = 1;
            }

            temp++;
        }

        System.out.println();

    }

    public static boolean isPrim(int zahl) {

        if (zahl <= 1) {
            return false;
        }

        if(zahl == 2){
            return true;
        }

        if (zahl % 2 == 0) {
            return false;
        }

        int i = 3;
        while (i * i < zahl & zahl % i != 0) {
            i = i + 2;
        }

        if (i * i > zahl) {
            return true;
        } else {
            return false;
        }
    }
    
}
