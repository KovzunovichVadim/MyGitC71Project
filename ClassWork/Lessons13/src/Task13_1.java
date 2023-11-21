public class Task13_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException exception) {
            System.out.println(exception);
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
            System.out.println(exception.getLocalizedMessage());
        } finally {
            System.out.println("end");
        }
    }
}
