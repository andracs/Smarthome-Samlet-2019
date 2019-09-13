package NikolajsMikroOvn;

public class MikroOvn {

    double temperatur; //celsius
    int timer; //ms
    String  funktioner;  //optøgning, varming
    boolean drejeTaellerken; // true = den drejer, false = den drejer ikke
    byte    drejeHastighed; //1..100
    short   ydelse;

    boolean start() {
        // start mikroovnen
        System.out.println("Mikrooven kører.");
        return true;


    }

    void stop() {
        //@todo sluk kontakten mikroovnen
    }


}
