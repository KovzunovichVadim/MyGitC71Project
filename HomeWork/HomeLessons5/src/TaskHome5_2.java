import java.util.Arrays;

public class TaskHome5_2 {
    public static void main(String[] args) {

        //Задача 2:
        //Создать программу для раскраски шахматной доски с помощью цикла
        //Создать двумерный массив String 8х8
        //С помощью циклов задать элементам массива значения B(Black) или W(White)

        String[][] arrayChess = new String[8][8];

        for (int i = 0; i < arrayChess.length; i += 2) {
            for (int j = 0; j < arrayChess[i].length; j++) {
                if (j % 2 == 0) {
                    arrayChess[i][j] = "W";
                } else {
                    arrayChess[i][j] = "B";
                }
            }
        }

        for (int i = 1; i < arrayChess.length; i += 2) {
            for (int j = 0; j < arrayChess[i].length; j++) {
                if (j % 2 == 0) {
                    arrayChess[i][j] = "B";
                } else {
                    arrayChess[i][j] = "W";
                }
            }
        }

        for (int i = 0; i < arrayChess.length; i ++) {
            for (int j = 0; j < arrayChess[i].length; j++) {
                System.out.print(arrayChess[i][j] + " ");
                    if (j==arrayChess[i].length-1){
                        System.out.println();
                    }
            }
        }
    }
}
