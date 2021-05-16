package U9.clases;

import java.util.Date;

public class Order {
    private final int orderNumber;
    private final Date orderDate;
    private final Date requiredDate;
    private final Date shippedDate;
    private final String status;
    private final String comments;
    private final int customerNumber;

    public Order(
            int orderNumber,
            Date orderDate,
            Date requiredDate,
            Date shippedDate,
            String status,
            String comments,
            int customerNumber) {
        this.orderNumber = orderNumber;
        this.orderDate = orderDate;
        this.requiredDate = requiredDate;
        this.shippedDate = shippedDate;
        this.status = status;
        this.comments = comments;
        this.customerNumber = customerNumber;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public Date getRequiredDate() {
        return requiredDate;
    }

    public Date getShippedDate() {
        return shippedDate;
    }

    public String getStatus() {
        return status;
    }

    public String getComments() {
        return comments;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}