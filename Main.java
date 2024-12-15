import java.util.Date;

public class Main{
    public static void main(String[] args) {
        
    Order order1 = new Order();
    Customer customer1 = new Customer();
    OrderItem orderItem1 = new OrderItem();
    Warehouse warehouse1 = new Warehouse();
    Supplier supplier1 = new Supplier();
    Clerk clerk1 = new Clerk();
    Address address1 = new Address();
    
    
    order1.setOrderID(001);
    if(order1.getOrderID() > 0) {
        System.out.println("Order ID: " + order1.getOrderID());
    } else {
        System.out.println("Invalid Order ID");
    }
    
    customer1.setName("Kareru");
    if(customer1.getName() != null && !customer1.getName().isEmpty()) {
        System.out.println("Customer Name: " + customer1.getName());
    } else {
        System.out.println("Customer name not set");
    }
    
    customer1.setCustomerID(010);
    if(customer1.getCustomerID() > 0) {
        System.out.println("Customer ID: " + customer1.getCustomerID());
    } else {
        System.out.println("Invalid Customer ID");
    }
    
    customer1.setContactInfo("0999-691-9867");
    if(customer1.getContactInfo() != null && !customer1.getContactInfo().isEmpty()) {
        System.out.println("Customer Contact: " + customer1.getContactInfo());
    } else {
        System.out.println("Contact info not provided");
    }
    
    address1.setAddressLine1("123 Main St");
    if(address1.getAddressLine1() != null) {
        System.out.println("Address Line 1: " + address1.getAddressLine1());
    } else {
        System.out.println("Address Line 1 not provided");
    }
    
    address1.setAddressLine2("456 Main St");
    if(address1.getAddressLine2() != null) {
        System.out.println("Address Line 2: " + address1.getAddressLine2());
    } else {
        System.out.println("Address Line 2 not provided");
    }

    address1.setCity("Manila");
    if(address1.getCity() != null && !address1.getCity().isEmpty()) {
        System.out.println("City: " + address1.getCity());
    } else {
        System.out.println("City not provided");
    }

    address1.setState("Metro Manila");
    if(address1.getState() != null && !address1.getState().isEmpty()) {
        System.out.println("State: " + address1.getState());
    } else {
        System.out.println("State not provided");
    }

    address1.setPostalCode(1000);
    if(address1.getPostalCode() > 0) {
        System.out.println("Postal Code: " + address1.getPostalCode());
    } else {
        System.out.println("Invalid postal code");
    }

    address1.setCountry("Philippines");
    if(address1.getCountry() != null && !address1.getCountry().isEmpty()) {
        System.out.println("Country: " + address1.getCountry());
    } else {
        System.out.println("Country not provided");
    }

    orderItem1.setItemID(001);
    if(orderItem1.getItemID() > 0) {
        System.out.println("Item ID: " + orderItem1.getItemID());
    } else {
        System.out.println("Invalid Item ID");
    }
    
    orderItem1.setProductName("Vacuum Cleaner");
    if(orderItem1.getProductName() != null && !orderItem1.getProductName().isEmpty()) {
        System.out.println("Product Name: " + orderItem1.getProductName());
    } else {
        System.out.println("Product name not provided");
    }
    
    orderItem1.setQuantity(1);
    if(orderItem1.getQuantity() > 0) {
        System.out.println("Quantity: " + orderItem1.getQuantity());
    } else {
        System.out.println("Invalid quantity");
    }
    
    orderItem1.setUnitPrice(100.00f);
    if(orderItem1.getUnitPrice() > 0) {
        System.out.println("Unit Price: $" + orderItem1.getUnitPrice());
    } else {
        System.out.println("Invalid unit price");
    }
    
    orderItem1.setOrderDate(new Date());
    if(orderItem1.getOrderDate() != null) {
        System.out.println("Order Date: " + orderItem1.getOrderDate());
    } else {
        System.out.println("Order date not set");
    }
    
    orderItem1.setStatus("Pending");
    if(orderItem1.getStatus() != null && !orderItem1.getStatus().isEmpty()) {
        System.out.println("Order Status: " + orderItem1.getStatus());
    } else {
        System.out.println("Status not set");
    }
    
    orderItem1.setTotalAmount(1000.00f);
    if(orderItem1.getTotalAmount() > 0) {
        System.out.println("Total Amount: $" + orderItem1.getTotalAmount());
    } else {
        System.out.println("Invalid total amount");
    }
    
    orderItem1.setPaymentMethod("Cash");
    if(orderItem1.getPaymentMethod() != null && !orderItem1.getPaymentMethod().isEmpty()) {
        System.out.println("Payment Method: " + orderItem1.getPaymentMethod());
    } else {
        System.out.println("Payment method not specified");
    }
    
    warehouse1.setLocation("Metro Manila");
    if(warehouse1.getLocation() != null && !warehouse1.getLocation().isEmpty()) {
        System.out.println("Warehouse Location: " + warehouse1.getLocation());
    } else {
        System.out.println("Warehouse location not set");
    }
    
    warehouse1.setProductID(001);
    if(warehouse1.getProductID() > 0) {
        System.out.println("Product ID: " + warehouse1.getProductID());
    } else {
        System.out.println("Invalid Product ID");
    }
    
    warehouse1.setProductName("Vacuum Cleaner");
    if(warehouse1.getProductName() != null && !warehouse1.getProductName().isEmpty()) {
        System.out.println("Product Name: " + warehouse1.getProductName());
    } else {
        System.out.println("Product name not provided");
    }
    
    warehouse1.setCurrentStock(10);
    if(warehouse1.getCurrentStock() >= 0) {
        System.out.println("Current Stock: " + warehouse1.getCurrentStock());
    } else {
        System.out.println("Invalid stock amount");
    }
    
    supplier1.setName("Noir's Warehouse");
    if(supplier1.getName() != null && !supplier1.getName().isEmpty()) {
        System.out.println("Supplier Name: " + supplier1.getName());
    } else {
        System.out.println("Supplier name not provided");
    }
    
    supplier1.setContactInfo("1234-567-8910");
    if(supplier1.getContactInfo() != null && !supplier1.getContactInfo().isEmpty()) {
        System.out.println("Supplier Contact: " + supplier1.getContactInfo());
    } else {
        System.out.println("Supplier contact not provided");
    }
    
    supplier1.setOrderDate(new Date());
    if(supplier1.getOrderDate() != null) {
        System.out.println("Order Date: " + supplier1.getOrderDate());
    } else {
        System.out.println("Order date not set");
    }
    
    supplier1.setStatus("Processing");
    if(supplier1.getStatus() != null && !supplier1.getStatus().isEmpty()) {
        System.out.println("Order Status: " + supplier1.getStatus());
    } else {
        System.out.println("Status not set");
    }
    
    supplier1.setTotalAmount(2000.00f);
    if(supplier1.getTotalAmount() > 0) {
        System.out.println("Total Amount: $" + supplier1.getTotalAmount());
    } else {
        System.out.println("Invalid total amount");
    }
    
    supplier1.setPaymentMethod("Bank Transfer");
    if(supplier1.getPaymentMethod() != null && !supplier1.getPaymentMethod().isEmpty()) {
        System.out.println("Payment Method: " + supplier1.getPaymentMethod());
    } else {
        System.out.println("Payment method not specified");
    }
    
    clerk1.setName("John Doe");
    if(clerk1.getName() != null && !clerk1.getName().isEmpty()) {
        System.out.println("Clerk Name: " + clerk1.getName());
    } else {
        System.out.println("Clerk name not provided");
    }
    
    clerk1.setClerkID(001);
    if(clerk1.getClerkID() > 0) {
        System.out.println("Clerk ID: " + clerk1.getClerkID());
    } else {
        System.out.println("Invalid Clerk ID");
    }
    
    }
}