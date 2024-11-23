import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        /*Задача 3 (вариант 5).
        Определить одномерный массив и заполнить его случайными значениями
        Определить дополнительный массив разрешенных значений.
        Составить массив из элементов исходного массива, имеющих неразрешенные значения.
        Вывести результативный массив на экран;*/

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int FirstLength = 0;
        int SecondLength = 0;

        //Ввод размера 1 массива
        System.out.printf("Введите длинну исходного массива: ");
        while (true) {
            try {
                FirstLength = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Нужно ввести целове число. Попробуй ещё раз.");
                System.out.printf("Введите длинну первого массива: ");
            }
        }

        ArrayList<Integer> OrigArray = new ArrayList<Integer>();

        for (var i = 0; i < FirstLength; i++) {
            OrigArray.add(random.nextInt(1, 10));
        }

        System.out.println("Исходный массив: " + OrigArray);

        //Ввод размера 2 массива
        System.out.printf("Введите длинну для второго массива: ");
        while (true) {
            try {
                SecondLength = Integer.parseInt(input.nextLine());
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Нужно ввести целове число. Попробуй ещё раз.");
                System.out.printf("Введите длинну первого массива: ");
            }
        }

        ArrayList<Integer> ValidArray = new ArrayList<Integer>();

        for (var i = 0; i < SecondLength; i++) {
            ValidArray.add(random.nextInt(1, 10));
        }

        System.out.println("Массив с разрешёнными значениями: " + ValidArray);

        Set<Integer> SetOrigArray = new HashSet<Integer>(OrigArray);
        System.out.println(SetOrigArray);
        Set<Integer> SetValidArray = new HashSet<Integer>(ValidArray);
        System.out.println(SetValidArray);

        SetOrigArray.removeAll(SetValidArray);

        System.out.println(SetOrigArray);

////      Если set не подходит, то ниже преобразование его в массив))
//        List<Integer> ResultList = new ArrayList<Integer>();
//        ResultList.addAll(SetOrigArray);
//        System.out.println(ResultList);
    }
}
