import org.example.ExpenseValidator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExpenseValidatorTest {
    private final ExpenseValidator validator = new ExpenseValidator();

    @Test
    void shouldReturnTrueWhenAmountIsPositive() {
        assertTrue(validator.isValidAmount(100.50));
    }
    @Test
    void shouldReturnFalseWhenAmountIsZero() {
        assertFalse(validator.isValidAmount(0));
    }
    @Test
    void shouldReturnFalseWhenAmountIsNegative() {
        assertFalse(validator.isValidAmount(-50.0));
    }
}
