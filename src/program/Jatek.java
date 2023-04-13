package program;

import java.util.Random;

public class Jatek {

    private static final Random rnd = new Random();

    public void start() {
        System.out.println("Gondoltam egy számra, 0..9 között");
        int szam = rnd.nextInt(10);

        /*referenci a játékosokra*/
        Jatekos j1 = new Jatekos();
        Jatekos j2 = new Jatekos();
        Jatekos j3 = new Jatekos();
        boolean talalat;
        boolean joTipp1;
        boolean joTipp2;
        boolean joTipp3;

        do {

            System.out.println("A kitalálandó szám: " + szam);

            /*tippelés*/
            j1.tippel();
            j2.tippel();
            j3.tippel();

            /*tipp elkérés*/
            System.out.println("1. játékos tippje: " + j1.getTipp());
            System.out.println("2. játékos tippje: " + j2.getTipp());
            System.out.println("3. játékos tippje: " + j3.getTipp());

            /* ellenőrzés*/
            joTipp1 = j1.getTipp() == szam;
            joTipp2 = j2.getTipp() == szam;
            joTipp3 = j3.getTipp() == szam;
            talalat = joTipp1 || joTipp2 || joTipp3;
            if (!talalat) {
                System.out.println("a játékosok újra próbálkoznak");
            }
        } while (!talalat);
        
        System.out.println("Van nyertes!");
        
        System.out.println("1. játékos tippje?" + joTipp1);
        System.out.println("2. játékos tippje?" + joTipp2);
        System.out.println("3. játékos tippje?" + joTipp3);
        
        System.out.println("Játék vége!");
    }

}
