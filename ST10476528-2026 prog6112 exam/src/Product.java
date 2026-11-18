public class Product implements IProduct {

    String[] names;
    int[][] sales;

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    // Calculate total sales
    @Override
    public int GetTotalProductsSold() {
        int total = 0;

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }

        return total;
    }

    // Calculate average sales
    @Override
    public double GetAverageProductsSold() {
        return (double) GetTotalProductsSold() / 9;
    }

    // Find most popular product
    @Override
    public String GetMostPopularProduct() {
        int highest = 0;
        int position = 0;

        for (int i = 0; i < sales.length; i++) {
            int total = 0;

            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }

            if (total > highest) {
                highest = total;
                position = i;
            }
        }

        return names[position] + " (" + highest + ")";
    }
}