public class Main {

    public static void main(String[] args) {
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
