//Author: Kariny Oliveira
//Student Number: CT1004878

//Generic class Box <T>
public class Box<T> {
	//Generic item with no type
    private T item;

    //Constructor
    public Box() {
        this.item = null;
    }

    //Getter ans Setter methods to manipulate the item T
    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
