package Lesson13;

public class Strawberry extends Berry {
    private double sweetness;

    final static String n = "strawberry";

    Strawberry() {
        super();
        sweetness = 1.0;
    }

    Strawberry(boolean isRipe, double sweet) {
            super(n, isRipe);
            sweetness=sweet;
        }

    @Override
    public String toString() {
        return "\nStrawberry{" +
                "sweetness=" + sweetness +
                '}';
    }

    public  double getSweetness(){
        return sweetness;
    }

    public void setSweetness (double sweetness) throws BerryException{
        if (sweetness>0 & isRipe() & sweetness>10) this.sweetness = sweetness;
        else {
            throw new BerryException("Sweetness level not ele");
        }
    }

    public void setRipe(boolean ripe){
        super.setRipe(ripe);
        if (isRipe()) sweetness = 2.0;
    }
}

