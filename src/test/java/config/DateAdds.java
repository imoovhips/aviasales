package config;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateAdds {
    private static final String FORMAT_DATE = "dd.MM.yyyy";
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(FORMAT_DATE);

    public static String addDays(String date, int countDays) {
        if (countDays <=0) {
            return date;
        }
        LocalDate resultDate = LocalDate.parse(date, dateTimeFormatter);
        int addedDays = 0;
        while (addedDays < countDays) {
            resultDate = resultDate.plusDays(1);
            addedDays++;
        }

        return dateTimeFormatter.format(resultDate);
    }
}
