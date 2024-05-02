public class PurchaseOrders {
    int no;
    private static int nextNo = 1;
    String restaurantName;
    String menu;
    int quantity;
    double sub_price;

    public PurchaseOrders(String restaurantName, String menu, int quantity, double sub_price) {
        this.no = nextNo;
        this.restaurantName = restaurantName;
        this.menu = menu;
        this.quantity = quantity;
        this.sub_price = sub_price;
        nextNo++;
    }
}
