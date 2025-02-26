import java.util.UUID;

public class Product {
    private UUID ProductID;
    private String name ;
    private int price;
    private int stockLevel ;
    private int reorderThreshold ;

    public Product(UUID ProductID, String name, int price, int stockLevel, int reorderThreshold) {
        this.ProductID = ProductID;
        this.name = name;
        this.price = price;
        this.stockLevel = stockLevel;
        this.reorderThreshold = reorderThreshold;

    }
    public UUID getProductID() {
        return ProductID;

    }
    public String getName() {
        return name;

    }
    public int getPrice() {
        return price;

    }
    public int getStockLevel() {
        return stockLevel;
    }
    public int getReorderThreshold() {
        return reorderThreshold;

    }
    public void setProductID(UUID ProductID) {
        this.ProductID = ProductID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
    public void setReorderThreshold(int reorderThreshold) {
        this.reorderThreshold = reorderThreshold;
    }
    public void reduceStockLevel(int quantity) {
        this.stockLevel -= quantity;
    }

    @Override
    public String toString() {
        return String.format(
                "Product ID: %s\nName: %s\nPrice: $%d\nStock Level: %d\nReorder Threshold: %d\n",
                ProductID, name, price, stockLevel, reorderThreshold
        );
    }


}
