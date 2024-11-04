package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;

public abstract class Bosszuallo implements Szuperhos {
    private double szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo( float szuperero,boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
        this.szuperero = szuperero;
    }

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }
    public  abstract  boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos z) {
        System.out.println("hello2");
        if (z instanceof Bosszuallo) {
            Bosszuallo ellenfel = (Bosszuallo) z;
            if(ellenfel.isVanEGyengesege() && this.szuperero > ellenfel.mekkoraAzEreje()){
                return true;
            }

        } else if (z instanceof Batman) {
            Batman s = (Batman) z;
            System.out.printf("hello");
            if(this.szuperero >= (2 * s.mekkoraAzEreje())){
                return true;
            }

        }
        return false;


    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }
    @Override
    public String toString() {
        String gyengesegSzoveg = vanEGyengesege ? "van gyengesége" : "nincs gyengesége";
        String formattedSzuperero = MessageFormat.format("{0,number,#.##}", szuperero);
        return "Szupererő: " + formattedSzuperero + "; " + gyengesegSzoveg;
    }
}
