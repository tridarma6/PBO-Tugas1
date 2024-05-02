import java.util.Scanner;

class Input{

    public static void inputAdmin(){
        Scanner scanner = new Scanner(System.in);
        View.tampilanMenu();
        int choice;
        choice = Validation.validationFourChoice();
        switch(choice){
            case 1:
                View.tambahRestoranHeader();
                Admin.inputAddRestoran();
                inputAdmin();
                break;
            case 2:
                Admin.viewRestaurants();
                scanner.nextLine();
                inputAdmin();
                break;
            case 3:
                System.out.println("Masukkan ID Restoran yang akan dihapus : ");
                int idDelete = Validation.validationInteger();
                Admin.deleteRestaurant(idDelete);
                scanner.nextLine(); 
                inputAdmin();
                break;
            case 0:
                Login.login();
                break;
        }
        scanner.close();
    }
    
    public boolean addMenu(Restaurant restaurant) {
        
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
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
        } while (choice != 0);
        return true;
    }

    public static void customerInput(){
        Scanner scanner = new Scanner(System.in);
        View.tampilanMenuCustomer();
        int choice = Validation.validationFourChoice();
        switch (choice) {
            case 1:
                Customer.viewRestaurants();
                scanner.nextLine();
                customerInput();
                break;
            case 2:
                
                break;
            case 3:

                break;
            case 0:

                break;
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
            inputAdmin();
        }
    }
}