import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class TaskHome18_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Stream<Integer> integerStream = list.stream()
                .distinct()
                .filter(x -> x % 2 == 0);
        Optional<Integer> count = integerStream.reduce(Integer::sum);
        System.out.println("Сумма элементов Stream: " + count.get());






    }
}