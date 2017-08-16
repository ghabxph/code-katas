import java.util.Scanner;

/**
 * Responsible for getting user input from the command line
 * @author  Gabriel Lucernas Pascual
 * @version 1.0
 * @since   2017.08.16
 */
public class Input
{
    /**
     * Get input as Double double = new Double();
     * @return Returns input of user as double
     */
    public static double getDouble()
    {
        try {
            return new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            System.out.print("Please enter a valid number: ");
            return getDouble();
        }
    }

    /**
     * Get input as integer
     * @return Returns the input of user as integer
     */
    public static int getInt()
    {
        try {
            return new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.print("Please enter a valid integer: ");
            return getInt();
        }
    }
}