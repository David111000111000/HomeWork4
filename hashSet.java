import java.util.*;

public class HashSet {
    public static void main(String[] args) {
        // создание объекта HashSet
        HashSet<String> veh = new HashSet<String>();

        // добавление элементов в HashSet
        veh.add("Мотоцикл");
        veh.add("Автомобиль");
        veh.add("Велосипед");
        veh.add("Автобус");         
        veh.add("Такси");

        // размер HashSet
        System.out.println("Размер HashSet: " + veh.size());

        // удаление элемента
        veh.remove("Такси");

        // проверка наличия элемента
        System.out.println("Есть ли \"Автомобиль\"? " + veh.contains("Автомобиль"));

        // итерирование по элементам HashSet
        System.out.println("Все элементы в HashSet:");
        Iterator<String> itr = veh.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // удаление всех элементов из HashSet
        veh.clear();

        // проверка, что HashSet пустой
        System.out.println("HashSet пустой? " + veh.isEmpty());
    }
}
//Надеюсь всё легально!)
