import org.example.CurrencyConverter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CurrencyConverterTest {
    private final CurrencyConverter converter = new CurrencyConverter();

    @Test
    void shouldConvertAmountCorrectly() {
        assertEquals(100.0, converter.convertToBaseCurrency(50.0, 2.0));
    }
    @Test
    void shouldReturnOriginalAmountWhenRateIsZero() {
        assertEquals(50.0, converter.convertToBaseCurrency(50.0, 0));
    }
    @Test
    void shouldReturnOriginalAmountWhenRateIsNegative() {
        assertEquals(50.0, converter.convertToBaseCurrency(50.0, -1.5));
    }
}
