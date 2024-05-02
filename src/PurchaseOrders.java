public class PurchaseOrders {
    int no;
    private static int nextNo = 1;
    String restaurantName;
    String menu;
    double price;
    int quantity;
    double sub_price;

    public PurchaseOrders(String restaurantName, String menu, double price, int quantity, double sub_price) {
        this.no = nextNo;
        this.restaurantName = restaurantName;
        this.menu = menu;
        this.price = price;
        this.quantity = quantity;
        this.sub_price = sub_price;
        nextNo++;
    }

    public double getSubPrice() {
        // TODO Auto-generated method stub
        return this.sub_price;
    }

    public int getNo() {
        return no;
    }

    public static int getNextNo() {
        return nextNo;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public String getMenu() {
        return menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getSub_price() {
        return sub_price;
    }

    public double getPrice() {
        return price;
    }
    
}
