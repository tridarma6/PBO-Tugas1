import java.util.ArrayList;
<<<<<<< HEAD
public class Restaurant { 
=======

public class Restaurant {
    
>>>>>>> 364a5f43efe247ca0e2ae91f4ffa507bc3ae4468
    String name;
    String address;
    int id;
    public ArrayList<Food> foods;
    public ArrayList<Drink> drinks;

    private static int nextID = 1;

    public Restaurant(String name, String address, ArrayList<Food> foods, ArrayList<Drink> drinks) {
        this.name = name;
        this.address = address;
        this.foods = foods;
        this.drinks = drinks;
        this.id = nextID;
        nextID++;
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
    public void addFood(Food food){
        foods.add(food);
    }

    public void addDrink(Drink drink){
        drinks.add(drink);
    }
    
}
