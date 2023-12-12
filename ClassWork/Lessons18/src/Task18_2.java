import java.util.ArrayList;

public class Task18_2 {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Andrey");
        list.add("Vadim");
        list.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
