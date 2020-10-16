package Command;

public class RecieverLightBulb {
    private boolean isLightOn;

    public RecieverLightBulb() {}

    public void turnOn () {
        this.isLightOn = true;
    }

    public void turnOff () {
        this.isLightOn = false;
    }

    public boolean isLightOn () {
        return this.isLightOn;
    }
}
