import Auto_set_alarm.Alarm;
import Emil.SmartLock;
import Henrik.Shitster;
import Laila.DoerLaas;
import Lasse_Eksempel.Tandbørste;
import Lisas_Toothbrush.Lisas_Toothbrush;
import Mik.Komfur;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 2019-09-13
 */

public class MainSmartHome {

    public static void main(String[] args) {

        System.out.println("************************************");
        System.out.println("****** Smarthome v. 0.2 2019 *******");
        System.out.println("************************************");
        System.out.println("");
        System.out.println("Utroligt!");
        System.out.println("Alle devices fra klassen samlet i et hjem!");
        System.out.println();

        // Smartalarm demo
        Alarm alarm = new Alarm();
        alarm.setAlarm(1);
        System.out.print("Tokes alarm er sat til ");
        System.out.println(alarm.getAlarm());

        // Smartlock demo
        SmartLock smartLock = new SmartLock();
        smartLock.addToWhitelist("laas1");
        smartLock.attemptUnlock("laas1");
        if (smartLock.isLocked()) {
            System.out.println("Smartlaas er låst.");
        } else {
            System.out.println("Smartlaas er låst op. ");
        }

        // Shitster demo
        Shitster shitster = new Shitster();
        System.out.print("Shitster siger, at lorten er testet, og den er: ");
        shitster.erdensund();

        // DoerLaas demo
        DoerLaas doerLaas = new DoerLaas();
        System.out.print("Besked fra Lailas dørlås: ");
        doerLaas.start();

        // Lasses tandbørste
        Tandbørste tandbørste = new Tandbørste();
        System.out.print("Lasses tandbørste er startet:  ");
        System.out.println(tandbørste.erStartet);

        // Lisas tandbørste
        Lisas_Toothbrush lisasToothbrush = new Lisas_Toothbrush();
        System.out.print("Lisas tandbørste er så meget opladet:  ");
        lisasToothbrush.setBatteriMaaling(23);
        System.out.println(lisasToothbrush.getBatteriMaaling());

        // Miks komfur
        System.out.println("Miks komfur siger følgende: ");
        Komfur komfur = new Komfur();
        komfur.start();
        System.out.println();



        System.out.println("************************************");
        System.out.println("****** Det er godt gået :)   *******");
        System.out.println("************************************");



    }


}
