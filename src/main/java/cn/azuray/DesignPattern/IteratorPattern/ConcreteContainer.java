package azuray.DesignPattern.IteratorPattern;

import java.util.List;

/**
 * 具体容器角色
 */
public class ConcreteContainer implements Container {
    private List<Object> list;

    public ConcreteContainer(List<Object> list) {
        this.list = list;
    }


    public void add(Object o) {
        list.add(o);
    }

    public void remove(Object o) {
        list.remove(o);
    }

    public Iterator createIterator() {
        return new ConcreteIterator(list);
    }
}
