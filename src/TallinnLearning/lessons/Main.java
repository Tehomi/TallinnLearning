package TallinnLearning.lessons;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! \u2764\u2764\u2764");
        System.out.println("Hello world!");
        System.out.println("Hello world!");
        String line = "Введите число: ";
        System.out.println(line);
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        Integer intNumber = Integer.parseInt(number);
        if (intNumber == 5){
            System.out.println(intNumber + intNumber);
        } else {
            System.out.println("Error!");
        }
    }
}