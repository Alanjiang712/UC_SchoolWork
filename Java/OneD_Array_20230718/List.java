import java.io.*;

public class List {
    public static void main(String[] args) {
        int[] list = new int[10];
        int num = 0;
        String input = " ";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 10; i++) {
            list[i] = 0;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Input value for list[" + i + "] = ");
            try {
                input = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            num = Integer.parseInt(input);
            list[i] = num;
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println("list[" + i + "] = " + list[i]);
        }
    }
}
