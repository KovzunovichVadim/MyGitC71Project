import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskHome18_2 {
    public static void main(String[] args) {
        Map<Integer,String> idName = new HashMap<>();
        idName.put(1,"Vadim");
        idName.put(2,"Sergey");
        idName.put(3,"Dima");
        idName.put(4,"Vlad");
        idName.put(5,"Anna");
        idName.put(6,"Pasha");
        idName.put(7,"Masha");
        idName.put(8,"Kara");

        HashSet<Integer> number = new HashSet<>();
        number.add(1);
        number.add(2);
        number.add(5);
        number.add(8);
        number.add(9);
        number.add(13);

        List<StringBuilder> list = idName.entrySet().stream()
                .filter(person -> number.contains(person.getKey()))
                .filter(person -> person.getValue().length() % 2 == 0)
                . map(person-> new StringBuilder(person.getValue()).reverse())
                .toList();

        System.out.println(list);
    }
}
