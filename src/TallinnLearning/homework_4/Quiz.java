package TallinnLearning.homework_4;

import java.util.Scanner;

public class Quiz {


    public static void main(String[] args) {
        System.out.println("Выберете и напишите правильный вариант ответа:");
        String question1 = "\nСколько цветов на флаге Эстонии?\n2\n3\n4";
        System.out.println(question1);
        Scanner in1 = new Scanner(System.in);
        String answer1 = in1.nextLine();
        int intAnswer1 = Integer.parseInt(answer1);
        if (intAnswer1 == 3) {
            System.out.println("Отлично!");

        } else {
            System.out.println("Неправильный ответ!");
        }
        String question2 = "\nЧто изображено на гербе Эстонии?\nТигры\nЛьвы\nЛеопарды";
        System.out.println(question2);
        Scanner in2 = new Scanner(System.in);
        String answer2 = in2.nextLine();
        if (answer2.equals("Леопарды")) {
            System.out.println("Отлично!");
        } else {
            System.out.println("Неправильный ответ!");
        }
        String question3 = "\nВ каком году Эстония стала независимым государством?\n1918\n1990\n1991";
        System.out.println(question3);
        Scanner in3 = new Scanner(System.in);
        String answer3 = in3.nextLine();
        int intAnswer3 = Integer.parseInt(answer3);
        if (intAnswer3 == 1918) {
            System.out.println("Отлично!");
        } else {
            System.out.println("Неправильный ответ!");
        }
    }
}




