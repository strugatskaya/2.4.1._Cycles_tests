package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void totalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.totalSales(sales);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void averageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void sumMonthsOverAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int average = service.averageSales(sales);
        int expected = 5;
        int actual = service.sumMonthsOverAverageSales(sales);
        assertEquals(expected, actual);
    }


    @org.junit.jupiter.api.Test
    void sumMonthsUnderAverageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int average = service.averageSales(sales);
        int expected = 5;
        int actual = service.sumMonthsUnderAverageSales(sales);
        assertEquals(expected, actual);
    }
}