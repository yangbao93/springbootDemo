package azuray.DesignPattern.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class MainIterator {

    public static void main(String[] args) {
        List<Object> list = new ArrayList<Object>();
        list.add("first");
        list.add("second");
        list.add("third");
        Container container = new ConcreteContainer(list);
        container.add("fourth");
        Iterator iterator = container.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
