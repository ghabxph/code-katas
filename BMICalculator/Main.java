import java.util.Scanner;

/**
 * Startup class
 * @author  Gabriel Lucernas Pascual
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
        double bmi = getBMI(height, weight);
        System.out.printf("Your BMI is %f\n", bmi);
        displayInterpretations(bmi);
        displayGoal(height);
    }

    /**
     * Get input as Double double = new Double();
     * @return Returns input of user as double
     */
    private static double getDouble()
    {
        return new Scanner(System.in).nextDouble();
    }

    /**
     * Get input as integer
     * @return Returns the input of user as integer
     */
    private static int getInt()
    {
        return new Scanner(System.in).nextInt();
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
        int choice = getInt();
        if (choice == 1) {
            return getHeightAsCentimeter();
        } else if (choice == 2) {
            return getHeightAsFeetByInches();
        } else if (choice == 3) {
            System.exit(0);
            return 0; // Unreachable statement. Yeah I know...
        } else {
            System.out.println("Invalid input. Please try again!\n\n");
            return getHeight();
        }
    }

    /**
     * Gets height as centimeter, and converts it to meters
     * @return Returns height as meter
     */
    private static double getHeightAsCentimeter()
    {
        System.out.print("Please enter your height (in centimeters): ");
        return getDouble() / 100;
    }

    /**
     * Gets height as feet by inches, and converts it to meters
     * @return Returns height as meter
     */
    private static double getHeightAsFeetByInches()
    {
        System.out.println("Please enter your height as feet by inches.");
        System.out.print("Feet: ");
        double feet = getDouble();
        System.out.print("Inches: ");
        double inches = getDouble();
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
        int choice = getInt();
        if (choice == 1) {
            return getWeightAsKilogram();
        } else if (choice == 2) {
            return getWeightAsPound();
        } else if (choice == 3) {
            System.exit(0);
            return 0; // Unreachable statement. Yeah I know...
        } else {
            System.out.println("Invalid input. Please try again!\n\n");
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
        return getDouble();
    }

    /**
     * Get input weight as pound, and convert it to kilograms
     * @return Returns weight as kilogram
     */
    private static double getWeightAsPound()
    {
        System.out.print("Enter weight as pound: ");
        double pound = getDouble();
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
     * Get lowest normal weight
     * @param  height Height in meters
     * @return        Returns the lowest normal weight
     */
    private static double getLowestNormalWeight(double height)
    {
        return height * height * 18.5;
    }

    /**
     * Get highest normal weight
     * @param  height Height in meters
     * @return        Returns the highest normal weight
     */
    private static double getHighestNormalWeight(double height)
    {
        return height * height * 24.9;
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
    private static void displayGoal(double height)
    {
        String output = "Your weight goal to have a normal weight is to get a weight in between ";
        output += getLowestNormalWeight(height) + " to " + getHighestNormalWeight(height);
        System.out.println(output);
    }
}