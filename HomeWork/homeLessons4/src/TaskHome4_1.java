import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TaskHome4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] arraysNumbers = new int[scanner.nextInt()];

        for (int i = 0; i<arraysNumbers.length;i++){
            arraysNumbers[i] =(int) (Math.random()*10);
            if (i ==0){
                System.out.print("Массив числа: ");
            }
            System.out.print(arraysNumbers[i]+" ");
        }

        System.out.println("        ");

        for (int i = arraysNumbers.length-1;i>=0;i--){
            if(i == arraysNumbers.length-1){
                System.out.print("Массив наооборот: ");
            }
            System.out.print(arraysNumbers[i]+" ");
        }
    }
}
