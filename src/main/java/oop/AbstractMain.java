package oop;

public class AbstractMain {
    public static void main(String[] args) {
        AbstractExample ae = new AbstractExample() {
            @Override
            public int legsQuantity() {
                return 0;
            }
        };
        DogExtendsAbstract dea = new DogExtendsAbstract();
    }
}
