package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxMillions() {
        StatisticsService service = new StatisticsService();

        long[] incomesInMillions = {12_000_000, 5_000_000, 8_000_000, 4_000_000, 5_000_000, 33_000_000, 8_000_000, 6_000_000, 11_000_000, 11_000_000, 12_000_000};
        long expected = 33_000_000;

        long actual = service.findMax(incomesInMillions);

        assertEquals(expected, actual);
    }
@Test
    void FindMaxThousands(){
        StatisticsService service = new StatisticsService();
        long[] incomesInThousands = {1000, 20000, 300000, 75000, 235000};
        long expected = 300000;
        long actual = service.findMax(incomesInThousands);
    Assertions.assertEquals(expected, actual);
}
}