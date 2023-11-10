import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello " + "world");
        System.out.println("Hello ".concat("world"));

        System.out.println("ABC".equals("ABC"));
        System.out.println("ABC".equalsIgnoreCase("abc"));

        String text = "Hello world";

        System.out.println(text.substring(2).trim());

        System.out.println(text.length());

        System.out.println(text.charAt(2));

        //System.out.println(String.valueOf());

        System.out.println(text.toUpperCase());

        }


    }

