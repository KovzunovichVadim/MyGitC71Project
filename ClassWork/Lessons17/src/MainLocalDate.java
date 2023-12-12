import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class MainLocalDate {
    public static void main(String[] args) {
        //Creating
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2018, 2, 10));
        LocalDate localDate = LocalDate.of(2018, 2, 10);
        LocalDate localDate2 = LocalDate.of(2019, 4, 20);
        String localDate1 = LocalDate.parse("2018-02-10").format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(localDate1);
        System.out.println(localDate.minusDays(51).plusYears(3));
        System.out.println(localDate.minus(10, ChronoUnit.CENTURIES));
        System.out.println(ChronoUnit.DAYS.between(localDate,localDate2));
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.isBefore(LocalDate.now()));


    }
}