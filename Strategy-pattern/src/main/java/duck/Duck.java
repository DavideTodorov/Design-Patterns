package duck;

import flyBehaviout.FlyBehaviour;
import quackBehaviour.QuackBehaviour;

public abstract class Duck {
    protected QuackBehaviour quackBehaviour;
    protected FlyBehaviour flyBehaviour;


    public String performFly() {
        return flyBehaviour.fly();
    }

    public String performQuack() {
        return quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
