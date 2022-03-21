package quackBehaviour;

public class MuteQuack implements QuackBehaviour{
    @Override
    public String quack() {
        return "<Silence>";
    }
}
