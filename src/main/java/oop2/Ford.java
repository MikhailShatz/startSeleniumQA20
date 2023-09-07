package oop2;

public class Ford extends Car implements IReminder{

     int seats;
     String driverName;

    public Ford(int seats, String driverName) {
        this.seats = seats;
        this.driverName = driverName;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int carNumber(){
        return 182345;
    }

    protected String typeOfCar(){
        return "Sedan";
    }

    private boolean haveSmartScreen(){
        return false;
    }

    @Override
    public String voice() {
        return "I am Ford";
    }

    @Override
    public String daysBeforeCarTest() {
        return "56 days left before car test";
    }
}
