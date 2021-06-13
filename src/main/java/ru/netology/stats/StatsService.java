package ru.netology.stats;

public class StatsService {
    public int totalSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int sum = totalSales(sales);
        int average = 0;
        average = sum / sales.length;
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

    public int sumMonthsOverAverageSales(int[] sales) {
        int overAverageMonths = 0;
        int average = averageSales(sales);
        for (int sale : sales) {
            if (average < sale)
                overAverageMonths++;
        }
        return overAverageMonths;
    }

    public int sumMonthsUnderAverageSales(int[] sales) {
        int underAverageMonths = 0;
        int average = averageSales(sales);
        for (int sale : sales) {
            if (average > sale)
                underAverageMonths++;
        }
        return underAverageMonths;
    }
}