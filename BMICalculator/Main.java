
/**
 * Startup class
 * @author   Gabriel Lucernas Pascual
 * @version  1.1
 * @since    2017.08.15
 */
public class Main
{
    private static final double FEET_TO_METER     = 0.3048;
    private static final double INCHES_TO_METER   = 0.0254;
    private static final double POUND_TO_KILOGRAM = 0.45359237;

    /**
     * Program startup
     */
    public static void main(String[] args)
    {
        double height = getHeight();
        double weight = getWeight();
        BodyMassIndex bmi = new BodyMassIndex(height, weight);
        System.out.printf("Your BMI is %f\n", bmi.getBMI());
        displayInterpretations(bmi.getBMI());
        displayGoal(bmi.getNormalWeightRange());
    }

    /**
     * Gets the height as meter
     * @return double
     */
    private static double getHeight()
    {
        System.out.println("Enter height as:");
        System.out.println("    1. Centimeter");
        System.out.println("    2. Feet by inches");
        System.out.println("    3. Exit application");
        System.out.print("Your choice: ");
        int choice = Input.getInt();
        if (choice == 1) {
            return getHeightAsCentimeter();
        } else if (choice == 2) {
            return getHeightAsFeetByInches();
        } else if (choice == 3) {
            System.exit(0);
            return 0; // Unreachable statement. Yeah I know...
        } else {
            showInvalidInputMessage();
            return getHeight();
        }
    }

    /**
     * Gets height as centimeter, and converts it to meters
     * @return Returns height as meter
     */
    private static double getHeightAsCentimeter()
    {
        System.out.print("Please enter the height in centimeters: ");
        return Input.getDouble() / 100;
    }

    /**
     * Gets height as feet by inches, and converts it to meters
     * @return Returns height as meter
     */
    private static double getHeightAsFeetByInches()
    {
        System.out.println("Please enter the height as feet by inches.");
        System.out.print("Feet: ");
        double feet = Input.getDouble();
        System.out.print("Inches: ");
        double inches = Input.getDouble();
        return convertFeetByInchesToMeter(feet, inches);
    }

    /**
     * Converts feet by inches to meter
     * @param  feet   The 5' part (self explanatory)
     * @param  inches The 9" part (self explanatory)
     * @return        Height as meter from feet and inches
     */
    private static double convertFeetByInchesToMeter(double feet, double inches)
    {
        double meter;
        meter  = feet   * FEET_TO_METER;
        meter += inches * INCHES_TO_METER;
        return meter;
    }

    /**
     * Get weight as kilogram
     * @return Returns weight as kilogram
     */
    private static double getWeight()
    {
        System.out.println("Enter weight as: ");
        System.out.println("    1. Kilograms");
        System.out.println("    2. Pounds");
        System.out.println("    3. Exit the program");
        System.out.print("Enter your choice: ");
        int choice = Input.getInt();
        if (choice == 1) {
            return getWeightAsKilogram();
        } else if (choice == 2) {
            return getWeightAsPound();
        } else if (choice == 3) {
            System.exit(0);
            return 0; // Unreachable statement. Yeah I know...
        } else {
            showInvalidInputMessage();
            return getWeight();
        }
    }

    /**
     * Get input weight as kilogram
     * @return Returns weight as kilogram
     */
    private static double getWeightAsKilogram()
    {
        System.out.print("Enter weight as kilogram: ");
        return Input.getDouble();
    }

    /**
     * Get input weight as pound, and convert it to kilograms
     * @return Returns weight as kilogram
     */
    private static double getWeightAsPound()
    {
        System.out.print("Enter weight as pound: ");
        double pound = Input.getDouble();
        return pound / POUND_TO_KILOGRAM;
    }

    /**
     * Computes the BMI from height and weight
     * @param  height Height in meters
     * @param  weight Weight in kilograms
     * @return        Returns the Body Mass Index (BMI)
     */
    private static double getBMI(double height, double weight)
    {
        return weight / (height * height);
    }

    /**
     * Prints a message telling that the input is invalid
     */
    private static void showInvalidInputMessage()
    {
        System.out.println("\n\nInvalid input. Please try again!");
    }

    /**
     * Display the BMI interpretatios
     * @param  bmi Body Mass Index
     */
    private static void displayInterpretations(double bmi)
    {
        String output = "The body mass index indicates that the person is ";
        if (bmi >= 30) {
            output += "obese";
        } else if (bmi < 30 && bmi >= 25) {
            output += "overweight";
        } else if (bmi < 25 && bmi >= 18.5) {
            output += "normal";
        } else {
            output += "under weight";
        }
        System.out.println(output);
    }

    /**
     * Display the goal weight to become normal
     * @param height Height in meter
     */
    private static void displayGoal(DoubleRange range)
    {
        String output = "Your weight goal to have a normal weight is to get a weight in between ";
        output += range.getMinimum() + " to " + range.getMaximum();
        System.out.println(output);
    }
}