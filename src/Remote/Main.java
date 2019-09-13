package Remote;

public class Main {
    public static void main(String[] args){
        Remote tv1 = new Remote();
        tv1.tv = true;
        tv1.start();
        // for at slukke slukke mit tv skal dette tilføjes i denne linje(tv1.tv = false;)
        if (tv1.tv) {
            System.out.println("tv'et er nu tændt");
        } else {
            System.out.println("tv'et er slukket");
        }
        tv1.tv = false;
        Remote termostat = new Remote();
        // her fortæller jeg hvor varmt det er og personen vil så have mulighed for at ændre tempuratur.
        System.out.println("Dit indeklima er " + termostat.termostat + " grader");
    }
}
