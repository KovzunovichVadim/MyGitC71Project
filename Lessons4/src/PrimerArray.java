import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class PrimerArray {
    public static void main(String[] args) {

        String[] animals = {"cat", "dog", "panda", "bee"};
        Arrays.sort(animals);   // Сортировка массива
        String lineArray = Arrays.toString(animals);

        //Arrays.toString();  // Преобразует к строке массив

        System.out.println(lineArray);
        System.out.println(animals[1]);

        String[] secondAnimals = new String[10];
        //secondAnimals = Arrays.copyOf(animals);          // Не работает
        System.out.println(Arrays.toString(secondAnimals));

        // Метод бинарного поиска - перед началом отсортировать
        System.out.println(Arrays.toString(animals));
        System.out.println(Arrays.binarySearch(animals,"dog"));
    }
}
