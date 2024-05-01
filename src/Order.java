public class Order{ 
    
    int id_restaurant;
    int id_menu;
    int quantity;
    double distance;
    double total_price;

    public Order(int id_restaurant, int id_menu, int quantity, double distance, double total_price){

        this.id_restaurant = id_restaurant;
        this.id_menu = id_menu;
        this.quantity = quantity;
        this.distance = distance;
        this.total_price = total_price;
    }
}