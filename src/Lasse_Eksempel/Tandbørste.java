package Lasse_Eksempel;

public class Tandbørste {
    static int antalBørstehår = 250; //Static betyder at denne variable vil være ens for alle objekter indenfor denne klasse
    boolean erStartet = false; //Denne variable er en instans som alle objekter selv kan ændre på lokalt men vores Smartkamera.Main Metode kan ikke se eller ændre denne

    void start(){ // En metode som sætter erStartet til true
        erStartet = true;
    }

    public static void main(String[] args) {
        Tandbørste patricksTandbørste = new Tandbørste();
        Tandbørste lisasTandbørste = new Tandbørste();

        patricksTandbørste.erStartet = true;

        patricksTandbørste.start(); //Vi kalder vores metode start

        if (patricksTandbørste.erStartet == true){ //Eksempel på en test case af bool værdien
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }

    }
}
