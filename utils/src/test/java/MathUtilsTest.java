import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    void testAddTwoNumbers(){
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.addTwoNumbers(7, 12);
        assertEquals(19, result, "7 + 12 should equal 19");
    }
}
