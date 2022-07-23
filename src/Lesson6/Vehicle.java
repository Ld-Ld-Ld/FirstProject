package Lesson6;

public class Vehicle {

    public int passengers;
    private int fuelcap;
    private int mpg;

    //    eto konstructor:
    Vehicle(int numberOfPassengers, int fuelCapVolume, int milesPerGallon) {
        passengers = numberOfPassengers;
        fuelcap = fuelCapVolume;
        mpg = milesPerGallon;

    }

    //    etot metod ni4ego ne prinimaet i ni4ego ne vozvrashaet
    void range() {
        System.out.println("maximum distance with full fuelcap is " + fuelcap + mpg + "miles");
    }


    //    etot metood ni4ego ne prinimaet, no vozvrashet tselocisl znacenia:
    int rangeInt() {
        return mpg * fuelcap;
    }

    //       etot metod prinimaet tselocisl znacenia i vozvrashet drobnie:
    double fuelNeeded (int distance) {
        return (double) distance / mpg;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

}


