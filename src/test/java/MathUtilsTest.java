import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    void testComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "should return circle area ");
    }

    @Test
    void testNFirstNumber() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(10, mathUtils.nFirstNumber(4), "should return circle area ");
        assertEquals(15, mathUtils.nFirstNumber(5), "should return circle area ");

        Assertions.assertThrows(IllegalArgumentException.class,()->{
            mathUtils.nFirstNumber(-5);
        });
    }
    @Test
    void simpleArraySum() {
        MathUtils mathUtils = new MathUtils();
        assertEquals(31, mathUtils.simpleArraySum(new int[]{1, 2, 3, 4, 10, 11}), "should return circle area ");
    }
}
