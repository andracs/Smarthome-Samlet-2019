package Smartkamera;

import java.util.Scanner;
//Sunes smartkamrea
public class Smartkamera {

    double dato; // viser tid og dato
    String retning; //viser retning (n,v,s etc
    long latandlong; //viser longandlat
    int pivot; //rotererkameraret.
    double tid;


    boolean start () {
        System.out.println("Starter optag");
        return true;
    } //starteroptag

    boolean stopoptag () {
        System.out.println("optag stoppede");
        return false;
    } //stoperoptag



}
