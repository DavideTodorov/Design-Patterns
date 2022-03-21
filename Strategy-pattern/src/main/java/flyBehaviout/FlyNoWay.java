package flyBehaviout;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public String fly() {
        return "Cannot fly";
    }
}
