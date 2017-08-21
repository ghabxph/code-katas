package IO;

/**
 * Class Output
 *
 * @author Gabriel Lucernas Pascual <me@ghabxph.info>
 * @version 1.0
 * @since 2017.08.21
 */
public class Output {
    /**
     * Display output message
     * @param message  Message to display
     */
    public static void println(String message) {
        printf(message + "\n");
    }

    public static void print(String message) {
        printf(message);
    }

    public static void printf(String message, String... args) {
        System.out.printf(message, args);
    }

    private static void printf(String message)
    {
        System.out.printf(message);
    }
}
