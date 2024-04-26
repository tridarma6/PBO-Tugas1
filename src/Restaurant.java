public class Restaurant {
    
    String name;
    String address;
    Menu menu;
    int id;
    public Restaurant(String name, String address, Menu menu, int id) {
        this.name = name;
        this.address = address;
        this.menu = menu;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Menu getMenu() {
        return menu;
    }
    public int getId() {
        return id;
    }

    
}
