package hu.petrik.szuperhosprojekt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Kepregeny {
    public static ArrayList< Szuperhos> szuperhosLista;
    public static void szereplok(String filepath) throws IOException {
        Scanner scanner = new Scanner(new File(filepath));

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(" ");

            if (split[0].equals("Vasember")) {
                Vasember u = new Vasember();
                for (int i = 0; i < Integer.parseInt(split[1]); i++) {
                    u.kutyutKeszit();
                }
                szuperhosLista.add(u);
            } else if (split[0].equals("Batman")) {
                Batman u = new Batman();
                for (int i = 0; i < Integer.parseInt(split[1]); i++) {
                    u.kutyutKeszit();
                }
                szuperhosLista.add(u);
            }
        }
    }
    public static void szuperhosok(){
        for(Szuperhos s : szuperhosLista){
            System.out.println(s.toString());
        }
    }

}
