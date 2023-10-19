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

        boolean exam = false;
        for (int i = 1;i<array.length;i++){
            if (!(array[i-1]<array[i])){
                exam = true;
                break;
            }
        }

        if (exam){
            System.out.println("Нет");
        } else {
            System.out.println("Последовательность возврастающая");
        }
    }
}
