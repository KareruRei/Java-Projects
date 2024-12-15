public class OrderItem extends Order{
        private int itemID;
        private String productName;
        private int quantity;
        private float unitPrice;

        void setItemID(int myItemID) {itemID = myItemID;}
        void setProductName(String myProductName) {productName = myProductName;}
        void setQuantity(int myQuantity) {quantity = myQuantity;}
        void setUnitPrice(float myUnitPrice) {unitPrice = myUnitPrice;}

        int getItemID() {return itemID;}
        String getProductName() {return productName;}
        int getQuantity() {return quantity;}
        float getUnitPrice() {return unitPrice;}
}