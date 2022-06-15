package Lesson6;

public class Vehicle {

    int passangers;
    int fuelcap;
    int mpg;

    Vehicle(int numberOfPassengers, int fuelCapVolume, int milesPerGallon) {
        passangers = numberOfPassengers;
        fuelcap = fuelCapVolume;
        mpg = milesPerGallon;

    }

    void range() {
        System.out.println("maximum distance with full fuelcap is " + fuelcap + mpg + "miles");
    }

    void myMethod() {
        int i;
        for (i=0; i<10; i++) {
            if (i==5) return;
            System.out.println("smth");
        }
       }

       int rangeInt() {
        return mpg * fuelcap;
       }

       double fuelNeeded (int distance) {
        return (double) distance / mpg;
       }

}
