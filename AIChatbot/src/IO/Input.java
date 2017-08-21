package IO;
import java.util.Scanner;
/**
 * Class Input
 *
 * @author Gabriel Lucernas Pascual <me@ghabxph.info>
 * @version 1.0
 * @since 2017.08.21
 */
public class Input {

    /**
     * Get user input
     * @return Returns the user input that is captured from the screen
     */
    public static String get() {
        return (new Scanner(System.in)).nextLine();
    }
}
