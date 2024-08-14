import decorators.Milk;
import decorators.Mocha;
import decorators.Soy;
import decorators.Whip;
import drinks.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Beverage beverage = new Espresso();
        Beverage beverage1 = new DarkRoast();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());


        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        beverage1 = new Soy(beverage1);
        beverage1 = new Milk(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}