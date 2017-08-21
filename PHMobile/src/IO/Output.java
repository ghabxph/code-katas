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
     * Prints output with newline
     * @param message  Message to display
     */
    public static void println(String message) {
        printf(message + "\n");
    }

    /**
     * Prints output without new line
     * @param message
     */
    public static void print(String message) {
        System.out.print(message);
    }

    /**
     * Prints a formatted text (without newline)
     * @param message
     * @param args
     */
    public static void printf(String message, String... args) {
        System.out.printf(message, args);
    }

    /**
     * Prints a formatted text with newline
     * @param message
     * @param args
     */
    public static void printlnf(String message, String... args) {
        System.out.printf(message + "\n", args);
    }
}
