import java.util.Arrays;

public class TaskHome4_7 {
    public static void main(String[] args) {

        int[] array = {9, 9, 9};

        if (array[array.length-1]!=9){
            array[array.length-1] = array[array.length-1] +1;
        }

        System.out.println(Arrays.toString(array));

        for (int i = array.length-1; i>=1; i--){
            if (i == 9){
                array[i] = array[i]+1;
                
            }
        }

    }
}
