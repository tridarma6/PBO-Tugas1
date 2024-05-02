public class Food extends Menu{
    int no;
    private static int nextID = 1;
    public Food(String name, double price) {
        super(name, price, id);
        this.no = nextID;
        Menu.id = nextID;
        nextID++; 
    }
    public int getID(){
        return this.no;
    }

    public String getName(){
        return this.name;
    }

}
