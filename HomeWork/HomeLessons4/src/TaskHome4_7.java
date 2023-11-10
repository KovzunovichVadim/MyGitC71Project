import java.util.Arrays;

public class TaskHome4_7 {
    public static void main(String[] args) {

        int[] array = {9, 9, 9};

        if (array[array.length-1]!=9){
            array[array.length-1] = array[array.length-1] +1;
        }

        System.out.println(Arrays.toString(array));

        for (int i = array.length-1; i>=0; i--){
            if (array[i] == 9){
                array[i] = 0;
            } else {
                array[i]=array[i]+1;
            }

            if (array[0] == 0){
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
