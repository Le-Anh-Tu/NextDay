package Codegym;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NextDay {
    public static LocalDate nextDate(String date) {
        LocalDate localDate = LocalDate.parse(date);
        localDate = localDate.plusDays(1);
        return localDate;
    }

    public static String nextDateFormat(String day, String month, String year) {
        LocalDate localDate = LocalDate.parse(year + "-" + month + "-" + day);
        localDate = localDate.plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatter);
    }
}
