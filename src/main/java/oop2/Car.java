package oop2;

public class Car implements Vehicle{
    @Override
    public int doors() {
        return 4;
    }

    @Override
    public String voice() {
      return "I am car";
    }
}
