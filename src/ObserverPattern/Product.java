package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private String name;
    private String availablity;
    private List<Observer> observerList;

    public Product(String name) {
        this.name = name;
        this.observerList = new ArrayList<>();
    }

    @Override
    public void add(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);

    }

    @Override
     public void notifyObserver() {
        for (Observer observer:observerList){
            observer.update(availablity);
        }

    }

    public void setAvailablity(boolean available) {
        if (available == true){
            availablity = this.name +" " + "Available";
        }
        else {availablity = this.name + " Not Available";}

        notifyObserver();
    }
}
