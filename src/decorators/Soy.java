package decorators;

import drinks.Beverage;

public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", decorators.Soy";
    }

    @Override
    public double cost() {
        return 0.45 + beverage.cost();
    }

}
