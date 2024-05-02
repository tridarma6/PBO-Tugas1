import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Order> orders = new ArrayList<>(); 
    private static ArrayList<PurchaseOrders> purchaseOrders = new ArrayList<>();
    public static void addOrders(Restaurant restaurant){
        ArrayList<Food> foods = restaurant.getFoods();
        ArrayList<Drink> drinks = restaurant.getDrinks();
        int pilih;
        do {
            int id_food = 0;
            int id_drink = 0;
            int quantity_food = 0;
            int quantity_drink = 0;
            boolean foodOrDrink = true;
            System.out.println("Mau mesen minuman atau makanan?");
            System.out.println("1. Makanan");
            System.out.println("2. Minuman");
            int choice = scanner.nextInt();
            if (choice == 1) {
                foodOrDrink = true;
                if (!foods.isEmpty()) {
                    System.out.println("Makanan:");
                    for (Food food : foods) {
                        System.out.println("ID: " + food.getID() + ", Nama: " + food.getName() + ", Harga: " + food.getPrice());
                    }
                } else {
                    System.out.println("Tidak ada makanan di restoran ini.");
                }
                id_food = scanner.nextInt();
                System.out.println("Berapa Banyak?");
                quantity_food = scanner.nextInt();
    
                addFoods(restaurant, id_food, quantity_food);
            }else if(choice == 2){
                foodOrDrink = false;
                if (!drinks.isEmpty()) {
                    System.out.println("Minuman:");
                    for (Drink drink : drinks) {
                        System.out.println("ID: " + drink.getID() + ", Nama: " + drink.getName() + ", Harga: " + drink.getPrice());
                    }
                } else {
                    System.out.println("Tidak ada minuman di restoran ini.");
                }
                id_drink = scanner.nextInt();
                System.out.println("Berapa Banyak?");
                quantity_drink = scanner.nextInt();
    
                addDrinks(restaurant, id_drink, quantity_drink);
            }
            System.out.println("Apakah anda ingin memesan yang lainnya?");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            pilih = Validation.validationTwoChoice();
            if(pilih == 1) {
                if(foodOrDrink){
                    PurchaseOrders purchaseFood = new PurchaseOrders(restaurant.getName(), restaurant.foods.get(id_food-1).getName(), quantity_food, restaurant.foods.get(id_food-1).getPrice() * quantity_food);
                    purchaseOrders.add(purchaseFood);
                }else{
                    PurchaseOrders purchaseDrink = new PurchaseOrders(restaurant.getName(), restaurant.drinks.get(id_drink-1).getName(), quantity_drink, restaurant.drinks.get(id_drink-1).getPrice() * quantity_drink);
                    purchaseOrders.add(purchaseDrink);
                }
                addOrders(restaurant);
            }
            
        } while (pilih != 2);

        if (!purchaseOrders.isEmpty()) {
            System.out.println("Pesanan");
            int total_price = 0;
            for (PurchaseOrders purchase : purchaseOrders) {
                System.out.println("No: " + purchase.no + ", Nama Restaurant: " + purchase.restaurantName + ", Menu: " + purchase.menu + ", Jumlah: " + purchase.quantity + ", SubTotal: " + purchase.sub_price );
                total_price += purchase.sub_price;
            }
            System.out.println("Total Harga : " + total_price);
        }else{
            System.out.println(purchaseOrders.size());
        }
    }

    public static void addFoods(Restaurant restaurant, int id_food, int quantity) {
        Random random = new Random();
        // Periksa apakah id_food valid
        if (id_food >= 1 && id_food <= restaurant.getFoods().size()) {
            double total_order = restaurant.getFoods().get(id_food - 1).getPrice() * quantity;
            Order order = new Order(restaurant.getId(), id_food, quantity, random.nextInt(1000), total_order);
            orders.add(order);
        } else {
            System.out.println("ID makanan tidak valid.");
        }
    }
    
    public static void addDrinks(Restaurant restaurant, int id_drink, int quantity) {
        Random random = new Random();
        // Periksa apakah id_drink valid
        if (id_drink >= 1 && id_drink <= restaurant.getDrinks().size()) {
            double total_order = restaurant.getDrinks().get(id_drink - 1).getPrice() * quantity;
            Order order = new Order(restaurant.getId(), id_drink, quantity, random.nextInt(1000), total_order);
            orders.add(order);
        } else {
            System.out.println("ID minuman tidak valid.");
        }
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

    public static void pickRestaurant(){
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

            System.out.println("Apakah anda ingin memesan di restaurant " + chosenRestaurant.getName() + "?");
            System.out.println("1. Iya");
            System.out.println("2. Tidak");
            int choice = Validation.validationTwoChoice();
            if(choice == 1){
                addOrders(chosenRestaurant);
            }else{
                pickRestaurant();
            }
            
        }
    }
}

