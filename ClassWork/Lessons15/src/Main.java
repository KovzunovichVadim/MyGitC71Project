import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();   // в основе массив

        list.add("Hello");
        list.add(" world");
        list.add("!!!");
        System.out.println(list);

        //Добавление
        list.add(1, "TEST");
        System.out.println(list);
        list.set(1, "NEW_VALUE");
        System.out.println(list);

        // Проверка на пустоту
        System.out.println(list.isEmpty());

        //Проверка содержится ли
        System.out.println(list.contains("NEW_VALUE"));

        //Удаление
        System.out.println(list.remove(1));
        System.out.println(list);
        System.out.println(list.remove("!!!"));
        System.out.println(list);

        System.out.println(list.size());

        System.out.println(list.indexOf(" world"));

        // Удаление всех элементов
        //list.clear();

        System.out.println(list.get(1));



        String[] array = list.toArray(new String[list.size()]);

        List<String> newList = list.subList(1,2);

        list.sort(Comparator.comparing(String::length));
    }
}