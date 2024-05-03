import java.util.Scanner;

class Input{

    public static void inputAdmin(){
        Clear.screen();
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
                System.out.println("=====================================================================");
                System.out.println("||                     DAFTAR RESTORAN                             ||");
                System.out.println("---------------------------------------------------------------------");
                System.out.println("|| ID       |  NAMA RESTORAN |                  ALAMAT             ||");
                System.out.println("---------------------------------------------------------------------");
                for (Restaurant restaurant : Admin.restaurants) {
                    System.out.printf("|| %-9s| %-15s| %-36s||\n", restaurant.getId(), restaurant.getName(),restaurant.getAddress() );
                }
                View.footerStandar();
                int idDelete;
                while(true){
                    System.out.println("Masukkan ID Restoran yang akan dihapus : ");
                    idDelete = Validation.validationInteger();
                    if(idDelete < 1 || idDelete > Admin.restaurants.size()){
                        View.ThereIsNotRestorant();
                        scanner.nextLine();
                        Clear.screen();
                    }else{
                        break;
                    }
                }
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