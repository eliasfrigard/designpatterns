package Observer;

public class FirstObserver implements IObserver {
    Observable observable;

    public FirstObserver (Observable o) {
        this.observable = o;
    }

    public void update() {
        System.out.print("First Observer ID:");
        System.out.println(observable.getID());
        System.out.println();
    }
}
