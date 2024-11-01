package hu.petrik.szuperhosprojekt;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
            try {
                Kepregeny.szereplok("szuperhos.txt");
            } catch (IOException e) {
                System.out.println("hibas fajlnev");
            }
    }
}