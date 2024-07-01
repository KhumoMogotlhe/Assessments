import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorrectOrderTest {

    @Test
    void testCorrectOrderWithEmptyList() {
        List<String> names = List.of();
        List<String> expectedOrder = List.of();
        List<String> actualOrder = CorrectOrder.correctOrder(names);
        assertEquals(expectedOrder, actualOrder);
    }

    @Test
    void testCorrectOrderWithSingleName() {
        List<String> names = List.of("Sphamandla");
        List<String> expectedOrder = List.of("Sphamandla");
        List<String> actualOrder = CorrectOrder.correctOrder(names);
        assertEquals(expectedOrder, actualOrder);
    }

    @Test
    void testCorrectOrder() {
        List<String> names = List.of("Khethukuthula", "Jayson", "Chattergoon", "Tshilidzi", "Neo");
        List<String> expectedOrder = List.of("Neo", "Jayson", "Tshilidzi", "Chattergoon", "Khethukuthula");
        List<String> actualOrder = CorrectOrder.correctOrder(names);
        assertEquals(expectedOrder, actualOrder);
    }
}
