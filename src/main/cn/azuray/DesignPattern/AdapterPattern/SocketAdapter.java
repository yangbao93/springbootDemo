package azuray.DesignPattern.AdapterPattern;

public class SocketAdapter implements DBSocketInterface {

    private GBSocketInterface gbSocketInterface;

    public SocketAdapter(GBSocketInterface gbSocketInterface) {
        this.gbSocketInterface = gbSocketInterface;
    }

    public void powerWithTwoRound() {
        gbSocketInterface.powerWithThreeFlat();
    }
}
