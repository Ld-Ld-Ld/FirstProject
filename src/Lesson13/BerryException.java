package Lesson13;

public class BerryException extends Exception {
    String cause;

    BerryException (String cause){
     this.cause=cause;
        System.out.println("you got BerryException because " + cause );
    }

    @Override
    public String toString() {
        return "Attention! You have got BerryException because " +
                 cause;
    }
}
