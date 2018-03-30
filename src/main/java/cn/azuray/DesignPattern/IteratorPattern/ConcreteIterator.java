package azuray.DesignPattern.IteratorPattern;

import java.util.List;

/**
 * 具体迭代器角色
 */
public class ConcreteIterator implements Iterator{
    private List<Object> list;

    private int cursor;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    public Object first() {
        cursor = 0;
        return list.get(cursor);
    }

    public Object next() {
        Object nxt = null;
        if (hasNext()) {
            nxt = list.get(cursor);
        }
        cursor++;
        return nxt;
    }

    public boolean hasNext() {
        if (cursor < list.size()) {
            return true;
        }
        return false;
    }

    public Object currentItem() {
        return list.get(cursor);
    }
}
