package Homework;

public class Phone {
    static int number;
    String model;
    int weight;

    static void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

     static void getNumber(int number) {
          System.out.println("Номер телефона: " + number);
            }

    Phone (int number, String model, int weight) {
        this(number, model);
        weight = weight;
        System.out.println("Номер iPhone " + number + ", Модель iPhone " + model + " и Вес iPhone " + weight + " грамм.");
    }

    Phone (int number, String model) {
        System.out.println("Номер Samsung " + number + ", Модель Samsung " + model);
    }

    Phone () {
        System.out.println("Телефон Nokia не имеет номера телефона, модель и вес неизвестен.");
    }

    public void receiveCall (String name, int number) {
                System.out.println("Звонит " + name + " с номером телефона " + number);
    }
    public static void sendMessage(int y[]) {
        System.out.print("Количество номеров: " + y.length + " Содержимое: ");
        for (int x : y) {
            System.out.print(x + " ");
        }
        System.out.println();
    }



}
