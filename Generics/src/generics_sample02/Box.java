package generics_sample02;

public class Box <T> {

    private T item;

    public void addItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
