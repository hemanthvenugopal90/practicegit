package CoreJava;

public class Car {

    int mod;
    int wheel;

    public static void main(String[] args) {

        Car a = new Car();
        Car b = new Car();
        Car c = new Car();

        a.mod = 2015;
        a.wheel = 4;

        b.mod = 2016;
        b.wheel = 4;

        c.mod = 2018;
        c.wheel = 4;

        System.out.println(a.mod);
        System.out.println(b.wheel);
        System.out.println(c.mod);

    }

}
