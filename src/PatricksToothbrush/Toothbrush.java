package PatricksToothbrush;

public class Toothbrush
{

    // Objektets egenskaber dvs. klassevariabler
    int boersteTimer; //sekunder
    short alarm; // timetæller (12 timers interval)
    int batteriMaaling; // Måler strøm %
    boolean batteriMaalingOkay; // Alt over +10%
    boolean tandboersteAlarm; // Ring ved under 10%
    boolean isStarted = false;

    // Gør-ting dvs. metoder
    boolean start() {// @TODO Tønd en kontakt, som starter tandbørste
        isStarted = true;
        if (alarm < 0) {
            isStarted = false;
        }
        return true;
    }

    void stop() {// @TODO Sluk kontakten, som tænder tandbørste
        if (batteriMaaling < 10) {
            System.out.println("POWER UP!");// @TODO skal alarmere

        } else if (batteriMaalingOkay) {
            System.out.println("GOOD JOB!");
        }
    }

}