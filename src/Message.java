public class Message {
    public static void tampilanLogin () {
        System.out.println("=====================================================================");
        System.out.println("||                          W E L C O M E                          ||");
        System.out.println("||                            LOGIN PAGE                           ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                            L O G I N                            ||");
        System.out.println("||        [1] Administrator                  [2] Customer          ||");
        System.out.println("||                                                                 ||");
        System.out.println("||                         [0] Keluar Program                      ||");
        System.out.println("=====================================================================");
    }

    public static void headerUsernameDanPassword() {
        System.out.println("=====================================================================");
        System.out.println("||                              L O G I N                          ||");
        System.out.println("||      Mohon Masukkan Username dan Password untuk melanjutkan     ||");
        System.out.println("---------------------------------------------------------------------");
    }

    public static void loggedInGreetingAdmin(String userName) {
        System.out.println("=====================================================================");
        System.out.printf("||                      Hallo Admin, %-30s||\n", userName);
        System.out.println("||                                                                 ||");
        System.out.println("||                  Tekan Enter untuk melanjutkan                  ||");
        System.out.println("=====================================================================");
    }

    public static void loggedInGreetingCustomer(String userName) {
        System.out.println("=====================================================================");
        System.out.printf("||                   Hallo Customer, %-30s||\n", userName);
        System.out.println("||                                                                 ||");
        System.out.println("||                  Tekan Enter untuk melanjutkan                  ||");
        System.out.println("=====================================================================");
    }
}
