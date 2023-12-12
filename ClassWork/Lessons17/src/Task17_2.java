import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Task17_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate localDate = LocalDate.of(2023, 11,30);
        if (localDate.getDayOfWeek() ==  DayOfWeek.TUESDAY){
            localDate = localDate.plusDays(7);
        }
        while (localDate.getDayOfWeek() != DayOfWeek.TUESDAY){
            localDate = localDate.plusDays(1);
        }
        System.out.println(localDate);
    }
}
