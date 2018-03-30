package azuray.DesignPattern.IteratorPattern;

/**
 * 迭代器角色
 */
public interface Iterator {
    public Object first();

    public Object next();

    public boolean hasNext();

    public Object currentItem();

}
