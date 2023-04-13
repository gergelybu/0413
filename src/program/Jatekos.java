package program;

import java.util.Random;

public class Jatekos {

    private static final Random rnd = new Random();
    
    private int tipp;

    /*beállítja a privát adattagot, setter*/
    public void tippel() {
        tipp = rnd.nextInt(10);
        System.out.println("tippelésem: " + tipp);
    }
    /*getter: private adattagra public getter*/
    public int getTipp(){
        return tipp;
    }

}
