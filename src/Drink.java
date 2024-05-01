public class Drink extends Menu{
    int id;
    private static int nextID = 1;
    public Drink(String name, double price) {
        super(name, price);
        this.id = nextID;
        nextID++;
        //TODO Auto-generated constructor stub
    }
    public int getID(){
        return this.id;
    }
    
}
