/*Задание 6 (вариант 5).
Выполнить преобразование класса в коллекцию. Создать пользовательское меню.
Организовать добавление объектов в коллекцию и вывод отсортированных объектов
коллекции на экран с помощью меню.*/

import java.util.ArrayList;

public class Task6 {
    public static void main (String[] args) {
        Commodity commodity1 = new Commodity(1, 1, "Apple", 50, 70, "Вкусные яблоки я не могу.");
        Commodity commodity2 = new Commodity(2, 2, "Pear", 150, 270, "Вкусные груши я не могу.");
        Commodity commodity3 = new Commodity(3, 3, "Cherry", 250, 270, "Вкусные вишни я не могу.");
        ArrayList<Commodity> listCommodity = new ArrayList<>();
        listCommodity.add(commodity2);
        listCommodity.add(commodity1);
        listCommodity.add(commodity3);
        sortCommodiry(listCommodity);

        System.out.println(listCommodity);
    }

    public static ArrayList<Commodity> sortCommodiry(ArrayList<Commodity> listCommodity) {
        for (int i = 0; i < listCommodity.size()-1; i++) {

            if (listCommodity.get(i).getId() <= listCommodity.get(i+1).getId()) {
                assert true;
            } else {
                Commodity commodity = listCommodity.get(i+1);
                listCommodity.set(i+1, listCommodity.get(i));
                listCommodity.set(i, commodity);
            }
        }
        return listCommodity;
    }
}
