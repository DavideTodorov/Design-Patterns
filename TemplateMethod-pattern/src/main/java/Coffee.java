public class Coffee extends CaffeineBeverage {


    @Override
    public void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk to the coffee");
    }

}
