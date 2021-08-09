package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StatsServiceTest {
    private StatsService service = new StatsService();
    private int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void amountSalesForMonth() {
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void averageSalesPerMonth() {
        int expected = 15;
        int actual = service.averageCalculate(sales);
        assertEquals(expected, actual);
    }


    @Test
    void maxMouthSales() {
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minMouthSales() {
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
    void minSalesAverageMountCount() {
        int expected = 5;
        int actual = service.calculateSumMin(sales);
        assertEquals(expected, actual);
    }

    @Test
    void maxSalesAverageMountCount() {
        int expected = 5;
        int actual = service.calculateSumMax(sales);
        assertEquals(expected, actual);
    }
}
