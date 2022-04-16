import java.util.Iterator;

public class DinerMenu {
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private String[] menu;

    public DinerMenu() {
        menu = new String[MAX_ITEMS];
        addItemsToMenu();
    }

    private void addItemsToMenu() {
        menu[0] = "Soup";
        menu[1] = "Salad";
        menu[2] = "Pork";
        menu[3] = "Stew";
        menu[4] = "Fish";
        menu[5] = "Stake";
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menu);
    }
}
