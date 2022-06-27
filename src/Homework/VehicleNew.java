package Homework;

public class VehicleNew {

    private int passangers;
    private int fuelcap;
    private int mpg;

//    eto konstructor:

    VehicleNew(int р,  int f,  int  m)  {
        passangers =  р; fuelcap =  f; mpg =  m;
    }

//    etot metod ni4ego ne prinimaet i ni4ego ne vozvrashaet
//    void range() {
//    System.out.println("maximum distance with full fuelcap is " + fuelcap + mpg + "miles");
//    }

    int  range ()  {
        return mpg  *  fuelcap;
    }

    void myMethod() {
        int i;
        for (i=0; i<10; i++) {
            if (i==5) return;
            System.out.println("smth");
        }
    }
    //    etot metood ni4ego ne prinimaet, no vozvrashet tselocisl znacenia:
    int rangeInt() {
        return mpg * fuelcap;
    }

    //       etot metod prinimaet tselocisl znacenia i vozvrashet drobnie:
    double fuelNeeded (int distance) {
        return (double) distance / mpg;
    }

    int  getPassengers() {
        return passangers;
    }

    void setPassengers(int р) {
        passangers = р;
    }

    int getFuelcap () {
        return fuelcap;
    }
    void setFuelcap ( int f){
        fuelcap = f;
    }
    int getMpg () {
        return mpg;
    }
    void setMpg ( int m){
        mpg = m;
    }
}
