public class WithReturnValue {
    public static int printSum(int x, int y) {
        int z = x + y;
        return z;
    }

    public static int printDifference(int x, int y) {
        int diff = x - y;
        return diff;
    }

    public static double printProduct(double x, double y) {
        double product = x * y;
        return product;
    }

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Sum=" + printSum(5, 10));
        c = printSum(100, 300);
        System.out.println("c=" + c);
        a = 25;
        b = 75;
        System.out.println("Sum =" + printSum(a, b));
        System.out.println("Sum=" + printSum(a + 2, b - 3));

        int x = 20;
        int y = 7;
        int difference = printDifference(x, y);
        System.out.println("Difference=" + difference);

        double num1 = 3.5;
        double num2 = 2.0;
        double product = printProduct(num1, num2);
        System.out.println("Product=" + product);
    }
}

