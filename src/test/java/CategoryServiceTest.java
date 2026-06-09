import org.example.CategoryService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CategoryServiceTest {
    private final CategoryService service = new CategoryService();

    @Test
    void shouldDetectTransportCategory() {
        assertEquals("Transport", service.detectCategory("Uber trip to office"));
        assertEquals("Transport", service.detectCategory("Gas station"));
    }
    @Test
    void shouldDetectFoodCategory() {
        assertEquals("Food", service.detectCategory("McDonalds dinner"));
        assertEquals("Food", service.detectCategory("Grocery shopping"));
    }
    @Test
    void shouldReturnOtherWhenDescriptionIsUnknown() {
        assertEquals("Other", service.detectCategory("Cinema tickets"));
    }
    @Test
    void shouldReturnOtherWhenDescriptionIsNull() {
        assertEquals("Other", service.detectCategory(null));
    }
}
