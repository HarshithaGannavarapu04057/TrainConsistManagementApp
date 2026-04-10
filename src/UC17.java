import java.util.Arrays;

public class UC17 {

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC17 - Sort Bogie Names using Arrays.sort()");
        System.out.println("==========================================\n");

        // Create array of bogie names
        String[] bogieNames = {"Sleeper", "AC Chair", "General", "First Class", "Second Sitting"};

        // Display original order
        System.out.println("Original Bogie Names:");
        for (String name : bogieNames) {
            System.out.print(name + " | ");
        }

        // ---- SORT USING ARRAYS.SORT() ----
        Arrays.sort(bogieNames);

        // Display sorted result
        System.out.println("\n\nSorted Bogie Names (Alphabetical):");
        for (String name : bogieNames) {
            System.out.print(name + " | ");
        }
    }
}