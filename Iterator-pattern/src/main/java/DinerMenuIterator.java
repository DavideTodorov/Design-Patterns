import java.util.Iterator;

public class DinerMenuIterator implements Iterator<String> {
    private String[] menu;
    private int position = 0;

    public DinerMenuIterator(String[] menu) {
        this.menu = menu;
    }

    @Override
    public boolean hasNext() {
        if (position >= menu.length || menu[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String next() {
        String curr = menu[position];
        position++;
        return curr;

    }
}
