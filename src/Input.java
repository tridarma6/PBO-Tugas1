import java.util.Scanner;

class Input{
    private static Admin admin = new Admin();
    
    public static void input(){
        //membuat object admin
        //test
        // admin.addRestoran(1, "Restoran Ayam gepuk", "Jalan gunung");
        // admin.addRestoran(2, "Restoran Gaco", "Jalan Jimbo");
            Scanner scanner = new Scanner(System.in);
            tampilanMenu();
            int choice;
            choice = Validation.validationFourChoice();
            switch(choice){
            case 1:
            CLS.clearScreen();
            tambahRestoranHeader();
            inputAddRestoran();
            CLS.clearScreen();
            input();
            break;
            case 2:
            admin.viewRestaurants();
            scanner.nextLine();
            CLS.clearScreen();
            input();
            break;
            case 3:
            System.out.println("Masukkan ID Restoran yang akan dihapus : ");
            int idDelete = Validation.validationInteger();
            admin.deleteRestaurant(idDelete);
            scanner.nextLine();
            CLS.clearScreen(); 
            input();
            break;
            case 0:
            CLS.clearScreen();
            Login.login();
            break;
        }
        scanner.close();
    }

    public static void customerInput(){
        Scanner scanner = new Scanner(System.in);
        tampilanMenuCustomer();
        int choice = Validation.validationFourChoice();
        switch (choice) {
            case 1:
                CLS.clearScreen();
                break;
            case 2:
                CLS.clearScreen();
                break;
            case 3:
                CLS.clearScreen();
            case 0:
                CLS.clearScreen();
            default:
                break;
        }
    }

    public static void inputAddRestoran(){
        CLS.clearScreen();
        tambahRestoranHeader();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Restoran: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan Alamat Restoran: ");
        String address = scanner.nextLine();
        admin.addRestoran(name, address);
        scanner.close();
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

    public static void apakahTambahRestoranLagi() {
        CLS.clearScreen();
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                   Restoran berhasil ditambahkan!                ||");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("||                  Lanjutkan menambahkan restoran?                ||");
        System.out.println("||                                                                 ||");
        System.out.println("||                  1. Ya                   2. Tidak               ||");
        System.out.println("=====================================================================");
        System.out.print("Masukan pilihan berupa angka: ");
        int choice = Validation.validationTwoChoice();
        if(choice == 1){
            inputAddRestoran();
        }else{
            CLS.clearScreen();
            input();
        }
    }
}