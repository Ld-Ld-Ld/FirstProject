package Homework;


class Truck extends VehicleNew {
    private int cargocap;

    Truck(int passangers, int fuelcap, int mpg, int с)  {
        super (passangers,  fuelcap,  mpg);
        cargocap = с;
    }
    int  getCargo() {
        return cargocap;}

    void putCargo(int с)  {
        cargocap = с;  }

}
