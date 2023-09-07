package oop;

import java.sql.SQLOutput;

public class SecondCastingMain {

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
//        System.out.println(kitty.jumpHigh());
//        System.out.println(kitty.voice());
//        System.out.println(kitty.legsQuantity());
        CatParent catFromKitty = (CatParent) kitty;
        System.out.println("str13 "+catFromKitty.voice());
        System.out.println("str14 "+kitty.voice() + " some " + kitty.some());

        CatParent catParent = new CatParent();
//        System.out.println(catParent.jumpHigh());
//        System.out.println(catParent.voice());
//        System.out.println(catParent.legsQuantity());
       catParent = (Kitty) kitty;
        System.out.println("str21 " + catParent.voice());
        System.out.println("str22 " + kitty.voice() + " some " + kitty.some());

        CatParent newCatParentfromKitty =  kitty;
        System.out.println("str25 " + newCatParentfromKitty.voice());
        System.out.println("str26 " + kitty.voice() + " some " + kitty.some());
        Animals animals = new Animals() {
            @Override
            public int legsQuantity() {
                return 8;
            }
        };

        System.out.println(animals.legsQuantity());
        System.out.println(animals.voice());

        Animals animalsClass = new Animals() {
            int quantity;

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }
            public int someNumber(){
                return 99;
            }

            @Override
            public int legsQuantity() {
                System.out.println(someNumber());
                return 8;
            }

        };
        System.out.println(animalsClass.getClass());
        System.out.println(animalsClass.legsQuantity());


    }
}

