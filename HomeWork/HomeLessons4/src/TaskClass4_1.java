public class TaskClass4_1 {
    public static void main(String[] args) {
        int[] arraysNumber = new int[5];
        int number;
        for (int i = 0; i <= arraysNumber.length-1; i++) {
            number = (int) (Math.random() * 10);
            arraysNumber[i] = number;
            System.out.println(arraysNumber[i]);
        }
    }
}
