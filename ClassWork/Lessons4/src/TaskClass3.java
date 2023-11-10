import java.util.Scanner;

public class TaskClass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        double[] massDouble = new double[scanner.nextInt()];
        for (int i = 0; i < massDouble.length; i++) {
            massDouble[i] = Math.random();
            System.out.println(massDouble[i]);
        }
        for (int i= 1; i< massDouble.length; i = i+2){
            massDouble[i] = Math.pow(massDouble[i], 2);
        }
        System.out.println("------------");
        for (double number: massDouble){
            System.out.println(number);
        }
        System.out.println("------------");
        for (int i = massDouble.length-1;i>=0;i--){
            System.out.println(massDouble[i]);
        }
    }
}
