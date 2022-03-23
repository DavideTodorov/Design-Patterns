package pizzaStore;

import pizza.NYCheesePizza;
import pizza.NYPeperoniPizza;
import pizza.Pizza;

public class NYPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType.equals(PizzaType.PEPERONI)) {
            return new NYPeperoniPizza();
        }

        return new NYCheesePizza();
    }
}
