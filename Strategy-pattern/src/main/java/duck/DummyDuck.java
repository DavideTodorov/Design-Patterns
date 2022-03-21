package duck;

import flyBehaviout.FlyNoWay;
import quackBehaviour.MuteQuack;

public class DummyDuck extends Duck {

    public DummyDuck() {
        quackBehaviour = new MuteQuack();
        flyBehaviour = new FlyNoWay();
    }
}
