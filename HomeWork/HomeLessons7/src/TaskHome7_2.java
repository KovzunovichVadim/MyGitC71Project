import java.lang.reflect.Field;

public class TaskHome7_2 {
    public static void main(String[] args) {
        Apple apple = new Apple();
        String color = null;

        try {
            Field field = apple.getClass().getDeclaredField("color");
            field.setAccessible(true);
            color = (String) field.get(apple);
            System.out.println(color);
            field.set(apple,(String)"Green");
            color = (String) field.get(apple);
            System.out.println(color);
        } catch (NoSuchFieldException | IllegalAccessException e){
            e.printStackTrace();
        }


    }
}
