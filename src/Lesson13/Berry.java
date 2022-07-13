package Lesson13;

public class Berry {
    int weight;
    String name;
    String colour;
    boolean isRipe;

    Berry(){
        isRipe=false;
        colour="undefined";
        name="undefined";
        weight=0;
    }

    Berry(String name, boolean isRipe){
        this.name=name;
        this.isRipe=isRipe;
        colour="undefined";
        weight=0;
            }

        public int getWeight(){
        return weight;
        }
        public  void  setWeight(int weight){
        this.weight=weight;
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public boolean isRipe(){
        return isRipe;
    }
    public void setRipe(boolean ripe){
        isRipe=ripe;
    }

    @Override
    public String toString() {
        return "Berry{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", isRipe=" + isRipe +
                '}';
    }
}
