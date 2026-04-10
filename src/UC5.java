import java.util.*;

public class UC5 {

    public static void main(String[] args) {

        // Banner
        System.out.println("==========================================");
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("==========================================\n");

        // LinkedHashSet preserves order and ensures uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD Bogies ----
        formation.add("B6101");
        formation.add("B6102");
        formation.add("B6103");
        formation.add("B7001");

        // Duplicate entries (ignored but order preserved)
        formation.add("B6102"); // duplicate
        formation.add("B6101"); // duplicate

        // Display final formation
        System.out.println("Train Formation (Ordered & Unique):");
        for (String bogie : formation) {
            System.out.println(bogie);
        }

        // Display total count
        System.out.println("\nTotal Bogies: " + formation.size());
    }
}