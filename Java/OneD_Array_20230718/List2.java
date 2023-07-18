import java.io.*;

public class List2 {
    public static void main(String[] args) throws IOException {
        int[] list1 = new int[10];
        int[] list2 = new int[10];
        int[] list3 = new int[10];

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Input value for list1[" + i + "] = ");
            list1[i] = Integer.parseInt(in.readLine());
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Input value for list2[" + i + "] = ");
            list2[i] = Integer.parseInt(in.readLine());
        }
        
        for (int i = 0; i < 10; i++) {
            list3[i] = list1[i] + list2[i];
        }
        
        System.out.println("\nValues of list1, list2, and list3:");
        
        for (int i = 0; i < 10; i++) {
            System.out.println("list1[" + i + "] = " + list1[i] + ", list2[" + i + "] = " + list2[i] + ", list3[" + i + "] = " + list3[i]);
        }

        int highest = list3[0];
        int lowest = list3[0];
        
        for (int i = 0; i < list3.length; i++) {
            if (list3[i] > highest) {
                highest = list3[i];
            }
            if (list3[i] < lowest) {
                lowest = list3[i];
            }
        }
        
        System.out.println("\nHighest value in list3: " + highest);
        System.out.println("Lowest value in list3: " + lowest);
        
        System.out.print("\nEnter an integer to search in list3: ");
        int searchValue = Integer.parseInt(in.readLine());
        int count = 0;
        String locations = "";

        for (int i = 0; i < list3.length; i++) {
            if (list3[i] == searchValue) {
                count++;
                locations += i + " ";
            }
        }
        
        if (count == 0) {
            System.out.println("The value " + searchValue + " is not found in list3.");
        } else {
            System.out.println("The value " + searchValue + " is found in list3, count: " + count + ", at locations: " + locations);
        }
    }
}

