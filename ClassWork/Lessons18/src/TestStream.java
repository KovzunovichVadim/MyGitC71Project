import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class TestStream {
    public static void main(String[] args) {
        // Создание стрим из массива
        int[] array = new int[100];
        Arrays.stream(array);

        // Создание стримов из своих объектов
        Stream.of(new User("Dima"), new User("Vadim"));

        // Создание стрим из коллекции
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(-25);
        list.add(25);
        list.add(35);
        // Фильтр - filter
        list.stream()
                .filter(number -> number > 0)
                .forEach(number -> System.out.println(number));

        // Пропустить - skip
        // Удаление дубликатов - distinct
        // Пропуск элементов - limit
        // Сортировка sorted
        // Возращает но не изменяет peek
        // Преобразование элемента map
        ArrayList <String> list2 = new ArrayList<>();
        list2.add("Andrey");
        list2.add("Vadim");
        list2.add("Anton");
        list2.add("Anton");
        list2.stream()
                .distinct()
                .skip(1)
                .limit(2)
                .sorted()
                .peek(name -> System.out.println("FROM STREAM " + name))
                .map(String::toUpperCase)
                .flatMap(name -> Arrays.stream(name.split("N")))
                .forEach(System.out::println);
        System.out.println(list2);
    }
}
