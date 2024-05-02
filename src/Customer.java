import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Order> orders; 

    public Customer(){

        Customer.orders = new ArrayList<>();
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
        double total_order = Admin.restaurants.get(id_restaurant-1).foods.get(id_food-1).price * quantity;
        Order order = new Order(id_restaurant-1, id_food-1, quantity, random.nextInt(1000), total_order);

        orders.add(order);
    }

    public void addDrink(int id_restaurant, int id_drink, int quantity){
        Random random = new Random();
        double total_order = Admin.restaurants.get(id_restaurant-1).foods.get(id_drink-1).price * quantity;
        Order order = new Order(id_restaurant-1, id_drink-1, quantity, random.nextInt(1000), total_order);

        orders.add(order);
    }

    public static void viewRestaurants() {
        if (Admin.restaurants.isEmpty()) {
            System.out.println("Tidak ada restoran yang tersedia.");
        } else {
            System.out.println("Daftar Restoran:");
            for (Restaurant restaurant : Admin.restaurants) {
                System.out.println("ID: " + restaurant.getId() + ", Nama: " + restaurant.getName() + ", Alamat: " + restaurant.getAddress());
            }

            // Meminta input pengguna untuk memilih restoran
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan ID Restoran yang ingin dilihat menu: ");
            int chosenRestaurantId = scanner.nextInt();

            // Cari restoran yang dipilih oleh pengguna
            Restaurant chosenRestaurant = null;
            for (Restaurant restaurant : Admin.restaurants) {
                if (restaurant.getId() == chosenRestaurantId) {
                    chosenRestaurant = restaurant;
                    break;
                }
            }

            // Tampilkan menu jika restoran ditemukan
            if (chosenRestaurant != null) {
                System.out.println("Menu di Restoran " + chosenRestaurant.getName() + ":");
                ArrayList<Food> foods = chosenRestaurant.getFoods();
                ArrayList<Drink> drinks = chosenRestaurant.getDrinks();

                if (!foods.isEmpty()) {
                    System.out.println("Makanan:");
                    for (Food food : foods) {
                        System.out.println("ID: " + food.getID() + ", Nama: " + food.getName() + ", Harga: " + food.getPrice());
                    }
                } else {
                    System.out.println("Tidak ada makanan di restoran ini.");
                }

                if (!drinks.isEmpty()) {
                    System.out.println("Minuman:");
                    for (Drink drink : drinks) {
                        System.out.println("ID: " + drink.getID() + ", Nama: " + drink.getName() + ", Harga: " + drink.getPrice());
                    }
                } else {
                    System.out.println("Tidak ada minuman di restoran ini.");
                }
            } else {
                System.out.println("Restoran dengan ID tersebut tidak ditemukan.");
            }
        }
    }
}

