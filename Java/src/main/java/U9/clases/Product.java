package U9.clases;

public class Product {
    private final String productCode;
    private final String productName;
    private final String productLine;
    private final String productScale;
    private final String productVendor;
    private final String productDescription;
    private final int quantityInStock;
    private final double buyPrice;
    private final double MSRP;

    public Product(
            String productCode,
            String productName,
            String productLine,
            String productScale,
            String productVendor,
            String productDescription,
            int quantityInStock,
            double buyPrice,
            double MSRP) {
        this.productCode = productCode;
        this.productName = productName;
        this.productLine = productLine;
        this.productScale = productScale;
        this.productVendor = productVendor;
        this.productDescription = productDescription;
        this.quantityInStock = quantityInStock;
        this.buyPrice = buyPrice;
        this.MSRP = MSRP;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductLine() {
        return productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getMSRP() {
        return MSRP;
    }
}
