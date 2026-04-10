import java.util.*;

public class UC4 {

    public static void main(String[] args) {

        // Banner
        System.out.println("======================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("======================================\n");

        // Create a LinkedList
        // LinkedList maintains insertion order and allows fast inserts
        List<String> trainConsist = new LinkedList<>();

        // Create a HashSet to ensure uniqueness
        Set<String> uniqueBogies = new HashSet<>();

        // ---- Flow ----
        // 1. User adds bogie IDs
        // 2. System inserts into HashSet (to remove duplicates)
        // 3. Then adds to LinkedList if unique

        String[] inputBogies = {"B6101", "B6102", "B6103", "B6102", "B7001"};

        for (String bogie : inputBogies) {
            if (uniqueBogies.add(bogie)) {   // only true if NOT duplicate
                trainConsist.add(bogie);     // maintain order
            } else {
                System.out.println("Duplicate ignored: " + bogie);
            }
        }

        // Display final ordered consist
        System.out.println("\nFinal Ordered Train Consist:");
        for (String bogie : trainConsist) {
            System.out.println(bogie);
        }
    }
}