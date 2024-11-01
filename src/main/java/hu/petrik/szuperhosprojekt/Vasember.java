package hu.petrik.szuperhosprojekt;

import java.text.MessageFormat;
import java.util.Random;

public class Vasember  extends Bosszuallo  implements  Milliardos{
    public Vasember() {
        super(150, true);
    }

    @Override
    public boolean megmentiAVilagot() {
        if(this.mekkoraAzEreje()>1000){
            return true;
        }
        return false;
    }

    @Override
    public void kutyutKeszit() {
        Random rand = new Random();
        this.setSzuperero(this.getSzuperero()+ rand.nextDouble(0,10));

    }
    @Override
    public String toString() {
        String gyengesegSzoveg = isVanEGyengesege() ? "van gyengesége" : "nincs gyengesége";
        String formattedSzuperero = MessageFormat.format("{0,number,#.##}", getSzuperero());
        return "Vasember: Szupererő: " + formattedSzuperero + "; " + gyengesegSzoveg;
    }
}
