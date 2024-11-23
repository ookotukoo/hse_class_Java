public class Task2 {
    public static void main(String[] args) {
        /*Задача 2 (вариант 5).
        Дано a,b. Найти наибольшее max(a,b) из чисел a и b.
        Найти d:tg(max(a,b))*/

        double a = 5;
        double b = 6;

        double max_var = Math.max(a, b);
        System.out.println("Максимальное число: " + max_var);
        double d = Math.tan(Math.toRadians(max_var));
        System.out.println("d = " + d);
    }
}
