public class PrintHello {
    public static void printHello() {
        System.out.print("HELLO");
    }

    public static void printSpace() {
        System.out.print(" ");
    }

    public static void printWorld() {
        System.out.println("WORLD!");
    }

    public static void allTogetherNow() {
        printHello();
        printSpace();
        printWorld();
    }

    public static void main(String[] args) {
        allTogetherNow();
    }
}
