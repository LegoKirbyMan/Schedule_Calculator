package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScheduleClaculatorTest {
    @Test
    void ScheduleTest1() {
        ScheduleCalculator calculator = new ScheduleCalculator();

        int income = 10000;
        int expences = 3000;
        int threshold = 20000;

        long expected = 3;
        long actual = calculator.calculate(income, expences, threshold);
        
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void ScheduleTest2() {
        ScheduleCalculator calculator = new ScheduleCalculator();

        int income = 100000;
        int expences = 60000;
        int threshold = 150000;

        long expected = 2;
        long actual = calculator.calculate(income, expences, threshold);
        
        Assertions.assertEquals(expected, actual);
    }
}
