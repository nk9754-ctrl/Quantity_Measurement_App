public class QuantityMeasurementAppTest {

    public static void main(String[] args) {

        System.out.println("Feet to Inches: " +
                QuantityMeasurementApp.QuantityLength.convert(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCHES));

        System.out.println("Round Trip Test:");

        double result =
                QuantityMeasurementApp.QuantityLength.convert(
                        QuantityMeasurementApp.QuantityLength.convert(
                                5.0,
                                QuantityMeasurementApp.LengthUnit.FEET,
                                QuantityMeasurementApp.LengthUnit.INCHES),
                        QuantityMeasurementApp.LengthUnit.INCHES,
                        QuantityMeasurementApp.LengthUnit.FEET);

        System.out.println(result);
    }
}
