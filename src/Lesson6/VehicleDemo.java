package Lesson6;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle mercedes = new Vehicle(5,16,12);
        Vehicle jeep = new Vehicle(7,25,16);


//        mercedes.passangers = 5;
//        mercedes.fuelcap = 16;
//        mercedes.mpg = 21;
//
//        jeep.passangers = 7;
//        jeep.fuelcap = 25;
//        jeep.mpg = 15;

//        int range1 = mercedes.fuelcap * mercedes.mpg;
//        int range2 = jeep.fuelcap * jeep.mpg;
        System.out.println("mercedes can take " + mercedes.passengers + " passengers");
        mercedes.range();
        System.out.println("jeep can take " + jeep.passengers + " passengers" );
        jeep.range();

        jeep.myMethod();

        Vehicle ferrari = mercedes;
        ferrari.passengers = 12;

        System.out.println(mercedes.passengers);

        int howManyMilesJeepCanGo = jeep.rangeInt();
        System.out.println("this one is from method rangeInt: " + howManyMilesJeepCanGo);

        double gallons = jeep.fuelNeeded(700);
        int rangeNeeded = 1400;
        double gallons2 = mercedes.fuelNeeded(rangeNeeded);

        System.out.println("jeep needs " + gallons + "gallons to go for the distance of 700 miles");
        System.out.println("mercedes needs " + gallons2 + "gallons to go for the distance " + rangeNeeded);


    }
}
