public class TwoParams {
    public static void twoParams(int x, int y) {
        System.out.println("First parameter is " + x);
        System.out.println("Second parameter is " + y);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int a = -2;
        int b = 22;

        twoParams(10, 20);
        twoParams(x + 2, y * 10);
        twoParams(a, b);
    }
}
