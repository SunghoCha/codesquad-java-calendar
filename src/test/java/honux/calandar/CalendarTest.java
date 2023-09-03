package honux.calandar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalendarTest {

    Calendar cal = new Calendar();

    @Test
    void parseDay() {
        //given
        String weekday = "su";
        //when
        int a = cal.parseDay(weekday);
        //then
        Assertions.assertEquals(0,a);
    }

    @Test
    void equals() {
        //given
        String a = "hello";
        String b = "hello";
        String aa = new String("hello");
        String bb = new String("hello");

        //when
        boolean b1 = (a == b);
        boolean b2 = (aa == bb);
        //then
        Assertions.assertEquals(true,b1);
        Assertions.assertEquals(false,b2);
    }

    @Test
    void getYearAmount() {
        //given
        int year = 1973;
        //when
        int a = cal.getYearAmount(year);
        //then 1970 1971 1972
        Assertions.assertEquals(365+365+366,a);
    }

    @Test
    void getMonthAmount() {
        //given
        int year = 1973;
        int month = 3;
        //when
        int a = cal.getMonthAmount(year, month);
        //then
        Assertions.assertEquals(31+28,a);
    }

    @Test
    void getWeekday() {
        //given
        int year = 1973;
        int month = 4;
        //when
        int a = cal.getWeekday(year,month);
        //then
        Assertions.assertEquals(0,a);
    }



}