public class TaskHome11_5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        char letter;
        System.out.println(sb);

        for (int i = 0; i < sb.length(); i += 2) {
            int j = i + 1;
            letter = sb.charAt(i);
            sb.insert(j, letter);
        }

        System.out.println(sb);
    }
}
