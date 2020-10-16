package Singleton;

/**
 * The Singleton pattern makes sure that there is only ever one instance of this class.
 */
public class Singleton {

    // Private static instance of Singleton.
    private static Singleton instance;

    // Private constructor.
    private Singleton () {}

    public static Singleton getInstance() {
        // Instantiate the singleton if it doesn't already exist.
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    /* Class behaviour go below here. */
}
