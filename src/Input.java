import java.util.Scanner;

class Input{

    public static void inputAdmin(){
        Scanner scanner = new Scanner(System.in);
        View.tampilanMenu();
        int choice;
        choice = Validation.validationFourChoice();
        switch(choice){
            case 1:
                Clear.screen();
                View.tambahRestoranHeader();
                Admin.inputAddRestoran();
                inputAdmin();
                break;
            case 2:
                Clear.screen();
                Admin.viewRestaurants();
                scanner.nextLine();
                inputAdmin();
                break;
            case 3:
                Clear.screen();
                System.out.println("Masukkan ID Restoran yang akan dihapus : ");
                int idDelete = Validation.validationInteger();
                Admin.deleteRestaurant(idDelete);
                scanner.nextLine(); 
                inputAdmin();
                break;
            case 0:
                Clear.screen();
                Login.login();
                break;
        }
        scanner.close();
    }
    
    

    public static void customerInput(){
        Scanner scanner = new Scanner(System.in);
        View.tampilanMenuCustomer();
        int choice = Validation.validationFourChoice();
        switch (choice) {
            case 1:
                Clear.screen();
                Customer.viewRestaurants();
                scanner.nextLine();
                customerInput();
                break;
            case 2:
                Clear.screen();
                Customer.pickRestaurant();
                scanner.nextLine();
                customerInput();
                break;
            case 3:
                // Clear.screen();
                Customer.checkOrder();
                scanner.nextLine();
                customerInput();
                break;
            case 0:
                Clear.screen();
                Login.login();
                break;
            default:
                break;
        }
    }
    public static void apakahTambahRestoranLagi() {
        Clear.screen();
        View.addRestorantAgain();
        int choice = Validation.validationTwoChoice();
        if(choice == 1){
            Clear.screen();
            Admin.inputAddRestoran();
        }else{
            Clear.screen();
            inputAdmin();
        }
    }
}