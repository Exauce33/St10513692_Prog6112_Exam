import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // One-dimensional array containing the names of the products.
        String[] productNames = {
                "Cozy Nights Monarch",
                "Restonic Barbados",
                "Sealy Phuket"
        };

        // Two-dimensional array containing three months of sales for each product.
        int[][] productSales = new int[productNames.length][3];

        // Read one month's sales at a time for each product.
        for (int product = 0; product < productNames.length; product++) {
            for (int month = 0; month < 3; month++) {
                System.out.printf(
                        "Enter number of sales for month %d for %s: ",
                        month + 1,
                        productNames[product]
                );
                productSales[product][month] = input.nextInt();
            }
        }

        input.close();

        // Calculate and print the sales report.
        Product productData = new Product(productNames, productSales);
        PrintProduct reportPrinter = new PrintProduct(productData);
        reportPrinter.printReport();
    }
}
