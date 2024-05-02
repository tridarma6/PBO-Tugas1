public class Order{ 
    int id;
    int id_restaurant;
    int id_menu;
    int quantity;
    double distance;
    double total_price;

    private static int nextID = 1;

    public Order(int id_restaurant, int id_menu, int quantity, double distance, double total_price){

        this.id_restaurant = id_restaurant;
        this.id_menu = id_menu;
        this.quantity = quantity;
        this.distance = distance;
        this.total_price = total_price;
        this.id = nextID;
        nextID++;
    }
    
    public int getId_restaurant() {
        return id_restaurant;
    }

    public int getId_menu() {
        return id_menu;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDistance() {
        return distance;
    }

    public double getTotal_price() {
        return total_price;
    }

    public int getId() {
        return id;
    }

    public static int getNextID() {
        return nextID;
    }

    public String getNameRestaurant(int id_restaurant){
        return Admin.restaurants.get(id_restaurant).getName();
    }

    public String getNameFood(int id_restaurant, int id_menu){
        return Admin.restaurants.get(id_restaurant).foods.get(id_menu).getName();
    }
    
}