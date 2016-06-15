public class Teilbarkeit {
  public static void main(String[] args) {
    int zahl = 100;
    int einer = 0;
    int zehner = 0;
    int hunderter = 0;
    
    while (zahl < 1000) { 
      //zerlegen
      einer = zahl % 10;
      zehner = (zahl / 10) %10;
      hunderter = zahl / 100;
      if (pruefEiner(einer, zahl)){
        if (pruefZehner(zehner, zahl)) {
          if (pruefHunderter(hunderter, zahl)) {
            System.out.println(zahl);
          }
        }
      }
      zahl++;
    }
    System.out.println("FERTIG!");
  }
  
  private static boolean pruefEiner(int einer, int zahl){
    if (einer != 0 && zahl % einer == 0) {
      return true;
    }else{
      return false;
    }
  }
  
  private static boolean pruefZehner(int zehner, int zahl){
    if (zehner != 0 && zahl % zehner == 0) {
      return true;
    }else{
      return false;
    }    
  }
  
  private static boolean pruefHunderter(int hunderter, int zahl){
    if (hunderter != 0 && zahl % hunderter == 0) {
      return true;
    }else{
      return false;
    }    
  }  
} // end of class Teilbarkeit
