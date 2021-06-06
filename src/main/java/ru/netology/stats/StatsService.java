package ru.netology.stats;

public class StatsService {
    public int totalSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales, int sum) {

        int average = 0;
        for (int sale : sales) {
            average = sum / sales.length;
        }
        return average;
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
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int sumMonthsOverAverageSales(int[] sales, int average) {
        int overAverageMonths = 0;
        for (int sale : sales) {
            if (average < sale)
                overAverageMonths++;
        }
        return overAverageMonths;
    }

    public int sumMonthsUnderAverageSales(int[] sales, int average) {
        int underAverageMonths = 0;
        for (int sale : sales) {
            if (average > sale)
                underAverageMonths++;
        }
        return underAverageMonths;
    }
}