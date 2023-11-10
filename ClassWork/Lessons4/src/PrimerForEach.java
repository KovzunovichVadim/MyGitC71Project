public class PrimerForEach {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "lemon", "mango"};

        // Для прохода цикла от начала до конца
        for (String line : fruits) {
            System.out.println(line);
        }

        // Перебор массива через For

        String[] animals = {"cat", "dog", "panda", "bee"};

        for (int i = 0; i < animals.length;i++){ // i = 0 1 2 3
            System.out.println(animals[i]);
        }

        for (int i = 3; i >= 0;i--){ // i = 0 1 2 3
            System.out.println(animals[i]);
        }
    }
}
