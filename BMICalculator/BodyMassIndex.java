
/**
 * Body Mass Index (BMI) calculator
 * @author  Gabriel Lucernas Pascual
 * @version 1.0
 * @since   2017.08.16
 */
public class BodyMassIndex
{
    /**
     * The body mass index
     */
    private double bmi;

    /**
     * Normal weight range
     */
    private DoubleRange weightRange;

    /**
     * Initializes BMI Calculator. Requires height and weight
     * @param  heightInMeter Requires height in meters
     * @param  weightInKg    Requires weight in kilograms
     */
    public BodyMassIndex(double heightInMeter, double weightInKg)
    {
        this.bmi = weightInKg / (heightInMeter * heightInMeter);
        this.weightRange = new NormalWeightRange(heightInMeter);
    }

    /**
     * Returns the calculated body mass index
     * @return Body Mass Index (BMI)
     */
    public double getBMI()
    {
        return this.bmi;
    }

    /**
     * Gets the normal weight range
     * @return Returns the range of normal weight
     */
    public DoubleRange getNormalWeightRange()
    {
        return weightRange;
    }
}