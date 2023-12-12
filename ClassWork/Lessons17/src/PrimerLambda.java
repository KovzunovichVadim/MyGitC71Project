import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.function.*;

public class PrimerLambda {
    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = (line) -> line.toUpperCase();
        System.out.println(unaryOperator.apply("Hello"));

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(10, 20));

        // Принимает значение и возвращает true или false
        Predicate<String> line = l -> l.startsWith(("A"));
        System.out.println(line.test("Aello"));

        // Принимает но не возвращает
        Consumer<Integer> consumer = number -> System.out.println(number);
        consumer.accept(999);

        /*Supplier<String> supplier = () -> {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter: ");
            return  scanner.nextLine();
        };
        String result = supplier.get();
        System.out.println(result);*/

        // На входе один тип, на выходе другой тип
        Function<String,Integer> function = val ->{
          return Integer.parseInt(val);
        };
        System.out.println(function.apply("23"));

    }
}
