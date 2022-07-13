package Lesson12;

public class CurrentDemo {
    public static void main(String[] args) {
        int n=10;
        QueueFullException myVariable = new QueueFullException(n);
        System.out.println(myVariable);
    }
}
