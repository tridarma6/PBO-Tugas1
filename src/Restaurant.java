public class Restaurant {
    
    String name;
    String address;
    int id;
    public Restaurant(int id, String name, String address) {
        this.name = name;
        this.address = address;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getId() {
        return id;
    }

    
}
