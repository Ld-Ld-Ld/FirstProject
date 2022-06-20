package Lesson6;

public class Vehicle {

    int passangers;
    int fuelcap;
    int mpg;

//    eto konstructor:
    Vehicle(int numberOfPassengers, int fuelCapVolume, int milesPerGallon) {
        passangers = numberOfPassengers;
        fuelcap = fuelCapVolume;
        mpg = milesPerGallon;

    }

//    etot metod ni4ego ne prinimaet i ni4ego ne vozvrashaet
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
//    etot metood ni4ego ne prinimaet, no vozvrashet tselo4 znacenia:
       int rangeInt() {
        return mpg * fuelcap;
       }

//       etot metod prinimaet tseloc znacenia i vozvrashet drobnie:
       double fuelNeeded (int distance) {
       return (double) distance / mpg;
       }

}
