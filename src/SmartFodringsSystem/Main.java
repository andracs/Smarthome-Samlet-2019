package SmartFodringsSystem;

public class Main {
    public static void main(String[] args) {
        FodringsSystem rex = new FodringsSystem(); //Instansierer et objekt af klassen Fodringssystem
        rex.portionsstoerrelse = 20;
        rex.tid = "17:00";

        System.out.println("Klokken er " + rex.tid + " og fodringssystemet er startet.");
        rex.start();
    }
}
