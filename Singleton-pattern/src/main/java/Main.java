public class Main {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.printSomething("Hello World");

        Singleton instance1 = Singleton.getInstance();
        instance1.printSomething("Hello World");

        System.out.println("Prints count: " + instance.getNumberOfPrints());
    }
}
