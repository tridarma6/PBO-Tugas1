import java.util.*;

class Admin{
   private ArrayList<Restaurant> restaurants; 

   //constructor Admin
    public Admin(){
        this.restaurants = new ArrayList<>();
    }

    // method untuk menambah restoran
    public void addRestoran(int id, String name, String address){
        Restaurant restaurant = new Restaurant(id, name, address);
        restaurants.add(restaurant); // Memasukkan instance Restaurant ke dalam ArrayList
        System.out.println("Restoran Berhasil ditambahkan");
    }
    
    //method view semua restaurant
    public void viewRestaurants(){
        if(restaurants.isEmpty()){
            System.out.println("Tidak ada restoran yang tersedia");
        }else{
            System.out.println("Daftar Restoran Tersedia: ");
            for(Restaurant restaurant : restaurants){
                System.out.println("ID : " + restaurant.getId() + ", Restaurant :" + restaurant.getName() + ",Alamat: " + restaurant.getAddress());
            }
        }
    }

    //method untuk delete restorant berdasarkan id
    public void deleteRestaurant(int id){
        boolean found = false;
        for(int i = 0; i < restaurants.size(); i++){
            if(restaurants.get(i).getId() == id){
                restaurants.remove(i);
                found = true;
                System.out.println("Restaurant Berhasil di hapus");
                break;
            }
        }
        if(!found){
            System.out.println("Restorant dengan ID tersebut tidak ditemukan.");
        }
    }

}

class Input{
    static Admin admin = new Admin();
    public static void input(){
        //membuat object admin
        //test
        // admin.addRestoran(1, "Restoran Ayam gepuk", "Jalan gunung");
        // admin.addRestoran(2, "Restoran Gaco", "Jalan Jimbo");
            Scanner scanner = new Scanner(System.in);
           
            
            System.out.print("Pilihan Anda: ");
            int choice = Validation.validationFourChoice();
            switch(choice){
            case 1:
            System.out.print("Masukan ID Restoran: ");
            int id = Validation.validationInteger();
            System.out.print("Masukkan Nama Restoran: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan Alamat Restoran: ");
            String address = scanner.nextLine();
            admin.addRestoran(id, name, address);
            input();
            break;
            case 2:
            admin.viewRestaurants();
            input();
            break;
            case 3:
            System.out.println("Masukkan ID Restoran yang akan dihapus : ");
            int idDelete = Validation.validationInteger();
            admin.deleteRestaurant(idDelete); 
            input();
            break;
            case 0:
            Login.login();
            break;
        }
        scanner.close();
    }
}
