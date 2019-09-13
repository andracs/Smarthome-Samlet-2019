package SmartPillow;

public class SmartPillow {
    //smart pillow egenskaber
    double temperatur; // bestemmer tempatur
    byte vækkeurTime; //time værdi fra 0 - 24
    short vækkeurMinut; // minut værdi fra 0 - 60
    boolean massage; //massage funktion for puden
    boolean hård; //hård funktion for puden
    boolean blød; //blød funktion for puden


    boolean start() {
        //bruges til at starte puden
        return true;
    }

    void stop() {
        //bruges til at slukke for puden
    }
}