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
        View.addRestorantAgain();
        int choice = Validation.validationTwoChoice();
        if(choice == 1){
            Admin.inputAddRestoran();
        }else{
            inputAdmin();
        }
    }
}