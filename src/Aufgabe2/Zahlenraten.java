package Aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten {
    int min = 1;
    int max = 10;

    Random rnd = new Random();
    int zufallszahl = rnd.nextInt(max - min + 1) + min;

    /*Erzeugen einer Zufallszahl zwischen 1 und 10
         Der Standardweg dafür ist wie folgt:
         Zur Verfügung stellen:
            -min Mindestwert
            -max Maximalwert
          und erhalten im Gegenzug eine ganze Zahl zwischen min und max inklusive
     */

    {
        if ((zufallszahl % 2) == 0) {            // Zahl ist gerade
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade!");

        } else {                                // Zahl ist ungerade
            JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade!");
        }
    }
}
