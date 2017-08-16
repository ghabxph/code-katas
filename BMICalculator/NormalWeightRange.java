
/**
 * Calculates the normal weight range using height.
 * @author  Gabriel Lucernas Pascual'
 * @version 1.0
 * @since   2017.08.16
 */
public class NormalWeightRange implements DoubleRange
{
    private final double MIN_BMI = 18.5;
    private final double MAX_BMI = 24.9;

    /**
     * Height in meters (squared)
     */
    private double heightSquared;

    /**
     * Initializes the normal weight range using height
     * @param  heightInMeters Height in meters
     */
    public NormalWeightRange(double heightInMeters)
    {
        this.heightSquared = heightInMeters * heightInMeters;
    }

    /**
     * Get the minimum normal weight
     * @return Returns the minimum normal weight
     */
    public double getMinimum()
    {
        return heightSquared * MIN_BMI;
    }

    /**
     * Get the maximum normal weight
     * @return returns the maximum normal weight
     */
    public double getMaximum()
    {
        return heightSquared * MAX_BMI;
    }
}