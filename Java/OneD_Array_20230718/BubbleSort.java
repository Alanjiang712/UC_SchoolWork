import java.io.*;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input the size of the list: ");
        int size = Integer.parseInt(in.readLine());

        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Input value for list[" + i + "] = ");
            list[i] = Integer.parseInt(in.readLine());
        }

        // Perform Bubble Sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    // Swap list[j] and list[j + 1]
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        // Display the sorted list
        System.out.print("\nThe sorted list is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
