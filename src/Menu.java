public class Menu {
    
    String food;
    String drink;
    double priceFood;
    double priceDrink;
    
    public Menu(String food, String drink, double priceFood, double priceDrink) {
        this.food = food;
        this.drink = drink;
        this.priceFood = priceFood;
        this.priceDrink = priceDrink;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public double getPriceFood() {
        return priceFood;
    }

    public void setPriceFood(double priceFood) {
        this.priceFood = priceFood;
    }

    public double getPriceDrink() {
        return priceDrink;
    }

    public void setPriceDrink(double priceDrink) {
        this.priceDrink = priceDrink;
    }

    
}
