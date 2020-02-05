package challenges.practice_java;

import java.time.LocalDate;
import java.util.Calendar;

public class Date_Time {

    public static String findDayLocalDate(int month, int day, int year) {
        LocalDate date =  LocalDate.of(year, month, day);

        return date.getDayOfWeek().toString();
    }

    public static String findDayCalendar(int month, int day, int year){
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,day);
        String[] strDays = new String[] { "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
                "FRIDAY", "SATURDAY" };
        int dOW = cal.get(Calendar.DAY_OF_WEEK);
        return strDays[dOW - 1];
    }
}
