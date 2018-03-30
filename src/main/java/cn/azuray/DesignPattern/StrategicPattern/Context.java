package azuray.DesignPattern.StrategicPattern;

public class Context {

    private IStrategic strategic;

    public Context(IStrategic strategic) {
        this.strategic = strategic;
    }

    public void excute() {
        strategic.doSomething();
    }

}
