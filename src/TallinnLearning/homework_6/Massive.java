package TallinnLearning.homework_6;

import java.util.ArrayList;

public class Massive {
    public static void main(String[] args) {

        //1.1 Создать массив Array из 10 элементов, заполнить массив случайными числами используя псевдорандом из Math.
        int[] array1 = new int[10];
        ArrayList<Integer> array2 = new ArrayList<>(); // создание динамического массива

        for (int i = 0; i < 10; i++) {
            array1[i] = (int) (Math.random() * 100) + 1;
            if (array1[i] % 2 == 0 && array1[i] != 0) {
                array2.add(array1[i]); // чётные числа
            }
            System.out.printf(array1[i] + " ");
        }
        //Найти наименьшее и наибольшее число в массиве
        int smallest = array1[0];
        int largest = array1[0];
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] > smallest)
                largest = array1[i];
        }
        System.out.printf("\nНаименьшее чило: " + smallest);
        System.out.println("\nНаибольшее чило: " + largest);

        // Сумма чисел
        int sum = 0;
        for (int j : array1) {
            sum = sum + j;
        }
        System.out.println("Cумма чисел в массиве: " + sum);

        System.out.println(array2); //вывод массива с чётными числами
    }




        // String intAString = Arrays.toString(Array1);
        // System.out.printf(intAString);

        //Найти наименьшее и наибольшее число в массиве
        //System.out.println(Arrays.stream(array).max());
        //System.out.println(Arrays.stream(array).min());
        //System.out.println(result / array.length);

    }
