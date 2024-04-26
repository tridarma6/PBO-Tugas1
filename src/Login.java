import java.util.*;
public class Login {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "a190605";
    private static final String CUSTOMER_USERNAME = "customer";
    private static final String CUSTOMER_PASSWORD = "c190605";
    public static void login(){

        Scanner scanner = new Scanner(System.in);

        Message.tampilanLogin();
        System.out.print("Masukan pilihan :");
        int userType = Validation.validationTwoChoice();
        
        if(userType == 1){
            CLS.clearScreen();
            Message.headerUsernameDanPassword();
            System.out.println("Masukkan username Anda:");
            String username = scanner.nextLine();
            System.out.println("Masukkan password Anda:");
            String password = scanner.nextLine();
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            CLS.clearScreen();
            System.out.println("Login admin berhasil!");
        } else {
            CLS.clearScreen();
            System.out.println("Username atau password salah!");
        }
    } else if(userType == 2){
        CLS.clearScreen();
        Message.headerUsernameDanPassword();
        System.out.println("Masukkan username Anda:");
        String username = scanner.nextLine();
        System.out.println("Masukkan password Anda:");
        String password = scanner.nextLine();
        if (username.equals(CUSTOMER_USERNAME) && password.equals(CUSTOMER_PASSWORD)) {
            CLS.clearScreen();
            System.out.println("Login customer berhasil!");
        } else {
            CLS.clearScreen();
            System.out.println("Username atau password salah!");
        }
    }else{
        CLS.clearScreen();
    }

    }
}
