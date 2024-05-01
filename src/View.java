public class View {
    

    public static void tampilanLogin () {
        System.out.println("=====================================================================");
        System.out.println("||                          W E L C O M E                          ||");
        System.out.println("||                                                                 ||");
        System.out.println("||                            LOGIN PAGE                           ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                      Pilih Tipe User Di bawah                   ||");
        System.out.println("||                                                                 ||");
        System.out.println("||        [1] Administrator                  [2] Customer          ||");
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

    public static void errorLogin() {
        System.out.println("=====================================================================");
        System.out.println("||                            Log In Gagal                         ||");
        System.out.println("||                                                                 ||");
        System.out.println("||              Periksa Kembali Username dan Password Anda         ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                  Tekan Enter untuk melanjutkan                  ||");
        System.out.println("=====================================================================");
    }

    public static void tampilanMenu() {
        System.out.println("=====================================================================");
        System.out.println("||                            Admin Menu                           ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                 Pilih opsi dengan memasukkan angka              ||");
        System.out.println("||                                                                 ||");
        System.out.println("||   [1] Tambahkan Restoran baru                                   ||");
        System.out.println("||   [2] Lihat Restoran yang Ada                                   ||");
        System.out.println("||   [3] Hapus Restoran yang Ada                                   ||");
        System.out.println("||   [0] Kembali ke menu log in                                    ||");
        System.out.println("=====================================================================");
        System.out.print("Pilihan Anda: ");
    }

    public static void tampilanMenuCustomer() {
        System.out.println("=====================================================================");
        System.out.println("||                           Customer Menu                         ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                 Pilih opsi dengan memasukkan angka              ||");
        System.out.println("||                                                                 ||");
        System.out.println("||   [1] Lihat restaurant                                          ||");
        System.out.println("||   [2] Buat pesanan                                              ||");
        System.out.println("||   [3] Lihat Pesanan                                             ||");
        System.out.println("||   [0] Kembali ke menu log in                                    ||");
        System.out.println("=====================================================================");
        System.out.print("Pilihan Anda: ");
    }

    public static void tambahRestoranHeader() {
        System.out.println("=====================================================================");
        System.out.println("||                          TAMBAH RESTORAN                        ||");
        System.out.println("||                            Admin Menu                           ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||       Mohon masukkan restoran baru dengan informasi di bawah    ||");
        System.out.println("||           ID Restoran, Nama Restoran, Alamat Restoran           ||");
        System.out.println("=====================================================================");
    }
    public static void addMenuAgain(){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                   Restoran berhasil ditambahkan!                ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                  Lanjutkan menambahkan restoran?                ||");
        System.out.println("||                                                                 ||");
        System.out.println("||                  1. Ya                   2. Tidak               ||");
        System.out.println("=====================================================================");
        System.out.print("Masukan pilihan berupa angka: ");
    }
}
