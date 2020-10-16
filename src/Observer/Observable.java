package Observer;

import java.util.ArrayList;

public class Observable {
    ArrayList<IObserver> observers = new ArrayList<>();

    private int ID = 0;

    public Observable () {}

    public void addObserver (IObserver observer) {
        this.observers.add(observer);
    }

    public void updateObservers () {
        observers.forEach(IObserver::update);
    }

    public void addToID (int number) {
        this.ID += number;

        updateObservers();
    }

    public int getID () {
        return this.ID;
    }
}
