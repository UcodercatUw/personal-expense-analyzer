import org.example.BudgetService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BudgetServiceTest {
    private final BudgetService service = new BudgetService();

    @Test
    void shouldReturnTrueWhenBudgetIsExceeded() {
        assertTrue(service.isBudgetExceeded(80, 30, 100));
    }
    @Test
    void shouldReturnFalseWhenBudgetIsNotExceeded() {
        assertFalse(service.isBudgetExceeded(50, 30, 100));
    }
    @Test
    void shouldReturnFalseWhenBudgetIsExactlyLimit() {
        assertFalse(service.isBudgetExceeded(70, 30, 100));
    }
}
