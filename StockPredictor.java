public class StockPredictor {
        public static void predictStock(Product product, int dailySales) {
            int daysUntilStockOut = product.getStockLevel() / dailySales;
            System.out.println("Stock Prediction for " + product.getName() + ":");
            System.out.println("Days until stock out: " + daysUntilStockOut);

            if (daysUntilStockOut <= 2) {
                System.out.println(" Restock immediately!");
            } else if (daysUntilStockOut <= 5) {
                System.out.println(" Consider restocking soon.");
            } else {
                System.out.println(" No immediate restock needed.");
            }
        }
    }


