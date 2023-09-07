package oop;

public class FirstMain {

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
        System.out.println(kitty.jumpHigh());
        System.out.println(kitty.voice());
        System.out.println(kitty.legsQuantity());

        CatParent catParent = new CatParent();
        System.out.println(catParent.jumpHigh());
        System.out.println(catParent.voice());
        System.out.println(catParent.legsQuantity());

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
                return 6;
            }

        };
        System.out.println(animalsClass.getClass());
        System.out.println(animalsClass.legsQuantity());
       // FirstMan$2
    }
}
