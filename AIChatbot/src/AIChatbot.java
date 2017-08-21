import IO.*;
/**
 * Class AIChatbot
 *
 * @author Gabriel Lucernas Pascual <me@ghabxph.info>
 * @version 1.0
 * @since 2017.08.21
 */
public class AIChatbot {
    private static boolean bye = false;
    /**
     * Main method
     */
    public static void main(String[] args)
    {
        greet();
        while (!isBye()) {
            think(Input.get());
            talk();
        }
    }

    private static void greet() {
        Output.println("Hello! My name is Robert. I am a chat robot developed by Gabriel Lucernas Pascual.");
        Output.print("How can I help you? ");
    }

    private static void think(String message) {
        bye = message.equals("bye");
    }

    private static void talk()
    {
        Output.print("I am sorry, I cannot understand what you are talking about. ");
    }

    private static boolean isBye() {
        return bye;
    }
}
