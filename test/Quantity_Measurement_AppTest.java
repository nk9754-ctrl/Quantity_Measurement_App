import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Quantity_Measurement_AppTest {

    @Test
    void testYardToFeet() {
        var q1 = new Quantity_Measurement_App.QuantityLength(1.0,
                Quantity_Measurement_App.LengthUnit.YARD);

        var q2 = new Quantity_Measurement_App.QuantityLength(3.0,
                Quantity_Measurement_App.LengthUnit.FEET);

        assertEquals(q1, q2);
    }

    @Test
    void testYardToInch() {
        var q1 = new Quantity_Measurement_App.QuantityLength(1.0,
                Quantity_Measurement_App.LengthUnit.YARD);

        var q2 = new Quantity_Measurement_App.QuantityLength(36.0,
                Quantity_Measurement_App.LengthUnit.INCH);

        assertEquals(q1, q2);
    }

    @Test
    void testCMToInch() {
        var q1 = new Quantity_Measurement_App.QuantityLength(1.0,
                Quantity_Measurement_App.LengthUnit.CM);

        var q2 = new Quantity_Measurement_App.QuantityLength(0.393701,
                Quantity_Measurement_App.LengthUnit.INCH);

        assertEquals(q1, q2);
    }

    @Test
    void testDifferentValues() {
        var q1 = new Quantity_Measurement_App.QuantityLength(1.0,
                Quantity_Measurement_App.LengthUnit.YARD);

        var q2 = new Quantity_Measurement_App.QuantityLength(2.0,
                Quantity_Measurement_App.LengthUnit.FEET);

        assertNotEquals(q1, q2);
    }

    @Test
    void testNullComparison() {
        var q1 = new Quantity_Measurement_App.QuantityLength(1.0,
                Quantity_Measurement_App.LengthUnit.YARD);

        assertFalse(q1.equals(null));
    }
}