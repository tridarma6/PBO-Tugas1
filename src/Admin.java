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
        String name = Validation.validateString();
        System.out.print("Masukkan Alamat Restoran: ");
        String address = Validation.validateString();
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
            Clear.screen();
            restaurants.add(restaurant);
            View.succesRestorantMenu();
            Input.apakahTambahRestoranLagi();
        }
     }
 
     //method view semua restaurant
     public static void viewRestaurants() {
        if (restaurants.isEmpty()) {
            View.ThereIsNotRestorant();
        } else {
            System.out.println("=====================================================================");
            System.out.println("||                     DAFTAR RESTORAN                             ||");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("|| ID       |  NAMA RESTORAN |                  ALAMAT             ||");
            System.out.println("---------------------------------------------------------------------");
            for (Restaurant restaurant : restaurants) {
                System.out.printf("|| %-9s| %-15s| %-36s||\n", restaurant.getId(), restaurant.getName(),restaurant.getAddress() );
            }
            View.footerStandar();
            boolean validId = false;
            Restaurant chosenRestaurant = null;
            Scanner scanner = new Scanner(System.in);
            do{
                System.out.print("Masukkan ID Restoran yang ingin dilihat menu: ");
                int chosenRestaurantId = Validation.validationInteger();
                Clear.screen();
                boolean restonotnull = false;
                // Cari restoran yang dipilih oleh pengguna
                for (Restaurant restaurant : restaurants) {
                    if (restaurant.getId() == chosenRestaurantId) {
                        // validId = true;
                        restonotnull = true;
                        chosenRestaurant = restaurant;
                        break;
                    }
                }
                if(!restonotnull){
                    View.notFoundIDResto();
                    scanner.nextLine();
                    Clear.screen();
                    viewRestaurants();
                }
            }while(validId);

            // Tampilkan menu jika restoran ditemukan
            if (chosenRestaurant != null) {
                System.out.println("=====================================================================");
                System.out.println("||                             LIHAT MENU                          ||");
                System.out.printf("|| Restoran : %-52s ||\n",chosenRestaurant.getName() );
                System.out.printf("|| Alamat   : %-52s ||\n",chosenRestaurant.getAddress() );
                System.out.println("---------------------------------------------------------------------");
                System.out.println("||           Pilih opsi di bawah dengan memasukkan angka           ||");
                System.out.println("||                                                                 ||");
                System.out.println("||   [1] Lihat Menu Makanan                                        ||");
                System.out.println("||   [2] Lihat Menu Minuman                                        ||");
                System.out.println("=====================================================================");
                System.out.print("Masukkan pilihan menu berupa angka: ");
                int menuChoice = Validation.validationTwoChoice();

                if(menuChoice == 1){
                    ArrayList<Food> foods = chosenRestaurant.getFoods();
                    Clear.screen();
                    if (!foods.isEmpty()) {
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
                            View.menuFooter();
                    } else {
                        View.ThereIsNotFoodInThisRestorant();
                    }
    
                } else if(menuChoice == 2){
                    ArrayList<Drink> drinks = chosenRestaurant.getDrinks();

                
                if (!drinks.isEmpty()) {
                    Clear.screen();
                    System.out.println("=====================================================================");
                    System.out.println("||                        LIHAT MENU RESTORAN                      ||");
                    System.out.printf ("|| > Restoran: %-52s||\n", chosenRestaurant.getName());
                    System.out.printf ("|| > Alamat  : %-52s||\n", chosenRestaurant.getAddress());
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("|| ID MENU  |             NAMA MINUMAN             |      HARGA    ||");
                    System.out.println("---------------------------------------------------------------------");
                    for (Drink drink : drinks) {
                        System.out.printf("|| %-9s| %-37s| %-14s||\n", drink.getID(), drink.getName(), drink.getPrice());
                    }
                    View.menuFooter();
                } else {
                    Clear.screen();
                    View.ThereIsNotDrinkInThisRestorant();
                }
                }

                
            } else {
                Clear.screen();
                View.notFoundIDResto();
            }
        }
    }

     //method untuk delete restorant berdasarkan id
     public static void deleteRestaurant(int id){
         boolean found = false;

         View.footerStandar();
         for(int i = 0; i < restaurants.size(); i++){
             if(restaurants.get(i).getId() == id){
                 restaurants.remove(i);
                 found = true;
                 View.succesDeleteRestoran(); 
                 break;
             }
         }
         if(!found){
            Clear.screen();
             View.notFoundIDResto();
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
                    String foodName = Validation.validateString();
                    System.out.print("Masukkan Harga Makanan: ");
                    double foodPrice = Validation.validationDouble();
                    Food food = new Food(foodName, foodPrice);
                    restaurant.addFood(food);
                    System.out.println();
                    View.succesMessageMenu();
                    scanner.nextLine();
                    Clear.screen();
                    break;
                case 2:
                    System.out.print("Masukkan Nama Minuman: ");
                    String drinkName = Validation.validateString();
                    System.out.print("Masukkan Harga Minuman: ");
                    double drinkPrice = Validation.validationDouble();
                    Drink drink = new Drink(drinkName, drinkPrice);
                    restaurant.addDrink(drink);
                    System.out.println();
                    View.succesMessageMenu();
                    scanner.nextLine();
                    Clear.screen();
                    break;
                case 0:
                    // Selesai
                    Clear.screen();
                    if (restaurant.getFoods().isEmpty() && restaurant.getDrinks().isEmpty()) {
                        Clear.screen();
                        View.errorAddRestorantIfDontAddMenu();
                        return false;
                    }
                    break;
                default:
                Clear.screen();
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (choice != 0);
        return true;
    }
 }
 
