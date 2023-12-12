import java.util.ArrayList;
import java.util.Arrays;

public class TaskHome15_2 {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.addAnimals("Cat");
        animals.addAnimals("Dog");
        animals.addAnimals("Monkey");
        System.out.println(animals.printAnimals());
        animals.deleteAnimals();
        System.out.println(animals.printAnimals());
    }
}