import org.example.AnalyticsService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnalyticsServiceTest {
    private final AnalyticsService service = new AnalyticsService();

    @Test
    void shouldCalculateCorrectPercentage() {
        assertEquals(25.0, service.calculatePercentage(25.0, 100.0));
    }
    @Test
    void shouldReturnZeroWhenTotalSpentIsZero() {
        assertEquals(0.0, service.calculatePercentage(50.0, 0));
    }
    @Test
    void shouldReturnZeroWhenTotalSpentIsNegative() {
        assertEquals(0.0, service.calculatePercentage(50.0, -100.0));
    }
}
