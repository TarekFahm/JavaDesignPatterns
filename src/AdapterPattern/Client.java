package AdapterPattern;

public class Client {
    public static void main(String[] args) {
        CellPhone iphone = new Iphone();
        CellPhone samsung = new SamsungAdapter(new Samsung());
        iphone.AppStore();
        samsung.AppStore();

    }
}
