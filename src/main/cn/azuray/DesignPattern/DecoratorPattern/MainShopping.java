package azuray.DesignPattern.DecoratorPattern;

public class MainShopping {
    public static void main(String[] args) {
        Person teenger = new Teenger();
        System.out.println(teenger.getDescription());
        teenger = new Shirt(teenger);
        System.out.println(teenger.getDescription());
        teenger = new Casquette(teenger);
        System.out.println(teenger.getDescription());
        System.out.println("cost:" + teenger.cost());
    }
}
