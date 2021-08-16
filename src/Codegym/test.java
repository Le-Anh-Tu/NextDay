    package Codegym;

    import org.junit.jupiter.api.Test;
    import java.time.LocalDate;
    import java.time.format.DateTimeFormatter;
    import static org.junit.jupiter.api.Assertions.*;

        class test {
            @Test
            public void testNextDate1() {
//                String day   = "01";
//                String month = "01";
//                String year  = "2018";
                String date = "2018-01-02";
                LocalDate expected = LocalDate.parse("2018-01-03");

//                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//
//                String actual = NextDay.nextDate(day, month, year);
//
//                String strDate1 = expected.format(formatter);
                LocalDate nextDay = NextDay.nextDate(date);
                assertEquals(expected, nextDay);
            }


            @Test
            public void testNextDate2() {
                String day   = "31";
                String month = "01";
                String year  = "2018";

                LocalDate expected = LocalDate.parse("2018-02-01");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                String actual = NextDay.nextDateFormat(day, month, year);

                String strDate2 = expected.format(formatter);
                assertEquals(strDate2, actual);
            }

            @Test
            public void testNextDate3() {
                String day   = "30";
                String month = "04";
                String year  = "2018";

                LocalDate expected = LocalDate.parse("2018-05-01");

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                String actual = NextDay.nextDateFormat(day, month, year);

                String strDate3 = expected.format(formatter);
                assertEquals(strDate3, actual);
            }

    }
