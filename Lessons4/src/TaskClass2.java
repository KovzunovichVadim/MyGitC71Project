public class TaskClass2 {
    public static void main(String[] args) {
        //String[] fruits = {"apple","orange","lemon","mango"}; //если известен весь массив
        String[] fruit = new String[4];
        fruit[0] = "apple";
        fruit[1] = "orange";
        fruit[2] = "lemon";
        fruit[3] = "mango";

        System.out.println(fruit[1] + " " + fruit[3]);
        System.out.println(fruit.length);

        fruit[2] = "pear";
        System.out.println(fruit[2]);
    }
}
