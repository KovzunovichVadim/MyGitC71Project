import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public class Task15_1 {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>();
        country.add("Belarus");
        country.add("Russia");
        country.add("England");
        System.out.println(country);
        country.set(1,"Germany");
        System.out.println(country);
        country.remove(1);
        System.out.println(country);
        country.remove("England");
        System.out.println(country);
        System.out.println(country.indexOf("Belarus"));
        System.out.println(country.contains("Belarus"));
    }
}
