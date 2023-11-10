import java.util.StringJoiner;

public class StringBuilderBuffer {
    public static void main(String[] args) {
        String file = "Some text here";

        StringBuilder sb = new StringBuilder("First line");
        sb.append(" new text");  // добавить
        System.out.println(sb);
        sb.insert(5,"A");
        System.out.println(sb);
        String str = sb.toString();
        System.out.println(str);
        sb.delete(4,6);
        System.out.println(sb);
        sb.deleteCharAt(1);
        System.out.println(sb);


        StringBuffer sbuf = new StringBuffer();
    }
}
