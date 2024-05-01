import java.util.ArrayList;
import java.util.Scanner;

class Input{
    private static Admin admin = new Admin();
    private ArrayList<Restaurant> restaurants;

    public Input(){
        this.restaurants = new ArrayList<>();
    }
    
    public static void input(){
        //membuat object admin
        //test
        // admin.addRestoran(1, "Restoran Ayam gepuk", "Jalan gunung");
        // admin.addRestoran(2, "Restoran Gaco", "Jalan Jimbo");
        Scanner scanner = new Scanner(System.in);
        View.tampilanMenu();
        int choice;
        choice = Validation.validationFourChoice();
        switch(choice){
            case 1:
                Clear.screen();
                View.tambahRestoranHeader();
                Admin.inputAddRestoran();
                Clear.screen();
                input();
                break;
            case 2:
                admin.viewRestaurants();
                scanner.nextLine();
                Clear.screen();
                input();
                break;
            case 3:
                System.out.println("Masukkan ID Restoran yang akan dihapus : ");
                int idDelete = Validation.validationInteger();
                admin.deleteRestaurant(idDelete);
                scanner.nextLine();
                Clear.screen(); 
                input();
                break;
            case 0:
                Clear.screen();
                Login.login();
                break;
        }
        scanner.close();
    }
    
    public boolean addMenu(Restaurant restaurant) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        System.out.println("\nMenu:");
        System.out.println("1. Tambah Makanan");
        System.out.println("2. Tambah Minuman");
        System.out.println("0. Selesai");
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
                scanner.nextLine(); // Membuang newline character
                System.out.print("Masukkan Nama Minuman: ");
                String drinkName = scanner.nextLine();
                System.out.print("Masukkan Harga Minuman: ");
                double drinkPrice = Validation.validationDouble();
                Drink drink = new Drink(drinkName, drinkPrice);
                restaurant.addDrink(drink);
                break;
            case 0:
                
                // Selesai
                if (restaurant.getFoods().isEmpty() && restaurant.getDrinks().isEmpty()) {
                    System.out.println("Tidak dapat menambah restoran tanpa menu.");
                    return false;
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
        
        return true;
    }

    public static void customerInput(){
        Scanner scanner = new Scanner(System.in);
        View.tampilanMenuCustomer();
        int choice = Validation.validationFourChoice();
        switch (choice) {
            case 1:
                Clear.screen();
                break;
            case 2:
                Clear.screen();
                break;
            case 3:
                Clear.screen();
            case 0:
                Clear.screen();
            default:
                break;
        }
    }
    public static void apakahTambahRestoranLagi() {
        Clear.screen();
        View.addMenuAgain();
        int choice = Validation.validationTwoChoice();
        if(choice == 1){
            Admin.inputAddRestoran();
        }else{
             Clear.screen();
            input();
        }
    }
}