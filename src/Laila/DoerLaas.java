package Laila;

public class DoerLaas {

        // Objektets egenskaber dvs. klassevariabler
        byte laasop; //sekunder
        byte laas; //sekunder
        String noegle1;
        String noegle2;
        String noegle3;
        String gaestekode;
        boolean laasesOp; // true - doeren laases op, false, doeren forbliver laast

        // Gør-ting, dvs. metoder
        public boolean start () {
        //@TODO Brug en brik der laaser doeren op
        System.out.println("Doeren er laast op");
        return true;
    }

        public void stop () {
        //@TODO Lås kun op med gaestekode hvis kode haves
        System.out.println("Doeren laases kun op med kode");

    }

}
