package azuray.DesignPattern.DecoratorPattern;

/**
 * ConcreteComponet被装饰者
 */
public class Teenger extends Person{

    public Teenger() {
        description = "Shopping List:";
    }

    @Override
    public double cost() {
        return 0;
    }
}
