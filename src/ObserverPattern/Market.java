package ObserverPattern;

public class Market {
    public static void main(String[] args) {
        Product rice = new Product("El-Doha Rice");

        Client omar = new Client("Omar");
        Client ali = new Client("Ali");
        Client tarek = new Client("Tarek");

        rice.add(omar);
        rice.add(ali);
        rice.add(tarek);
        rice.remove(tarek);


        rice.setAvailablity(true);






    }
}
