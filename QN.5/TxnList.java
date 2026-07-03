import java.util.*;

public class TxnList<T> {
    private final List<T> items;

    public TxnList(List<T> items){
        this.items = new ArrayList<>(items);
    }

    public List<T> getItems(){
        return Collections.unmodifiableList(items);
    }
}
