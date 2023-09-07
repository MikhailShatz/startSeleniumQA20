package oop3;

import oop2.Ford;
import oop2.FordFocus;

public class SecondMain {
    public static void main(String[] args) {
        Ford f = new Ford(4, "Valera");
        System.out.println(f.carNumber());
        System.out.println(f.voice());
        System.out.println(f.getDriverName());
        System.out.println(f.getSeats());
        System.out.println(f.carNumber());
        System.out.println(f.doors());

        FordFocus ff = new FordFocus(5, "Miron", 1.3, 500000);
        System.out.println(ff.getPrice());
        System.out.println(ff.getEngine());
        System.out.println(ff.ownersQuantity());
        System.out.println(ff.carNumber());
        System.out.println(ff.getEngine());
        System.out.println(ff.getPrice());
        System.out.println(ff.getDriverName());

        Ford fordFromFocus = (Ford) ff;
        System.out.println(fordFromFocus.voice());
        System.out.println(ff.voice());

    }
}
