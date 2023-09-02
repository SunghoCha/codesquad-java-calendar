package honux.calandar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}