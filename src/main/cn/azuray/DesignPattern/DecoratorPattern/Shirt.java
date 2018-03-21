package azuray.DesignPattern.DecoratorPattern;

/**
 * 衬衣装饰着
 */
public class Shirt extends ClothingDecorator {

    Person person;

    public Shirt(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return person.getDescription() + "a shirt";
    }

    @Override
    public double cost() {
        return 10 + person.cost();
    }
}
