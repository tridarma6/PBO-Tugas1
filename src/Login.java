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
             Clear.screen();
            inputAdmin();
        } else if(userType == 2) {
             Clear.screen();
            inputCustomer();
        } else{
             Clear.screen();
        }
        scanner.close();
    }

    public static void inputAdmin(){
        Scanner scanner = new Scanner(System.in);
            View.headerUsernameDanPassword();
            System.out.print("Masukkan username Anda: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password Anda: ");
            String password = scanner.nextLine();
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            //  Clear.screen();
            System.out.println();
            isLogin = true;
            View.loggedInGreetingAdmin(adminName);
            scanner.nextLine();
             Clear.screen();
            Input.input();
        } else {
             Clear.screen();
            View.errorLogin();
            scanner.nextLine();
             Clear.screen();
            login();
        }



        scanner.close();
    }

    public static void inputCustomer(){
        Scanner scanner = new Scanner(System.in);
        View.headerUsernameDanPassword();
        System.out.print("Masukkan username Anda: ");
        String username = scanner.nextLine();
        System.out.print("Masukkan password Anda: ");
        String password = scanner.nextLine();
        if (username.equals(CUSTOMER_USERNAME) && password.equals(CUSTOMER_PASSWORD)) {
             Clear.screen();
            isLogin = true;
            View.loggedInGreetingCustomer(customerName);
            scanner.nextLine();
             Clear.screen();
        } else {
             Clear.screen();
            View.errorLogin();
            scanner.nextLine();
             Clear.screen();
            login();
        }




        scanner.close();
    }
}
