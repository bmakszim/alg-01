package greedy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CandiesTest {

    @Test
    void sampleTestCase0() {
        var result = Candies.solve(3, List.of(1, 2, 2));
        assertEquals(4, result);
    }

    @Test
    void sampleTestCase1() {
        var result = Candies.solve(10, List.of(2, 4, 2, 6, 1, 7, 8, 9, 2, 1));
        assertEquals(19, result);
    }

    @Test
    void sampleTestCase2() {
        var result = Candies.solve(8, List.of(2, 4, 3, 5, 2, 6, 4, 5));
        assertEquals(12, result);
    }
}