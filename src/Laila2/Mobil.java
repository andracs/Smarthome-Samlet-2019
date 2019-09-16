package Laila2;

public class Mobil {

    // variabel tempPass
    String tempPass;

    public String getTempPass() { return tempPass; }

    public void setTempPass() {

        // hvordan laver jeg et random tal? Svar fundet på DZone
        // random genererer et decimaltal (double), for at få et helt tal * med 1 mill
        // og typecaster til int
        int generate = (int) (Math.random()*1000000);

        // hvordan typecaster jeg int til string? Svar fundet på GeeksforGeeks
        this.tempPass = Integer.toString(generate);

    }
}
