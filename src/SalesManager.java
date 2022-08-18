public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales [1];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
    public int mid() {
    int summ = 0;

    for (int i = 0; i < sales.length; i++)
        summ += sales[i];
    int mid = (summ - min() - max()) / (sales.length-2);
    return mid;
    }

}

