package Laila2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[]  args) throws IOException {

        // Udskriv til terminal "Laila2.Mobil:"
        System.out.println("Laila2.Mobil:");
        // initialisere tempPass
        Mobil tempPass = new Mobil();

        // Udskriv til terminal "Skal der laves en midlertidig kode? J/N"
        System.out.println("Skal der laves en midlertidig kode? J/N");

        // læs fra terminal J/N
        // Hvordan laver jeg et input/readline? Svar fundet Stack Overflow
        BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
        String mobilInput = buffer.readLine();


            // Hvis J generer en ny midlertidg kode - mobil
        if (mobilInput.contentEquals("J") == true)
            tempPass.setTempPass();
            String temp = tempPass.getTempPass();

            // Udskriv til terminal "midlertidig kode: *999999"
            System.out.println(temp);

        // Hvis N eller efter midlertidg kode er udskrevet
        // Udskriv til terminal "Dørlås:"
        System.out.println("Dørlås:");
        Doorlock access = new Doorlock();

        // Udskriv til terminal "Log ind"
        System.out.println("Log ind");

        // Læs kode fra terminal
        String doorLockUser = buffer.readLine();
        String doorLockPass = buffer.readLine();

        //System.out.println(doorLockInput);

        // Tjek om koden er rigtig - doorlock
        boolean validated = access.validate(doorLockUser, doorLockPass, temp);
        System.out.println(validated);
    }
}
