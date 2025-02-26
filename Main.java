import java.util.UUID;


public class Main {
    public static void main(String[] args) {
        // Create Products
        Product laptop = new Product(UUID.randomUUID(), "Laptop", 1200, 20, 5);
        Product smartphone = new Product(UUID.randomUUID(), "Smartphone", 800, 10, 3);

        // Display Product Details
        System.out.println(laptop.toString());
        System.out.println(smartphone.toString());

        // Predict Stock Depletion
        StockPredictor.predictStock(laptop, 1);
        StockPredictor.predictStock(smartphone, 2);


    }
}
