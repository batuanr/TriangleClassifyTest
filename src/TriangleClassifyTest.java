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
    @Test
    void testIsoscelesTriangle() {
        int a = 2;
        int b = 2;
        int c = 3;
        String expected = "isosceles triangle";
        String result = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
}