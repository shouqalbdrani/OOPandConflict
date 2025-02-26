import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class OrderManager {
    private List<Order> orders = new ArrayList<>();
    private ExecutorService executor = Executors.newFixedThreadPool(2);

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println("Order has Placed suceefully -feature-branch2:\n");
        order.displayOrder();

    }

    private void processOrder(Order order) {
        executor.submit(() -> {
            try {
                Thread.sleep(2000); // Simulating processing time
                order.updateState(OrderStatus.SHIPPED);
                System.out.println("Order Shipped:");
                order.displayOrder();


                Thread.sleep(2000);
                order.updateState(OrderStatus.DELIVERED);
                System.out.println("Order Delivered:\n" + order);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    public void shutdown() {
        executor.shutdown();
    }
}
