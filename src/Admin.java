import java.util.ArrayList;
class Admin{
    private static ArrayList<Restaurant> restaurants; 
 
    //constructor Admin
     public Admin(){
         this.restaurants = new ArrayList<>();
     }
 
     // method untuk menambah restoran
     public void addRestoran(int id, String name, String address){
         Restaurant restaurant = new Restaurant(id, name, address);
         restaurants.add(restaurant);
         System.out.println("Restoran Berhasil ditambahkan");
         Input.apakahTambahRestoranLagi();
     }
 
     //method view semua restaurant
     public void viewRestaurants(){
         if(restaurants.isEmpty()){
             System.out.println("Tidak ada restoran yang tersedia");
             System.out.println();
         }else{
             CLS.clearScreen();
             System.out.println("Daftar Restoran Tersedia");
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
                 System.out.println();
                 break;
             }
         }
         if(!found){
             System.out.println("Restorant dengan ID tersebut tidak ditemukan.");
             System.out.println();
         }
     }
 
 }
 
