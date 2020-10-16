import Observer.FirstObserver;
import Observer.Observable;
import Observer.SecondObserver;

import Command.Invoker;
import Command.LightOffCommand;
import Command.LightOnCommand;
import Command.RecieverLightBulb;

public class Main {

    public static void main(String[] args) {
        commandPattern();
    }

    private static void observerPattern () {
        Observable o = new Observable();

        FirstObserver fo = new FirstObserver(o);
        SecondObserver so = new SecondObserver(o);

        o.addObserver(fo);
        o.addObserver(so);

        o.addToID(1);
        o.addToID(5);
        o.addToID(3);
    }

    private static void commandPattern () {
        RecieverLightBulb light = new RecieverLightBulb();

        // Instantiate a new Invoker with commands.
        Invoker invoker = new Invoker(new LightOnCommand(light), new LightOffCommand(light));

        // Turn the light on and off ten times. Like disco.
        for (int i = 0; i < 10; i++) {
            invoker.switchOn();

            // If the light is on...
            if (light.isLightOn()) {
                System.out.println("The light is now on!");
            }

            invoker.switchOff();

            // If the light is off...
            if (!light.isLightOn()) {
                System.out.println("The light is now off!");
            }
        }
    }
}
