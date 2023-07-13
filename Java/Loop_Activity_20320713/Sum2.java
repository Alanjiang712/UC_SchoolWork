import java.io.*;

public class Sum2 {
    public static void main(String[] args) {
        int start = 0, end = 0, sum;

        String input = "";

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Input starting number: ");
            input = in.readLine();
            start = Integer.parseInt(input);

            System.out.print("Input ending number: ");
            input = in.readLine();
            end = Integer.parseInt(input);
        } catch(IOException e) {
            System.out.println("Error!");
        }

        if(start >= end) {
            System.out.println("Starting number should be lesser than the ending number.");
            System.out.println("Try again.");
            System.exit(0);
        }

        if(start % 2 == 0) {
            start = start + 1;
        }

        sum = 0;

        for(; start <= end; start = start + 2) {
            sum = sum + start;
        }

        System.out.println("Sum=" + sum);
    }
}
