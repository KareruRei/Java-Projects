import java.util.Date;

public class Order{
        private int orderID;
        private Date orderDate;
        private String status;
        private float totalAmount;
        private String paymentMethod;

        void setOrderID(int myOrderID) {orderID = myOrderID;}
        void setOrderDate(Date myOrderDate) {orderDate = myOrderDate;}
        void setStatus(String myStatus) {status = myStatus;}
        void setTotalAmount(float myTotalAmount) {totalAmount = myTotalAmount;}
        void setPaymentMethod(String myPaymentMethod) {paymentMethod = myPaymentMethod;}

        int getOrderID() {return orderID;}
        Date getOrderDate() {return orderDate;}
        String getStatus() {return status;}
        float getTotalAmount() {return totalAmount;}
        String getPaymentMethod() {return paymentMethod;}
}




