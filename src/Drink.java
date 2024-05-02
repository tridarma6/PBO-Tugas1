public class Drink extends Menu{

    int no;
    private static int nextID = 1;
    public Drink(String name, double price) {
        super(name, price, id);
        Menu.id = nextID;
        this.no = nextID;
        nextID++;
        //TODO Auto-generated constructor stub
    }
    public int getID(){
        return this.no;
    }
    
}
