public class OneParam {
    public static void oneParam(int x) {
        System.out.println("Number is " + x);
    }

    public static void main(String[] args) {
        int x = 100;
        int y = 150;
        oneParam(x);
        oneParam(y);
        oneParam(x+y);

        // It's a bug
        // oneParam();
    }
}
