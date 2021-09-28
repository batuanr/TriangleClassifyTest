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
    @Test
    void testRegularTriangle() {
        int a = 3;
        int b = 4;
        int c = 5;
        String expected = "regular triangle";
        String result = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void testNotTriangle() {
        int a = 8;
        int b = 2;
        int c = 3;
        String expected = "not triangle";
        String result = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
    @Test
    void testNotTriangle1() {
        int a = -1;
        int b = -5;
        int c = -3;
        String expected = "not triangle";
        String result = TriangleClassify.classifyTriangle(a, b, c);
        assertEquals(expected, result);
    }
}