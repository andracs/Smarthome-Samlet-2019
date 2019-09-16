package PatricksToothbrush;

public class Main {
    public static void main(String[] args) {

        System.out.println("Tandbørste mod ringe hygiejne");

        Toothbrush lisasTandboerste = new Toothbrush(); //Instantiere et objekt af klassen Tandbørste
        lisasTandboerste.boersteTimer = 120;
        lisasTandboerste.alarm = 12;
        lisasTandboerste.batteriMaaling = 10;

        Toothbrush patricksTandboerste = new Toothbrush(); //Instantiere Lisas tandbørste objekt of klassen Tandbørste
        patricksTandboerste.boersteTimer = 140;
        patricksTandboerste.alarm = 10;
        patricksTandboerste.batteriMaaling = 20;

        System.out.println("Lisa er færdig med tandbørsting om" + lisasTandboerste.boersteTimer + "sekunder");
        System.out.println("Lisa skal børste tænder om" + lisasTandboerste.alarm + "timer");
        System.out.println("Lisa din tandbørste har" + lisasTandboerste.batteriMaaling + "% strøm tilbage");

        System.out.println("  ");

        System.out.println("Patrick er færdig med tandbørsting om" + patricksTandboerste.boersteTimer + "sekunder");
        System.out.println("Patrick skal børste tænder om" + patricksTandboerste.alarm + "timer");
        System.out.println("Patrick din tandbørste har" + patricksTandboerste.batteriMaaling + " " + "% strøm tilbage");

        patricksTandboerste.start();
        lisasTandboerste.start();

        if (patricksTandboerste.isStarted == true) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");


        }
    }
}