import pizza.Pizza;
import pizzaStore.ChicagoPizzaStore;
import pizzaStore.NYPizzaStore;
import pizzaStore.PizzaStore;
import pizzaStore.PizzaType;

public class Main {

    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyCheesePizza = nyPizzaStore.createPizza(PizzaType.PEPERONI);
        System.out.println(nyCheesePizza.getDescription());

        Pizza chicagoPeperoniPizza = chicagoPizzaStore.createPizza(PizzaType.CHEESE);
        System.out.println(chicagoPeperoniPizza.getDescription());
    }
}
