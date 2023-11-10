public class Task11_2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello world");
        str.append("xxx");
        System.out.println(str);
        str.insert(6,"y");
        System.out.println(str);
        str.delete(2,7);
        System.out.println(str);
        str.reverse();
        System.out.println(str);
        str.toString();
        System.out.println(str);
    }
}
