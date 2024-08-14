package decorators;

import drinks.Beverage;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", decorators.Whip";
    }

    @Override
    public double cost() {
        return 0.30 + beverage.cost();
    }
}