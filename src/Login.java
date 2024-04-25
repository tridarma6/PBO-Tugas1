import java.util.*;
public class Login {
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
        if (username.equals("adminUsername") && password.equals("adminPassword")) {
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
        if (username.equals("customerUsername") && password.equals("customerPassword")) {
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
