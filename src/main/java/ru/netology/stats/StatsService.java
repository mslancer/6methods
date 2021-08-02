package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] sales) {
        int amountSales = 0;
        for (int sale : sales) {
            amountSales += sale;
        }
        return amountSales;
    }



    public int averageCalculate(int[] sales) {
        int amountSales = 0;
        for (int sale : sales) {
        amountSales += sale;
        }
        return amountSales / 12;
    }



    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }



    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int calculateSumMin(int[] sales) {
        int countSales = 0;
        for (int sale : sales) {
            if (sale < 15)
                countSales++;
        }
        return countSales;
    }

    public int calculateSumMax(int[] sales) {
        int countSales = 0;
        for (int sale : sales) {
            if (sale > 15)
                countSales++;
        }
        return countSales;
    }


}
