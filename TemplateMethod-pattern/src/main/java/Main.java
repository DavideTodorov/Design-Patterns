public class Main {

    public static void main(String[] args) {

        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        tea.prepareRecipe();
        System.out.println("-------");
        coffee.prepareRecipe();
    }
}
