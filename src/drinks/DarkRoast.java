package drinks;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        this.description = "drinks.DarkRoast";
        return description;
    }

    @Override
    public double cost() {
        return 2.55;
    }
}
