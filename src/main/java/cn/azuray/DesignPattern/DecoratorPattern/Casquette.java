package azuray.DesignPattern.DecoratorPattern;

/**
 * 鸭舌帽装饰者
 */
public class Casquette extends HatDecorator {

    Person person;

    public Casquette(Person person) {
        this.person = person;
    }

    @Override
    public String getDescription() {
        return person.getDescription() +"a Casquette";
    }

    @Override
    public double cost() {
        return 20 + person.cost();
    }
}
