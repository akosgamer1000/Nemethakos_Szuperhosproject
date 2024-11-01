package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public class Batman implements Szuperhos,Milliardos{
    private double lelemenyesseg;


    public Batman() {
        this.lelemenyesseg = 100;
    }


    @Override
    public double mekkoraAzEreje() {
        return  lelemenyesseg * 2;
    }
    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }

    @Override
    public boolean legyoziE(Szuperhos z) {
        return z.mekkoraAzEreje() < this.lelemenyesseg;
    }
    @Override
    public String toString() {
        String formattedLelemenyesseg = MessageFormat.format("{0,number,#.##}", lelemenyesseg);
        return "Batman: leleményesség: " + formattedLelemenyesseg;
    }


}
