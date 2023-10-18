import java.util.Arrays;
import java.util.Scanner;

public class TaskHome4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i< array.length;i++){
            array[i] = (int) (Math.random()*10);
        }

        System.out.println("Массив: "+ Arrays.toString(array));

        int exam = 0;
        int number = array[0];
        for (int i = 1;i<array.length;i++){
            if (number<array[i]){
                number = array[i];
            }else {
                exam = exam +1;
            }
        }

        if (exam == 0){
            System.out.println("Последовательность возврастающая");
        } else {
            System.out.println("Нет");
        }
    }
}
