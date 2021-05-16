package U9.clases;

public class Orderdetail {
    private final int orderNumber;
    private final String productCode;
    private final int quantityOrdered;
    private final double priceEach;
    private final int orderLineNumber;

    public Orderdetail(
            int orderNumber,
            String productCode,
            int quantityOrdered,
            double priceEach,
            int orderLineNumber) {
        this.orderNumber = orderNumber;
        this.productCode = productCode;
        this.quantityOrdered = quantityOrdered;
        this.priceEach = priceEach;
        this.orderLineNumber = orderLineNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getQuantityOrdered() {
        return quantityOrdered;
    }

    public double getPriceEach() {
        return priceEach;
    }

    public int getOrderLineNumber() {
        return orderLineNumber;
    }
}
