package decorators;

import drinks.Beverage;

public class Milk extends CondimentDecorator{

    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", decorators.Milk";
    }

    @Override
    public double cost() {
        return 0.35 + beverage.cost();
    }
}
