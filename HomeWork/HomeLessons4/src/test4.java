import java.util.Arrays;

public class test4 {
    public static void main(String[] args) {
        int[] arra1 = {1, 2, 3};
        int[] arra2 = {4, 5, 6,7,8,9};

        System.arraycopy(arra1,1,arra2,2,2);
        System.out.println(Arrays.toString(arra2));
    }
}
