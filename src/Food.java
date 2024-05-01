public class Food extends Menu{
    int id;
    private static int nextID = 1;
    public Food(String name, double price) {
        super(name, price);
        this.id = nextID;
        nextID++; 
    }
    public int getID(){
        return this.id;
    }
}
