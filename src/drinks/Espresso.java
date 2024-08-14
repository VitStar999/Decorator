package drinks;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        this.description = "drinks.Espresso";
        return description;
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
