package azuray.DesignPattern.IteratorPattern;

/**
 * 容器角色
 */
public interface Container {
    void add(Object o);

    void remove(Object o);

    Iterator createIterator();
}
