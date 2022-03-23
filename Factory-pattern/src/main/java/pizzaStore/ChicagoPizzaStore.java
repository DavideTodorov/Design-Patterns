package pizzaStore;

import pizza.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType.equals(PizzaType.CHEESE)) {
            return new ChicagoCheesePizza();
        }

        return new ChicagoPeperoniPizza();
    }
}
