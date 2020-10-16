package Observer;

public class SecondObserver implements IObserver {
    Observable observable;

    public SecondObserver (Observable o) {
        this.observable = o;
    }

    public void update() {
        System.out.print("Second Observer ID:");
        System.out.println(observable.getID());
        System.out.println();
    }
}
