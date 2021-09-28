public class TriangleClassify {
    public static String classifyTriangle(int a, int b, int c) {
        if((a == b && a != c) || (a == c && a != b) || (b == c && c != a)){
            return "isosceles triangle";
        }
        return "equilateral triangle";
    }
}
