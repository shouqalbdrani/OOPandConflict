import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

enum OrderStatus {
    PENDING,
    SHIPPED,
    DELIVERED
}

public class Order {
    private UUID orderId;
    private String customerName;
    private UUID productId;
    private int quantity;
    private OrderStatus orderState;

    public Order(String customerName, UUID productId, int quantity) {
        this.customerName = customerName;
        this.productId = productId;
        this.quantity = quantity;
        this.orderId = UUID.randomUUID();
        this.orderState = OrderStatus.PENDING;
    }

    public UUID getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName.toUpperCase();
    }

    public UUID getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public OrderStatus getOrderState() {
        return orderState;
    }

    public void updateState(OrderStatus newStatus) {
        this.orderState = newStatus;
    }


    public void displayOrder() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Product ID: " + productId);
        System.out.println("Quantity: " + quantity);
        System.out.println("Order Status: " + orderState);
        System.out.println("----------------------------");
    }

}

