package Aufgabe2;

import java.util.Random;

public class Zahlenraten {
    int min = 1;
    int max = 10;

    Random rnd = new Random();
    int zufallszahl = rnd.nextInt(max - min + 1) + min;
}