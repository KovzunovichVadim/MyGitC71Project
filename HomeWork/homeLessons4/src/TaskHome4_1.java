import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaskHome4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] arraysNumbers = new int[scanner.nextInt()];
        System.out.print("Массив числа: ");

        for (int i = 0; i<arraysNumbers.length;i++){
            arraysNumbers[i] =(int) (Math.random()*10);
            System.out.print(arraysNumbers[i]+" ");
        }

        System.out.println();
        System.out.print("Массив наооборот: ");

        for (int i = arraysNumbers.length-1;i>=0;i--){
            System.out.print(arraysNumbers[i]+" ");
        }
    }
}
