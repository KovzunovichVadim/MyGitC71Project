public class TaskClass5_2 {
    public static void main(String[] args) {
        //Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём

        int[][][] array = {{{1, 23, 7}, {6, 13, 5}, {1, 5, 27, 4}}, {{1, 23, 7}, {6, 13, 5}, {1, 5, 27, 4}}, {{1, 23, 7}, {6, 13, 5}, {1, 5, 27, 4}}};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int e = 0; e < array[i][j].length; e++) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
