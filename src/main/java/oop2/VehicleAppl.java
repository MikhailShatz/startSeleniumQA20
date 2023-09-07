package oop2;

public class VehicleAppl {
    public static void main(String[] args) {
        Vehicle v = new Vehicle() {
            public int carNumber(){
                return 847164;
            }
            @Override
            public int doors() {
                System.out.println(carNumber());
                return 4;
            }
        };

        System.out.println(v.doors());


        Car c = new Car();
        System.out.println("str 20 " +c.doors());
        System.out.println("str 21 " +c.voice());

        Toyota t = new Toyota();
        System.out.println("str 24 "+t.doors());
        System.out.println("str 25 "+t.voice());

        Metronit m = new Metronit();
        System.out.println("str 28 "+m.doors());
        System.out.println("str 29 "+m.voice());
    }
}
