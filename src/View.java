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
        System.out.println("||                                                                 ||");
        System.out.println("||   [1] Tambahkan Restoran baru                                   ||");
        System.out.println("||   [2] Lihat Restoran yang Ada                                   ||");
        System.out.println("||   [3] Hapus Restoran yang Ada                                   ||");
        System.out.println("||   [0] Kembali ke menu log in                                    ||");
        System.out.println("=====================================================================");
        System.out.print("Pilihan opsi dengan memasukan aku: ");
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
        System.out.print("Pilih opsi dengan memasukan angka: ");
    }

    public static void tambahRestoranHeader() {
        System.out.println("=====================================================================");
        System.out.println("||                          TAMBAH RESTORAN                        ||");
        System.out.println("||                            Admin Menu                           ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||       Mohon masukkan restoran baru dengan informasi di bawah    ||");
        System.out.println("||                  Nama Restoran, Alamat Restoran                 ||");
        System.out.println("=====================================================================");
    }
    public static void addRestorantAgain(){
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                   Restoran berhasil ditambahkan!                ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                  Lanjutkan menambahkan restoran?                ||");
        System.out.println("||                                                                 ||");
        System.out.println("||                  1. Ya                   2. Tidak               ||");
        System.out.println("=====================================================================");
        System.out.print("Masukan pilihan berupa angka: ");
    }

    public static void addMenu(){
        System.out.println("=====================================================================");
        System.out.println("||                             Tambah Menu                         ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                                                                 ||");
        System.out.println("||   [1] Tambah Makanan                                            ||");
        System.out.println("||   [2] Tambah Minuman                                            ||");
        System.out.println("||   [0] Selesai                                                   ||");
        System.out.println("=====================================================================");
    }

    public static void errorAddRestorantIfDontAddMenu(){
        System.out.println("=====================================================================");
        System.out.println("||                   Tidak Dapat Menambah Restoran                 ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                Tolong Masukkan Menu Terlebih dahulu             ||");
        System.out.println("||                      Tekan Enter Untuk Kembali                  ||");
        System.out.println("=====================================================================");
    }
    
    public static void succesMessageMenu(){
        System.out.println("=====================================================================");
        System.out.println("||                      Menu Berhasil ditambahkan                  ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||             Tekan Enter Untuk Kembali Menambahkan Menu          ||");
        System.out.println("=====================================================================");
    }

    
    public static void ThereIsNotFoodInThisRestorant(){
        System.out.println("=====================================================================");
        System.out.println("||                Tidak Ada Makanan di Restoran Ini                ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||             Tekan Enter Untuk Kembali Menambahkan Menu          ||");
        System.out.println("=====================================================================");
    }

    public static void ThereIsNotDrinkInThisRestorant(){
        System.out.println("=====================================================================");
        System.out.println("||                Tidak Ada Minuman di Restoran Ini                ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||             Tekan Enter Untuk Kembali Menambahkan Menu          ||");
        System.out.println("=====================================================================");
    }

    public static void ThereIsNotRestorant(){
        System.out.println("=====================================================================");
        System.out.println("||                 Tidak Ada Restoran yang Tersedia                ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                 Tekan Enter Untuk Kembali ke Menu               ||");
        System.out.println("=====================================================================");
    }

    public static void succesDeleteRestoran(){
        System.out.println("=====================================================================");
        System.out.println("||                      Restoran Berhasil Dihapus                  ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                   Tekan Enter Untuk Kembali ke Menu             ||");
        System.out.println("=====================================================================");
    }

    public static void notFoundIDResto(){
        System.out.println("=====================================================================");
        System.out.println("||            Restoran Dengan ID Tersebut Tidak Tersedia           ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                Tekan Enter Untuk Kembali ke Menu                ||");
        System.out.println("=====================================================================");
    }

    public static void succesRestorantMenu(){
        System.out.println("=====================================================================");
        System.out.println("||                     Restoran Berhasil ditambahkan               ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                Tekan Enter Untuk Kembali ke Menu Admin          ||");
        System.out.println("=====================================================================");
    }

    public static void ThereIsNotCategory(){
        System.out.println("=====================================================================");
        System.out.println("||                 Tidak Ada Kategori yang Tersedia                ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                 Tekan Enter Untuk Kembali ke Menu               ||");
        System.out.println("=====================================================================");
    }

    public static void menuFooter() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                      Tekan Enter untuk kembali                  ||");
        System.out.println("=====================================================================");
    }
    public static void restoFooter() {
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                      Tekan Enter untuk kembali                  ||");
        System.out.println("=====================================================================");
    }

    public static void addItemLainnya(){
        System.out.println("=====================================================================");
        System.out.println("||                      Tambah Item Lainnya                        ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                                                                 ||");
        System.out.println("||          [1] Iya                            [2] Tidak           ||");
        System.out.println("=====================================================================");
    }

    public static void tambahPesanan(){
        System.out.println("=====================================================================");
        System.out.println("||                          Tambah Pesanan                         ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                                                                 ||");
        System.out.println("||   [1] Pesan Makanan                                             ||");
        System.out.println("||   [2] Pesan Minuman                                             ||");
        System.out.println("=====================================================================");
    }

    public static void emptyOrderData(){
        System.out.println("=====================================================================");
        System.out.println("||    Tidak terdapat data order, pesan terlebih dahulu ke menu     ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                    Tekan Enter Untuk Kembali                    ||");
        System.out.println("=====================================================================");
    }
    public static void footerStandar(){
        System.out.println("=====================================================================");
    }
    public static void ThereIsNotIdInMenu(){
        System.out.println("=====================================================================");
        System.out.println("||                     Tidak Ada ID yang Sesuai                    ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||           Tekan Enter Untuk Kembali ke Menu Pesanan             ||");
        System.out.println("=====================================================================");
    }

    
}
