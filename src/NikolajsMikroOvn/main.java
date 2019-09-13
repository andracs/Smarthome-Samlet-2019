package NikolajsMikroOvn;

public class main {
    public static void main(String[] args) {

        MikroOvn nikolajsOvn = new MikroOvn(); //instansierer et objekt af klassen NikolajsMikroOvn.MikroOvn

        nikolajsOvn.drejeHastighed = -100;
        nikolajsOvn.temperatur = 700;
        nikolajsOvn.ydelse = 300;


        MikroOvn lasseOvn = new MikroOvn();

        lasseOvn.drejeHastighed = 20;
        lasseOvn.temperatur = 150;
        lasseOvn.ydelse = 500;


        System.out.println("Nikolajs own kører med " + nikolajsOvn.drejeHastighed );
        System.out.println("Lasses own kører med " + lasseOvn.drejeHastighed );



        nikolajsOvn.start();
 }
}