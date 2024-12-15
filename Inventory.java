public class Inventory extends OrderItem{
        private int productID;
        private String productName;
        private int currentStock;
        
        void setProductID(int myProductID) {productID = myProductID;}
        void setProductName(String myProductName) {productName = myProductName;}
        void setCurrentStock(int myCurrentStock) {currentStock = myCurrentStock;}

        int getProductID() {return productID;}
        String getProductName() {return productName;}
        int getCurrentStock() {return currentStock;}
}