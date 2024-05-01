import java.util.*;
public class Login {
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "a190605";
    private static final String CUSTOMER_USERNAME = "customer";
    private static final String CUSTOMER_PASSWORD = "c190605";
    public static void login(){
        String adminName = "Rifki";
        String customerName = "Tri Darma";
        Scanner scanner = new Scanner(System.in);

        Message.tampilanLogin();
        System.out.print("Masukan pilihan :");
        int userType = Validation.validationTwoChoice();
        
        if(userType == 1){
            do{
            CLS.clearScreen();
            Message.headerUsernameDanPassword();
            System.out.println("Masukkan username Anda:");
            String username = scanner.nextLine();
            System.out.println("Masukkan password Anda:");
            String password = scanner.nextLine();
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            CLS.clearScreen();
            Message.loggedInGreetingAdmin(adminName);
            scanner.nextLine();
            CLS.clearScreen();
            break;
        } else {
            CLS.clearScreen();
            System.out.println("Username atau password salah!");
        }}while(true);
    } else if(userType == 2){
        CLS.clearScreen();
        // perulangan dowhile ini fungsinya untuk jika username dan password salah , user diminta kembali untuk menginputkan username dan password
        do{
        Message.headerUsernameDanPassword();
        System.out.println("Masukkan username Anda:");
        String username = scanner.nextLine();
        System.out.println("Masukkan password Anda:");
        String password = scanner.nextLine();
        if (username.equals(CUSTOMER_USERNAME) && password.equals(CUSTOMER_PASSWORD)) {
            CLS.clearScreen();
            Message.loggedInGreetingCustomer(customerName);
            scanner.nextLine();
            CLS.clearScreen();
            break;
        } else {
            CLS.clearScreen();
            System.out.println("Username atau password salah!");
        }}while(true);
    }else if(userType == 0){
        CLS.clearScreen();
        System.out.println(
                        "\n||==========================================================||" + 
                        "\n||                        Thank You :>                      ||" + 
                        "\n||==========================================================||"  
                    );
    }

    }
}
