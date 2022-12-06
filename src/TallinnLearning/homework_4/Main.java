package TallinnLearning.homework_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1.1 Вывести в консоль максимальное и минимальное значения типа int, используя класс Integer
        int max = Integer.MAX_VALUE;
        System.out.println("Максимальное значение типа int: "+ max);
        int min = Integer.MIN_VALUE;
        System.out.println("Минимальное значение типа int: "+ min);

        //1.2 В переменную записать 3х значное натуральное число, вывести в консоль сумму цифр числа
        Scanner in1 = new Scanner(System.in);
        String line1 = "Введите число: ";
        System.out.println(line1);
        int a = in1.nextInt();
        int sum = 0;
        while (a != 0){
            sum += a % 10;
            a /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum);

        //1.3 В переменные x и y записать два натуральных числа, вывести в консоль остаток от деления x и y
        System.out.println("Введите чило x: ");
        int x = in1.nextInt();
        System.out.println("Введите чило y: ");
        int y = in1.nextInt();
        int z = x % y;
        System.out.println("Остаток от деления x на y: " +z);

        rectangle();
    }
    //1.4 Напишите метод, который будет вычислять площадь прямоугольника и выводить результат в консоль, вызовите этот из main
    public static void rectangle () {
        Scanner in1 = new Scanner(System.in);
        System.out.println("Введите сторону а: ");
        int a = in1.nextInt();
        System.out.println("Введите сторону b: ");
        int b = in1.nextInt();
        int rectangleS = a * b;
        System.out.println("Площадь прямоугольника: " +rectangleS);
    }
}


