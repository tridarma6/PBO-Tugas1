import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food("Ayam", 20));
        foods.add(new Food("Nasi", 10));

        ArrayList<Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Es", 10));
        drinks.add(new Drink("Boba", 10));
        Restaurant restaurant = new Restaurant("MCD", "Jalan", foods, drinks);
        Admin.restaurants.add(restaurant);

        ArrayList<Food> foods2 = new ArrayList<>();
        foods.add(new Food("Ayam", 20));
        foods.add(new Food("Nasi", 10));

        ArrayList<Drink> drinks2 = new ArrayList<>();
        drinks.add(new Drink("Es", 10));
        drinks.add(new Drink("Boba", 10));
        Restaurant restaurant2 = new Restaurant("Gacoan", "Jalan Ngurah rai", foods2, drinks2);
        Admin.restaurants.add(restaurant2);
        Clear.screen();
        Login.login();
    }
}