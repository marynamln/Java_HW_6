import org.example.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "7, 3, 10",
            "0, 5, 5"
    })

    void testAddTwoNumbersParameterized(int a, int b, int expected) {
        MathUtils mathUtils = new MathUtils();
        assertEquals(expected, mathUtils.addTwoNumbers(a, b), () -> a + " + " + b + " should equal " + expected);
    }
}
