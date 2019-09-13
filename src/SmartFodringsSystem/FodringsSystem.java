package SmartFodringsSystem;

public class FodringsSystem {
    //Objektets egenskaber dvs. klassevariabler
    String tid; //klokken
    int portionsstoerrelse; //gram

    //Handlinger dvs. metoder
    boolean start(){
        System.out.println("Katten har fået " + portionsstoerrelse + "g mad");
        return true;
    }
    boolean stop(){
        System.out.println("Afventer næste fodringstidspunkt");
        return true;
    }
}
