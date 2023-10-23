public class test5 {
    public static void main(String[] args) {

        int[][][] testArray = {{{1, 2, 3}, {10, 20, 30, 40}}, {{500, 600}}};

        for (int[][] arrayMiddle:testArray){
            for (int[] arrayInternal: arrayMiddle){
                for (int item: arrayInternal){
                    System.out.print(item + " ");
                }
                System.out.println();
            }
        }
    }
}
