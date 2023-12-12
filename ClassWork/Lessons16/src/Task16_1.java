import java.util.HashMap;

public class Task16_1 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(123,4000);
        map.put(124,5000);
        map.put(125,6000);
        map.remove(124);
        map.remove(123,4000);
        map.put(123,4000);
        map.put(124,5000);
        map.put(125,6000);
        System.out.println(map.get(123));
        System.out.println(map.entrySet());
        System.out.println(map.values());
        System.out.println(map.containsValue(5000));


    }
}