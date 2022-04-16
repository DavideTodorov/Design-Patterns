import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();

        Iterator iterator = dinerMenu.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
