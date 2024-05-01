import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Order> orders; 
    private static ArrayList<Restaurant> restaurants;

    public Customer(){

        Customer.orders = new ArrayList<>();
        Customer.restaurants = new ArrayList<>();
    }

    public void addOrders(int id_restaurant){
        System.out.println("Mau mesen minuman atau makanan?");
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("List Makanan");
            int id_food = scanner.nextInt();
            System.out.println("Berapa Banyak?");
            int quantity = scanner.nextInt();

            addFoods(id_restaurant, id_food, quantity);
        }else if(choice == 2){
            System.out.println("List Minuman");
            int id_drink = scanner.nextInt();
            System.out.println("Berapa Banyak?");
            int quantity = scanner.nextInt();

            addFoods(id_restaurant, id_drink, quantity);
        }
    }

    public void addFoods(int id_restaurant, int id_food, int quantity){
        Random random = new Random();
        double total_order = restaurants.get(id_restaurant-1).foods.get(id_food-1).price * quantity;
        Order order = new Order(id_restaurant-1, id_food-1, quantity, random.nextInt(1000), total_order);

        orders.add(order);
    }

    public void addDrink(int id_restaurant, int id_drink, int quantity){
        Random random = new Random();
        double total_order = restaurants.get(id_restaurant-1).foods.get(id_drink-1).price * quantity;
        Order order = new Order(id_restaurant-1, id_drink-1, quantity, random.nextInt(1000), total_order);

        orders.add(order);
    }
}

