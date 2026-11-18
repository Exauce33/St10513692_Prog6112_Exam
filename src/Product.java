public class Product implements IProduct {
    private final String[] productNames;
    private final int[][] productSales;

    public Product(String[] productNames, int[][] productSales) {
        this.productNames = productNames;
        this.productSales = productSales;
    }

    @Override
    public int getTotalProductsSold() {
        int total = 0;

        for (int[] salesForProduct : productSales) {
            for (int sales : salesForProduct) {
                total += sales;
            }
        }

        return total;
    }


    @Override
    public double getAverageProductSold() {
        int numberOfSalesEntries = 0;

        for (int[] salesForProduct : productSales) {
            numberOfSalesEntries += salesForProduct.length;
        }

        if (numberOfSalesEntries == 0) {
            return 0;
        }

        // Divide the overall sales by all product-month entries.
        return (double) getTotalProductsSold() / numberOfSalesEntries;
    }

    @Override
    public String getMostPopularProduct() {
        if (productNames.length == 0) {
            return "";
        }

        int mostPopularIndex = 0;
        int highestSales = 0;

        for (int product = 0; product < productNames.length; product++) {
            int productTotal = 0;

            for (int month = 0; month < productSales[product].length; month++) {
                productTotal += productSales[product][month];
            }

            if (product == 0 || productTotal > highestSales) {
                highestSales = productTotal;
                mostPopularIndex = product;
            }
        }

        return productNames[mostPopularIndex] + " (" + highestSales + ")";
    }
}
