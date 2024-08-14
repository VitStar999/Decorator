package drinks;

public class DarkRoast extends Beverage {
    @Override
    public String getDescription() {
        this.description = "DarkRoast";
        return description;
    }

    @Override
    public double cost() {
        return 2.55;
    }
}
