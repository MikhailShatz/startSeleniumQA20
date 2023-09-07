package oop2;

public class FordFocus extends Ford{
    double engine;
    int price;

    public FordFocus(int seats, String driverName, double engine, int price) {
        super(seats, driverName);
        this.engine = engine;
        this.price = price;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int ownersQuantity(){
        return 3;
    }

    public int fuel(){
        return 95;
    }

    @Override
    protected String typeOfCar() {
       return "Hatchback";
    }



    @Override
    public String voice() {
        return "I am Ford Focus";
    }
}
