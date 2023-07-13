import java.io.*;

public class StepPrinterDoWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        do {
            int start = 0, end = 0, step = 0;

            try {
                System.out.print("Input starting number: ");
                input = in.readLine();
                start = Integer.parseInt(input);

                System.out.print("Input ending number: ");
                input = in.readLine();
                end = Integer.parseInt(input);

                System.out.print("Input step value: ");
                input = in.readLine();
                step = Integer.parseInt(input);
            } catch(NumberFormatException e) {
                System.out.println("Invalid number input! Please try again.");
                continue;
            }

            if(start >= end) {
                System.out.println("Starting number should be lesser than the ending number.");
                continue;
            }

            if(step <= 0) {
                System.out.println("Step should be greater than zero.");
                continue;
            }

            int i = start;
            do {
                if(i > end) {
                    break;
                }
                System.out.println(i);
                i += step;
            } while(true);

            do {
                System.out.println("Do you want to try again(Y/N)?");
                input = in.readLine();
                if(input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.println("Invalid input! Please enter Y or N.");
                }
            } while(true);

        } while(input.equalsIgnoreCase("Y"));
    }
}