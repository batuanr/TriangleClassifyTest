import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifyTest {

    @Test
    void testEquilateralTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expected = "equilateral triangle";
        String result = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
}