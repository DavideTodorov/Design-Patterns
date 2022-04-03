public class Singleton {
    private static Singleton uniqueInstance;
    private int numberOfPrints;

    private Singleton() {
        numberOfPrints = 0;
    }

    public synchronized static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    public void printSomething(String word){
        System.out.println(word);
        numberOfPrints++;
    }

    public int getNumberOfPrints(){
        return numberOfPrints;
    }

}
