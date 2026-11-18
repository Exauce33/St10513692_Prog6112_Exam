public class ProductTest {
    public static void main(String[] args) {
        getTotalProductSales_WithValidData_ReturnsCorrectValue();
        getAverageSales_WithValidData_ReturnsCorrectValue();
        System.out.println("All product tests passed.");
    }


    //Code Verify that all valid sample sales are added together.

    public static void getTotalProductSales_WithValidData_ReturnsCorrectValue() {
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
        Product product = new Product(names, sales);

        assertEquals(153, product.getTotalProductsSold());
    }


    //Code Verify that the average sales calculation is correct.

    public static void getAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
                {25, 18, 20},
                {15, 10, 12},
                {18, 15, 20}
        };
        Product product = new Product(names, sales);

        assertEquals(17.0, product.getAverageProductSold());
    }


    //Compares expected and actual values and throws an assertion error if different.

    private static void assertEquals(double expected, double actual) {
        if (Double.compare(expected, actual) != 0) {
            throw new AssertionError(
                    "Expected " + expected + " but was " + actual
            );
        }
    }
}
