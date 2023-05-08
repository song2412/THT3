import java.time.LocalDate;
import java.util.Scanner;

class Product {
    private String description;
    private String productID;
    private double price;
    @Override
    public String toString() {
        return "Product [description=" + description + ", productID=" + productID + ", price=" + price + "]";
    }
    public Product() {
    }
    public Product(String description, String productID, double price) {
        this.description = description;
        this.productID = productID;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public String getProductID() {
        return productID;
    }
    public double getPrice() {
        return price;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setProductID(String productID) {
        this.productID = productID;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}
class OrderDetail extends Product{
    private int quality;
    private Product product;
    
    public double calcTotalPrice(double price){
        return quality*price;
    }

    @Override
    public String toString() {
        return "OrderDetail [quality=" + quality + ", product=" + product + "]";
    }


    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    
    public OrderDetail(int quality, Product product) {
        this.quality = quality;
        this.product = product;
    }

    public void OrderDetail(Product p, int x){
    
    }
}
 class  Order{
    private int orderID;
    private LocalDate orderDate;
    private OrderDetail lineItems;
    private int count;

    public void addLineItem(Product p, int x){
        lineItems.add(new OrderDetail(x,p));
    }  
    public double calcTotalChange(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }
    @Override
    public String toString() {
        return "Order [orderID=" + orderID + ", orderDate=" + orderDate + ", lineItems=" + lineItems + ", count="
                + count + "]";
    }
    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }
    public int getOrderID() {
        return orderID;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public OrderDetail getLineItems() {
        return lineItems;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }      
}
public class BAI1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Product pr= new Product(null, null, 0);
        OrderDetail od=new OrderDetail(0, pr);
        Order o=new Order(0, null);
    }
}