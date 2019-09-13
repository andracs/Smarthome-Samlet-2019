package SmartPillow;

public class Main {
    public static void main(String[] args) {
        System.out.println("smarthome dummy test 2");

        SmartPillow kelvinPillow = new SmartPillow();//Instantier af objekt Smart Pillow

        kelvinPillow.start(); //puden starter sine funktioner

        kelvinPillow.temperatur = 16; //temperaturen sættes til 16 clesius
        kelvinPillow.vækkeurTime = 8; //timeren er 8 timer
        kelvinPillow.vækkeurMinut = 480; // timeren er 480 minutter
        kelvinPillow.massage = true;
        kelvinPillow.hård = true;
        kelvinPillow.blød = true;
        if (kelvinPillow.massage = true); //massage funktionen startes
            else {kelvinPillow.hård = false;} //puden slukker for sin hård funktion
        if (kelvinPillow.massage = true); //massage funktionen starter
            else {kelvinPillow.blød = false;} //puden slukker for sin blød funktion
        if (kelvinPillow.hård = true); //puden bliver mere hård
            else {kelvinPillow.blød = false;} //puden bliver mindre blød
        if (kelvinPillow.blød = true); //puden bliver mere blød
            else {kelvinPillow.hård = false;} //puden bliver mindre hård


        // ideen er at puden skal kunne skift ved at starte en funktion og slukke ved de andre.
        kelvinPillow.stop(); //puden stopper sine funktioner

        SmartPillow emilPillow = new SmartPillow();

        emilPillow.start(); //puden starter sine funktioner

        emilPillow.temperatur = 16;
        emilPillow.vækkeurTime = 8;
        emilPillow.vækkeurMinut = 480;

        emilPillow.stop(); //puden stopper sine funktioner

        SmartPillow andersPillow = new SmartPillow();

        andersPillow.start(); //puden starter sine funktioner

        andersPillow.temperatur = 16;
        andersPillow.vækkeurTime = 8;
        andersPillow.vækkeurMinut = 480;

        andersPillow.stop(); //puden stopper sine funktioner

        System.out.println("Kelvin's pudealarm aktiverer om " +kelvinPillow.vækkeurTime + " og " + kelvinPillow.vækkeurMinut );
        System.out.println("Emil's pudealarm aktiverer om " +emilPillow.vækkeurTime + " og " + emilPillow.vækkeurMinut );
        System.out.println("Anderses pudealarm aktiverer om " +andersPillow.vækkeurTime + " og " + andersPillow.vækkeurMinut );
    }

}
