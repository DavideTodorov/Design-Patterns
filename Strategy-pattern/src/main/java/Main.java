import duck.Duck;
import duck.DummyDuck;
import duck.MallardDuck;
import flyBehaviout.FlyWithWings;
import quackBehaviour.Quack;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck dummyDuck = new DummyDuck();

        System.out.println(mallardDuck.performFly());
        System.out.println(mallardDuck.performQuack());

        System.out.println("-----");

        System.out.println(dummyDuck.performFly());
        System.out.println(dummyDuck.performQuack());

        System.out.println("-----");

        dummyDuck.setFlyBehaviour(new FlyWithWings());
        dummyDuck.setQuackBehaviour(new Quack());

        System.out.println(dummyDuck.performFly());
        System.out.println(dummyDuck.performQuack());
    }
}
