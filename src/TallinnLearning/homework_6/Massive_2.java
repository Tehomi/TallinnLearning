package TallinnLearning.homework_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Massive_2 {
    public static void main(String[] args) {
        //Создать список ArrayList(динамический массив), заполнить строками, вводимыми пользователем через консоль (до 10 штук).
        ArrayList<String> arrList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            arrList.add(scanner.nextLine());
        }
        System.out.println(arrList);
        // Вывести в консоль строку, содержащую заглавную букву
        //for (String item : arrList) {
         //   if (Character.isUpperCase(item.charAt(0))) ;
          //  System.out.println(item);
        }
        //    Найти наименьшую и наибольшую по длине строку в списке

    }






        //    Удалить из списка наименьшую и наибольшую строки
        //    Вывести содержимое списка в консоль


        //System.out.println(arrayList);

