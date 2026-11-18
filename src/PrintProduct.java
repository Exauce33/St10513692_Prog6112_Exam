public class PrintProduct {
    private final IProduct product;

    public PrintProduct(IProduct product) {
        this.product = product;
    }

    public void printReport() {
        System.out.println();
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("****************************************");
        System.out.println("TOTAL PRODUCT SALES: " + product.getTotalProductsSold());
        System.out.println("AVERAGE PRODUCT SALES: "
                + Math.round(product.getAverageProductSold()));
        System.out.println("MOST POPULAR PRODUCT: " + product.getMostPopularProduct());
    }
}
