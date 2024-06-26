import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MathUtilsAssertJTest {

    @Test
    void testAddTwoNumbersWithAssertJ() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.addTwoNumbers(11, 10);
        assertThat(result).isEqualTo(21);
    }
}
