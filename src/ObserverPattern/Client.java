package ObserverPattern;

public class Client implements Observer {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(" New Notification "+ this.name +" " + message);

    }
}
