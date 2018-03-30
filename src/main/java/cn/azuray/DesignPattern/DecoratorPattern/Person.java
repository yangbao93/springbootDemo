package azuray.DesignPattern.DecoratorPattern;

/**
 * componet基类
 */
public abstract class Person {
    String description = "unkonw";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
