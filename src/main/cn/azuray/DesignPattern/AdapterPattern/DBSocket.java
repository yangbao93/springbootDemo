package azuray.DesignPattern.AdapterPattern;

public class DBSocket implements DBSocketInterface {

    public void powerWithTwoRound() {
        System.out.println("德国使用圆头的插座！");
    }
}
