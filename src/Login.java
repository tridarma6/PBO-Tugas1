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

        Message.tampilanLogin();
        System.out.print("Masukan pilihan :");
        int userType = Validation.validationTwoChoice();
        
        if(userType == 1){
            CLS.clearScreen();
            inputAdmin();
        } else if(userType == 2) {
            CLS.clearScreen();
            inputCustomer();
        }
    }

    public static void inputAdmin(){
        Scanner scanner = new Scanner(System.in);
            Message.headerUsernameDanPassword();
            System.out.println("Masukkan username Anda:");
            String username = scanner.nextLine();
            System.out.println("Masukkan password Anda:");
            String password = scanner.nextLine();
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            CLS.clearScreen();
            isLogin = true;
            Message.loggedInGreetingAdmin(adminName);
            scanner.nextLine();
            CLS.clearScreen();
        } else {
            CLS.clearScreen();
            Message.errorLogin();
            scanner.nextLine();
            CLS.clearScreen();
            login();
        }
    }

    public static void inputCustomer(){
        Scanner scanner = new Scanner(System.in);
            Message.headerUsernameDanPassword();
            System.out.println("Masukkan username Anda:");
            String username = scanner.nextLine();
            System.out.println("Masukkan password Anda:");
            String password = scanner.nextLine();
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            CLS.clearScreen();
            isLogin = true;
            Message.loggedInGreetingAdmin(adminName);
            scanner.nextLine();
            CLS.clearScreen();
        } else {
            CLS.clearScreen();
            Message.errorLogin();
            scanner.nextLine();
            CLS.clearScreen();
            login();
        }
    }
}
