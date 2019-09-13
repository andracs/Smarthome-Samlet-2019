package Mik;

public class Komfur {
    // Objektets egenskaber dvs klassevariabler
    byte styrke; //indstilling af varme 1-10
    int timer; //mikrosekunder
    String madRet; //indstillet alt efter typen af mad der laves
    boolean alarm; //true betyder alermen starter når
//setTimer()
    // noter tiden fx 14.54
    //definer x
    //tiden +x fx 1554
    // if loop 15.55 så stop

    //if (sunesOvn.drejehastighed<0){
    //sunesOvn.drejeHastighed = 0;
    //}
    public boolean start() {
        //Tændefunktion til komfuret
        System.out.println(madRet + " er påbegyndt og " + "styrken på kogepladen er " + styrke);
        System.out.println("Tiden er stillet til " + timer/60000 + " minutter");
        return true;
    }

    void stop() {
        //sluk for komfuret
    }
}
