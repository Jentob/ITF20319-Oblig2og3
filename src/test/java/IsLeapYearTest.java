import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsLeapYearTest {

    @Test
    void leapYearDividableWith400() {
        assertTrue(IsLeapYear.isLeapYear(2000));
    }

    @Test
    void leapYearDividableWith4ButNot100() {
        assertTrue(IsLeapYear.isLeapYear(2024));
    }

    @Test
    void nonLeapYear() {
        assertFalse(IsLeapYear.isLeapYear(2023));
    }
}