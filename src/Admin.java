import java.util.ArrayList;
import java.util.Scanner;
class Admin{
    public static ArrayList<Restaurant> restaurants = new ArrayList<>(); 
 
    //constructor Admin
    public Admin(){
    }
 
    public static void inputAddRestoran(){
        Clear.screen();
        View.tambahRestoranHeader();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Restoran: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Alamat Restoran: ");
        String address = scanner.nextLine();
        addRestoran(name, address);
        scanner.close();
    }
     // method untuk menambah restoran
    public static void addRestoran(String name, String address){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Food> food = new ArrayList<>();
        ArrayList<Drink> drink = new ArrayList<>();
        Restaurant restaurant = new Restaurant(name, address, food, drink);
        boolean addMenuDone = addMenu(restaurant);
        if (!addMenuDone) {
            scanner.nextLine();
            Clear.screen();
            addMenu(restaurant);
        } else {
            restaurants.add(restaurant);
            System.out.println("Restoran berhasil ditambahkan!");
            Input.apakahTambahRestoranLagi();
        }
     }
 
     //method view semua restaurant
     public static void viewRestaurants() {
        if (restaurants.isEmpty()) {
            System.out.println("Tidak ada restoran yang tersedia.");
        } else {
            System.out.println("Daftar Restoran:");
            for (Restaurant restaurant : restaurants) {
                System.out.println("ID: " + restaurant.getId() + ", Nama: " + restaurant.getName() + ", Alamat: " + restaurant.getAddress());
            }

            // Meminta input pengguna untuk memilih restoran
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan ID Restoran yang ingin dilihat menu: ");
            int chosenRestaurantId = scanner.nextInt();

            // Cari restoran yang dipilih oleh pengguna
            Restaurant chosenRestaurant = null;
            for (Restaurant restaurant : restaurants) {
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

     //method untuk delete restorant berdasarkan id
     public static void deleteRestaurant(int id){
         boolean found = false;
         for(int i = 0; i < restaurants.size(); i++){
             if(restaurants.get(i).getId() == id){
                 restaurants.remove(i);
                 found = true;
                 System.out.println("Restaurant Berhasil di hapus");  
                 System.out.println();
                 break;
             }
         }
         if(!found){
             System.out.println("Restorant dengan ID tersebut tidak ditemukan.");
             System.out.println();
         }
     }
     public static boolean addMenu(Restaurant restaurant) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            Clear.screen();
            View.addMenu();
            System.out.print("Pilihan Anda: ");
            choice = Validation.validationInteger();
            switch (choice) {
                case 1:
                    // Tambah makanan
                    System.out.print("Masukkan Nama Makanan: ");
                    String foodName = scanner.nextLine();
                    System.out.print("Masukkan Harga Makanan: ");
                    double foodPrice = Validation.validationDouble();
                    Food food = new Food(foodName, foodPrice);
                    restaurant.addFood(food);

                    break;
                case 2:
                    System.out.print("Masukkan Nama Minuman: ");
                    String drinkName = scanner.nextLine();
                    System.out.print("Masukkan Harga Minuman: ");
                    double drinkPrice = Validation.validationDouble();
                    Drink drink = new Drink(drinkName, drinkPrice);
                    restaurant.addDrink(drink);
                    break;
                case 0:
                    // Selesai
                    Clear.screen();
                    if (restaurant.getFoods().isEmpty() && restaurant.getDrinks().isEmpty()) {
                        View.errorAddRestorantIfDontAddMenu();
                        return false;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 0);
        return true;
    }
 }
 
