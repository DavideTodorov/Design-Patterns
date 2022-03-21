package duck;

import flyBehaviout.FlyWithWings;
import quackBehaviour.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
}
