package Lesson6;

public class CheckNumber {
    boolean isEven (int x) {
        if ((x%2)==0) return true;
        else return false;

    }

    boolean isDivider (int candidateToDivider, int number) {
        if ((number % candidateToDivider)==0) return true;
        else return false;
    }
}
