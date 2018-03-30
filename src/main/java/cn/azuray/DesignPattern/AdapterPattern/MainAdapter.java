package azuray.DesignPattern.AdapterPattern;

public class MainAdapter {
    //1    适配器对象实现原有接口
    //2    适配器对象组合一个实现新接口的对象（这个对象也可以不实现一个接口，只是一个单纯的对象）
    //3    对适配器原有接口方法的调用被委托给新接口的实例的特定方法

    public static void main(String[] args) {
        DBSocketInterface db = new DBSocket();
        Hotel hotel = new Hotel(db);
        hotel.charge();
        System.out.println("使用适配器后");
        GBSocketInterface gb = new GBSocket();
        SocketAdapter adapter = new SocketAdapter(gb);
        hotel.setDbSocket(adapter);
        hotel.charge();
    }
}
