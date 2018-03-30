package azuray.DesignPattern.AdapterPattern;

public class Hotel {
    private DBSocketInterface dbSocket;

    public Hotel(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void setDbSocket(DBSocketInterface dbSocket) {
        this.dbSocket = dbSocket;
    }

    public void charge() {
        dbSocket.powerWithTwoRound();
    }
}
