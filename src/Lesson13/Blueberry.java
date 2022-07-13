package Lesson13;

public class Blueberry extends Berry{
    double sweetness;
    String levelOfVitamins;
    final String n = "blueberry";

    int weight;
    String name;
    String colour;
    boolean isRipe;

    Blueberry() {
//        super(n);
        sweetness = 1.0;
        levelOfVitamins="low";
    }
    Blueberry(String name, boolean isRipe, double sweet, String lOV){
        super(name, isRipe);
        sweetness=sweet;
        levelOfVitamins=lOV;
    }

    @Override
    public String toString() {
        return "Blueberry{" + super.toString()  +
                "sweetness=" + sweetness +
                ", levelOfVitamins='" + levelOfVitamins + '\'' +
                ", n='" + n + '\'' +
                            '}';
    }
}
