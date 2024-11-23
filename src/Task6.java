/*Задание 6 (вариант 5).
Выполнить преобразование класса в коллекцию. Создать пользовательское меню.
Организовать добавление объектов в коллекцию и вывод отсортированных объектов
коллекции на экран с помощью меню.*/

public class Task6 {
    public static void main (String[] args) {
        Commodity commodity = new Commodity(1, 1, "Apple", 50, 70,
                "Вкусные яблоки я не могу.");
        System.out.println(commodity.toString());
    }
}
