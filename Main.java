import Unit.*;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Crossbowman cb = new Crossbowman(getName());
        Sniper sniper = new Sniper(getName());
        Monk monk = new Monk(getName());
        Mag mag = new Mag(getName());
        Spearman spearman = new Spearman(getName());
        Outlaw outlaw = new Outlaw(getName());
        Farmer farmer = new Farmer(getName());

        System.out.println(cb.getInfo());
        System.out.println(sniper.getInfo());
        System.out.println(monk.getInfo());
        System.out.println(mag.getInfo());
        System.out.println(spearman.getInfo());
        System.out.println(outlaw.getInfo());
        System.out.println(farmer.getInfo());
        System.out.println("Количество персонажей"+" "+Person.getPrCount());
    }
    private static String getName(){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}
