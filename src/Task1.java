import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        /*Задача 1 (вариант 5).
        Написать программу, получающую на вход в качестве аргумента два параметра - числа x и y.
        Если произведение этих чисел больше 50, то вычислить удвоенный корень квадратный первого числа.
        Вывести результат на экран.*/

        double x = 0;
        double y = 0;

        Scanner input = new Scanner(System.in);

        //Ввод данных для x
        System.out.printf("x = ");
        while (true) {
            try {
                x = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Вы ввели не число. Попробуй ещё раз.");
                System.out.printf("x = ");
            }
        }

        //Ввод данных для y
        System.out.printf("y = ");
        while (true) {
            try {
                y = Double.parseDouble(input.nextLine());
                break;
            } catch (NumberFormatException e ) {
                System.out.println("Вы ввели не число. Попробуй ещё раз.");
                System.out.printf("y = ");
            }
        }

        System.out.println(func(x, y));
    }

    public static double func(double x,double y){
        if (x * y > 50) {
            return Math.sqrt(x) * 2;
        } else {
            return x * y;
        }
    }
}