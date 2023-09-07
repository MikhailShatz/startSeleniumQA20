package oop2;

public class Toyota extends Car {
    private int seats(){
        return 5;
    }

    @Override
    public String voice() {
        return "I am toyota";
    }
}
