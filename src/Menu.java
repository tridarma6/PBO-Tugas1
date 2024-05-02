public class Menu {
    
    String name;
    double price;
    static int id;
    
    public Menu(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getID() {
        return id;
    }

    
}
