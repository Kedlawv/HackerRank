package challenges.practice_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Date_TimeTest {

    @Test
    public void returnsCorrectDayOfWeekLocalDate(){
        //Arrange - Given
        int year = 2020;
        int month = 2;
        int day = 6;
        String expectedDayOfWeek = "THURSDAY";

        //Act - When
        String actualDayOfWeek = Date_Time.findDayLocalDate(month,day,year);

        //Assert - Then
        assertEquals(expectedDayOfWeek,actualDayOfWeek);
    }

    @Test
    public void returnsCorrectDayOfWeekCalendar(){
        //Arrange - Given
        int year = 2020;
        int month = 2;
        int day = 6;
        String expectedDayOfWeek = "THURSDAY";

        //Act - When
        String actualDayOfWeek = Date_Time.findDayCalendar(month,day,year);

        //Assert - Then
        assertEquals(expectedDayOfWeek,actualDayOfWeek);
    }
}