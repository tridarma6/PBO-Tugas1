import java.util.ArrayList;

public class Restaurant {
    
    String name;
    String address;
    int id;
    public ArrayList<Food> foods;
    public ArrayList<Drink> drinks;

    public Restaurant(int id, String name, String address, ArrayList<Food> foods, ArrayList<Drink> drinks) {
        this.name = name;
        this.address = address;
        this.id = id;
        this.foods = foods;
        this.drinks = drinks;
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
