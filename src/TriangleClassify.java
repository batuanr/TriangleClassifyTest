public class TriangleClassify {
    public static String classifyTriangle(int a, int b, int c) {
        boolean isEquilateralTriangle = a == b && a == c;
        boolean isIsoscelesTriangle = a == b || b == c || a == c;
        boolean isRegularTriangle = a < b + c && b < a + c && c < a + b;
        if (isRegularTriangle) {
            if (isIsoscelesTriangle) {
                if (isEquilateralTriangle) {
                    return "equilateral triangle";
                }
                else {
                    return "isosceles triangle";
                }
            }
            else {
                return "regular triangle";
            }
        }
        else {
            return "not triangle";
        }
    }
}
