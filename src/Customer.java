import java.util.*;

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
            System.out.print("Masukan pilihan berupa angka: ");
            int categoryChoice = Validation.validationInteger();

            if (categoryChoice == 1) {
                Clear.screen();
                menus = convertToMenuList(restaurant.getFoods());
            } else if (categoryChoice == 2) {
                Clear.screen();
                menus = convertToMenuList( restaurant.getDrinks());
            }
            if (menus.isEmpty()) {
                Clear.screen();
                View.ThereIsNotCategory();
                continue;
            }
            System.out.println("=====================================================================");
            System.out.println("||                        LIHAT MENU RESTORAN                      ||");
            System.out.printf ("|| > Restoran: %-52s||\n", restaurant.getName());
            System.out.printf ("|| > Alamat  : %-52s||\n", restaurant.getAddress());
            System.out.println("---------------------------------------------------------------------");
            System.out.println("|| ID MENU  |             NAMA MAKANAN             |      HARGA    ||");
            System.out.println("---------------------------------------------------------------------");
            for (Menu menu : menus) {
                System.out.printf("|| %-9s| %-37s| %-14s||\n", menu.getID(), menu.getName(), menu.getPrice());
            }
            View.footerStandar();


                
                System.out.print("Masukan ID Menu: ");
                id = Validation.validationInteger();

            System.out.print("Berapa banyak: ");
            quantity = Validation.validationInteger();

            addItemToOrders(restaurant, id, quantity, menus);
            Clear.screen();
            View.addItemLainnya();
            System.out.print("Masukan pilihan berupa angka: ");
            choice = Validation.validationInteger();
            Clear.screen();
        }

        displayOrders();
    }
    private static void addItemToOrders(Restaurant restaurant, int id, int quantity, ArrayList<Menu> menus) {
        Menu menu = menus.get(id - 1);
        PurchaseOrders purchase = new PurchaseOrders(restaurant.getName(), menu.getName(), menu.getPrice(), quantity, menu.getPrice() * quantity);
        purchaseOrders.add(purchase);
    }

    private static void displayOrders() {
        int totalPrice = 0;
        System.out.println("========================================================================================");
        System.out.println("||                            D E T A I L   P E S A N A N                             ||");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.println("||             NAMA MAKANAN             |      HARGA    |     JUMLAH    |   SUB TOTAL ||");
        System.out.println("----------------------------------------------------------------------------------------");
        for (PurchaseOrders purchase : purchaseOrders) {
            System.out.printf("|| %-37s| %-14.1f| %-14d| %-12.1f||\n",purchase.getMenu(), purchase.getPrice(), purchase.getQuantity(), purchase.getSubPrice());
            totalPrice += purchase.getSubPrice();
        }
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("||         Tekan Enter untuk kembali                    |   TOTAL        | %-11d||\n",totalPrice);
        System.out.println("========================================================================================");
        scanner.nextLine();
    }
    
    public static void checkOrder(){
        Clear.screen();
        if(!purchaseOrders.isEmpty()){
            Random random = new Random();
            System.out.println("========================================================================================");
            System.out.printf("||  Nama  : %-25s                                                 ||\n", Account.customerName);
            System.out.printf("||  Nama Restaurant  : %-25s                                      ||\n", purchaseOrders.get(0).getRestaurantName());
            System.out.printf("||  Jarak : %-26d                                                ||\n",random.nextInt(1000));
            displayOrders();
        }else{
            View.emptyOrderData();
        }
    }
    public static void viewRestaurants() {
        Clear.screen();
        if (Admin.restaurants.isEmpty()) {
            View.ThereIsNotRestorant();
        } else {
            System.out.println("=====================================================================");
            System.out.println("||                     DAFTAR RESTORAN                             ||");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("|| ID       |  NAMA RESTORAN |                  ALAMAT             ||");
            System.out.println("---------------------------------------------------------------------");
            for (Restaurant restaurant : Admin.restaurants) {
                System.out.printf("|| %-9s| %-15s| %-36s||\n", restaurant.getId(), restaurant.getName(),restaurant.getAddress() );
            }
            View.footerStandar();

            // Meminta input pengguna untuk memilih restoran
            
            System.out.print("Masukkan ID Restoran yang ingin dilihat menu: ");
            int chosenRestaurantId = Validation.validationInteger();
            
            
            
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
                ArrayList<Food> foods = chosenRestaurant.getFoods();
                ArrayList<Drink> drinks = chosenRestaurant.getDrinks();

                if (!foods.isEmpty() || !drinks.isEmpty()) {
                    // Clear.screen();
                    System.out.println("=====================================================================");
                    System.out.println("||                        LIHAT MENU RESTORAN                      ||");
                    System.out.printf ("|| > Restoran: %-52s||\n", chosenRestaurant.getName());
                    System.out.printf ("|| > Alamat  : %-52s||\n", chosenRestaurant.getAddress());
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("|| ID MENU  |             NAMA MAKANAN             |      HARGA    ||");
                    System.out.println("---------------------------------------------------------------------");
                    for (Food food : foods) {
                        System.out.printf("|| %-9s| %-37s| %-14s||\n", food.getID(), food.getName(), food.getPrice());
                    }
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("|| ID MENU  |             NAMA MINUMAN             |      HARGA    ||");
                    System.out.println("---------------------------------------------------------------------");
                    for (Drink drink : drinks) {
                        System.out.printf("|| %-9s| %-37s| %-14s||\n", drink.getID(), drink.getName(), drink.getPrice());
                    }
                    View.menuFooter();
                } else {
                    // Clear.screen();
                    View.ThereIsNotFoodInThisRestorant();
                }

                // if (!drinks.isEmpty()) {
                    
                //     System.out.println("=====================================================================");
                //     System.out.println("||                        LIHAT MENU RESTORAN                      ||");
                //     System.out.printf ("|| > Restoran: %-52s||\n", chosenRestaurant.getName());
                //     System.out.printf ("|| > Alamat  : %-52s||\n", chosenRestaurant.getAddress());
                    // System.out.println("---------------------------------------------------------------------");
                    // System.out.println("|| ID MENU  |             NAMA MINUMAN             |      HARGA    ||");
                    // System.out.println("---------------------------------------------------------------------");
                    // for (Drink drink : drinks) {
                    //     System.out.printf("|| %-9s| %-37s| %-14s||\n", drink.getID(), drink.getName(), drink.getPrice());
                    // }
                //     View.menuFooter();
                // } else {
                    
                //     View.ThereIsNotDrinkInThisRestorant();
                // }
            } else {
                // Clear.screen();
                View.notFoundIDResto();
            }
        }
    }

    public static void pickRestaurant(){
        if (Admin.restaurants.isEmpty()) {
            Clear.screen();
            View.ThereIsNotRestorant();
        } else {
            Clear.screen();
            System.out.println("=====================================================================");
            System.out.println("||                     DAFTAR RESTORAN                             ||");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("|| ID       |  NAMA RESTORAN |                  ALAMAT             ||");
            System.out.println("---------------------------------------------------------------------");
            for (Restaurant restaurant : Admin.restaurants) {
                System.out.printf("|| %-9s| %-15s| %-36s||\n", restaurant.getId(), restaurant.getName(),restaurant.getAddress() );
            }
            View.footerStandar();
            // Meminta input pengguna untuk memilih restoran
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Masukkan ID Restoran yang ingin dilihat menu: ");
            int chosenRestaurantId = Validation.validationInteger();
            Clear.screen();
            
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
                ArrayList<Food> foods = chosenRestaurant.getFoods();
                ArrayList<Drink> drinks = chosenRestaurant.getDrinks();

                if (!foods.isEmpty() || !drinks.isEmpty()) {
                    Clear.screen();
                    System.out.println("=====================================================================");
                    System.out.println("||                        LIHAT MENU RESTORAN                      ||");
                    System.out.printf ("|| > Restoran: %-52s||\n", chosenRestaurant.getName());
                    System.out.printf ("|| > Alamat  : %-52s||\n", chosenRestaurant.getAddress());
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("|| ID MENU  |             NAMA MAKANAN             |      HARGA    ||");
                    System.out.println("---------------------------------------------------------------------");
                    for (Food food : foods) {
                            System.out.printf("|| %-9s| %-37s| %-14s||\n", food.getID(), food.getName(), food.getPrice());
                        }
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("|| ID MENU  |             NAMA MINUMAN             |      HARGA    ||");
                    System.out.println("---------------------------------------------------------------------");
                    for (Drink drink : drinks) {
                        System.out.printf("|| %-9s| %-37s| %-14s||\n", drink.getID(), drink.getName(), drink.getPrice());
                    }
                } else {
                    Clear.screen();
                   View.ThereIsNotFoodInThisRestorant();
                }

                // if (!drinks.isEmpty()) {

                //     // Clear.screen();
                //     System.out.println("=====================================================================");
                //     System.out.println("||                        LIHAT MENU RESTORAN                      ||");
                //     System.out.printf ("|| > Restoran: %-52s||\n", chosenRestaurant.getName());
                //     System.out.printf ("|| > Alamat  : %-52s||\n", chosenRestaurant.getAddress());
                //     System.out.println("---------------------------------------------------------------------");
                //     System.out.println("|| ID MENU  |             NAMA MINUMAN             |      HARGA    ||");
                //     System.out.println("---------------------------------------------------------------------");
                //     for (Drink drink : drinks) {
                //         System.out.printf("|| %-9s| %-37s| %-14s||\n", drink.getID(), drink.getName(), drink.getPrice());
                //     }
                //     View.menuFooter();
                // } else {
                //     // Clear.screen();
                //     View.ThereIsNotDrinkInThisRestorant();
                // }
            } else {
                Clear.screen();
               View.notFoundIDResto();
            }

            
            System.out.println("=====================================================================");
            System.out.printf("||         APAKAH ANDA INGIN MEMESAN DI RESTAURAN %-14s   ||\n",chosenRestaurant.getName());
            System.out.println("---------------------------------------------------------------------");
            System.out.println("||           Pilih opsi di bawah dengan memasukkan angka           ||");
            System.out.println("||                                                                 ||");
            System.out.println("||          [1] Iya                            [2] Tidak           ||");
            System.out.println("=====================================================================");
            System.out.print("Masukan pilihan berupa angka : ");
            int choice = Validation.validationTwoChoice();
            if(choice == 1){
                Clear.screen();
                addOrders(chosenRestaurant);
            }else{
                Clear.screen();
                pickRestaurant();
            }
            
        }
    }
}

