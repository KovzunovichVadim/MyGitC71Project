import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task17_1 {
    public static void main(String[] args) {
        DayOfWeek day = LocalDate.parse("1988-09-12").getDayOfWeek();
        System.out.println(day);
    }
}
