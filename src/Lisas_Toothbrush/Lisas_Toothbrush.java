package Lisas_Toothbrush;

public class Lisas_Toothbrush {

    // EGENSKABER: variabler

    int boersteMaaler; //børstetid, minutter
    int alarmInterval; //pausen, timer
    int batteriMaaling; // mellem 0% og 100%
    static int antalBoersteHaar = 250; //ikke blot en fælles egenskab, men også fælles værdi - fordi den er 'static'

    /* GETTERS OG SETTERS: Når man anvender getters og setters på sine variable giver det NEMT mulighed
   for at lave flere objekter, som har: SAMME egenskaber (variabler), men FORSKELLIGE værdier!
    */

    public int getBoersteMaaler() {
        return boersteMaaler;
    }

    public void setBoersteMaaler(int boersteMaaler) {
        this.boersteMaaler = boersteMaaler;
    }

    public int getAlarmInterval() {
        return alarmInterval;
    }

    public void setAlarmInterval(int alarmInterval) {
        this.alarmInterval = alarmInterval;
    }

    public int getBatteriMaaling() {
        return batteriMaaling;
    }

    public void setBatteriMaaling(int batteriMaaling) {
        this.batteriMaaling = batteriMaaling;
    }

    public static int getAntalBoersteHaar() {
        return antalBoersteHaar;
    }

    public static void setAntalBoersteHaar(int antalBoersteHaar) {
        Tandbørste.antalBoersteHaar = antalBoersteHaar;
    }

    //_______________________________________________________________________

    //METODER: gøre ting

    //Tandbørsten skal være tændt eller slukket
    boolean start() {
        return true;
    }

    boolean erStartet;

    if (erStartet);


    void start(){
        erStartet = true;
    }



}
