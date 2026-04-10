import java.util.*;

public class UC3 {

    public static void main(String[] args) {

        System.out.println("==================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("==================================\n");

        // Create a Set to store unique bogie IDs
        // HashSet stores only unique values
        Set<String> bogies = new HashSet<>();

        // ---- ADD IDs (including duplicates) ----
        // add() inserts bogie IDs into the set

        bogies.add("B6101");
        bogies.add("B6102");
        bogies.add("B6103");
        bogies.add("BG104");

        // Duplicate entries (ignored automatically)
        bogies.add("B0101"); // duplicate (example comment)
        bogies.add("B6102"); // duplicate

        // Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        for (String id : bogies) {
            System.out.println(id);
        }

        // Display total unique count
        System.out.println("\nTotal Unique Bogies: " + bogies.size());
    }
}
