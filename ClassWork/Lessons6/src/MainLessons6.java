public class MainLessons6 {
    public static void main(String[] args) {
        int i = 10;
        Cactus myFirstObject = new Cactus("Green",10.0,5.5);    //конструктор
        System.out.println(myFirstObject.name);
        myFirstObject.giveWaterToDrink(0.4);    // -> String
    }
}
