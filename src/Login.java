import java.util.*;
public class Login {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "a190605";
    private static final String CUSTOMER_USERNAME = "customer";
    private static final String CUSTOMER_PASSWORD = "c190605";
    private static final String adminName = "Rifki";
    private static final String customerName = "Tri Dharma";
    private static boolean isLogin = false;

    /**
     * 
     */
    public static void login(){
        Scanner scanner = new Scanner(System.in);
        
        View.tampilanLogin();
        System.out.print("Masukan pilihan :");
        int userType = Validation.validationTwoChoice();
        
        if(userType == 1){
            CLS.clearScreen();
            inputAdmin();
        } else if(userType == 2) {
            CLS.clearScreen();
            inputCustomer();
        } else{
            CLS.clearScreen();
        }
    }

    public static void inputAdmin(){
        Scanner scanner = new Scanner(System.in);
            View.headerUsernameDanPassword();
            System.out.println("Masukkan username Anda:");
            String username = scanner.nextLine();
            System.out.println("Masukkan password Anda:");
            String password = scanner.nextLine();
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            // CLS.clearScreen();
            System.out.println();
            isLogin = true;
            View.loggedInGreetingAdmin(adminName);
            scanner.nextLine();
            CLS.clearScreen();
            Input.input();
        } else {
            CLS.clearScreen();
            View.errorLogin();
            scanner.nextLine();
            CLS.clearScreen();
            login();
        }
    }

    public static void inputCustomer(){
        Scanner scanner = new Scanner(System.in);
            View.headerUsernameDanPassword();
            System.out.println("Masukkan username Anda:");
            String username = scanner.nextLine();
            System.out.println("Masukkan password Anda:");
            String password = scanner.nextLine();
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            CLS.clearScreen();
            isLogin = true;
            View.loggedInGreetingAdmin(adminName);
            scanner.nextLine();
            CLS.clearScreen();
        } else {
            CLS.clearScreen();
            View.errorLogin();
            scanner.nextLine();
            CLS.clearScreen();
            login();
        }
    }
}
