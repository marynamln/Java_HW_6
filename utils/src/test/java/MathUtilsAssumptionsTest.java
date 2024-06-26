import org.example.MathUtils;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsAssumptionsTest {

    @Test
    void testAddTwoNumbersWithAssumptions(){
        MathUtils mathUtils = new MathUtils();
        int a = 15;
        int b = 3;
        Assumptions.assumeTrue(a > 0 && b > 0, "Both numbers should be positive");
        int result = mathUtils.addTwoNumbers(a, b);
        assertEquals(18, result, "15 + 3 should equal 18");
    }
}
