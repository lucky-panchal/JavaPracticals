public class Practical3 {
    public static int Method1(int a, int b, int c) {
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        return max;
    }
    public static int Method2(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Greatest (Ternary): " + Method1(1,5,7));
        System.out.println("Greatest (If-Else): " + Method2(2,8,3));
    }
}