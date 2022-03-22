import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import decorator.Mocha;
import decorator.Whip;

public class Main {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);

        System.out.println("Cost: " + beverage.cost());

    }
}
