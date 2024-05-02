import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    public static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Menu> convertToMenuList(ArrayList<? extends Menu> list) {
        ArrayList<Menu> menus = new ArrayList<>();
        for (Menu item : list) {
            menus.add(item);
        }
        return menus;
    }
    
    private static ArrayList<PurchaseOrders> purchaseOrders = new ArrayList<>();
    public static void addOrders(Restaurant restaurant){
        int choice = 1;
        while (choice == 1) {
            int id;
            int quantity;
            ArrayList<Menu> menus = new ArrayList<>();
            View.tambahPesanan();
            int categoryChoice = Validation.validationInteger();

            if (categoryChoice == 1) {
                menus = convertToMenuList(restaurant.getFoods());
            } else if (categoryChoice == 2) {
                menus = convertToMenuList( restaurant.getDrinks());
            }
            if (menus.isEmpty()) {
                System.out.println("Tidak ada item dalam kategori ini.");
                continue;
            }
            for (Menu menu : menus) {
                System.out.println("ID: " + menu.getID() + ", Nama: " + menu.getName() + ", Harga: " + menu.getPrice());
            }

            System.out.println("Pilih ID:");
            id = scanner.nextInt();

            System.out.println("Berapa banyak?");
            quantity = scanner.nextInt();

            addItemToOrders(restaurant, id, quantity, menus);

            System.out.println("Tambah item lainnya?");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            choice = scanner.nextInt();
        }

        displayOrders();
    }
    private static void addItemToOrders(Restaurant restaurant, int id, int quantity, ArrayList<Menu> menus) {
        Menu menu = menus.get(id - 1);
        PurchaseOrders purchase = new PurchaseOrders(restaurant.getName(), menu.getName(), menu.getPrice(), quantity, menu.getPrice() * quantity);
        purchaseOrders.add(purchase);
    }

    private static void displayOrders() {
        System.out.println("Pesanan:");
        int totalPrice = 0;
        for (PurchaseOrders purchase : purchaseOrders) {
            System.out.println("Nama Restaurant: " + purchase.getRestaurantName() + ", Menu: " + purchase.getMenu() + ", Price: " + purchase.getPrice() + ", Jumlah: " + purchase.getQuantity() + ", SubTotal: " + purchase.getSubPrice());
            totalPrice += purchase.getSubPrice();
        }
        System.out.println("Total Harga: " + totalPrice);
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

