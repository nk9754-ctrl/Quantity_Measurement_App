import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Quantity_Measurement_AppTest {

    @Test
    void testFeetToFeet() {
        Quantity_Measurement_App.QuantityLength q1 =
                new Quantity_Measurement_App.QuantityLength(1.0,
                        Quantity_Measurement_App.LengthUnit.FEET);

        Quantity_Measurement_App.QuantityLength q2 =
                new Quantity_Measurement_App.QuantityLength(1.0,
                        Quantity_Measurement_App.LengthUnit.FEET);

        assertEquals(q1, q2);
    }

    @Test
    void testFeetToInch() {
        Quantity_Measurement_App.QuantityLength q1 =
                new Quantity_Measurement_App.QuantityLength(1.0,
                        Quantity_Measurement_App.LengthUnit.FEET);

        Quantity_Measurement_App.QuantityLength q2 =
                new Quantity_Measurement_App.QuantityLength(12.0,
                        Quantity_Measurement_App.LengthUnit.INCH);

        assertEquals(q1, q2);
    }

    @Test
    void testDifferentValues() {
        Quantity_Measurement_App.QuantityLength q1 =
                new Quantity_Measurement_App.QuantityLength(1.0,
                        Quantity_Measurement_App.LengthUnit.FEET);

        Quantity_Measurement_App.QuantityLength q2 =
                new Quantity_Measurement_App.QuantityLength(2.0,
                        Quantity_Measurement_App.LengthUnit.FEET);

        assertNotEquals(q1, q2);
    }

    @Test
    void testNullComparison() {
        Quantity_Measurement_App.QuantityLength q1 =
                new Quantity_Measurement_App.QuantityLength(1.0,
                        Quantity_Measurement_App.LengthUnit.FEET);

        assertFalse(q1.equals(null));
    }

    @Test
    void testDifferentType() {
        Quantity_Measurement_App.QuantityLength q1 =
                new Quantity_Measurement_App.QuantityLength(1.0,
                        Quantity_Measurement_App.LengthUnit.FEET);

        assertFalse(q1.equals("test"));
    }
}