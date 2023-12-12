import java.util.LinkedList;

public class Task15_2 {
    public static void main(String[] args) {
        LinkedList<String> country = new LinkedList<>();
        country.addFirst("Belarus");
        country.addFirst("Russia");
        country.addLast("England");
        country.addLast("Germany");
        System.out.println(country);
        country.pollFirst();
        System.out.println(country);
        country.pollLast();
        System.out.println(country);
        System.out.println(country.getFirst());
        System.out.println(country.getLast());
    }

}
