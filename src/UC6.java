import java.util.*;

public class UC6
{

    public static void main(String[] args) {

        // Banner
        System.out.println("======================================");
        System.out.println("UC6 - Map Bogie to Capacity (HashMap)");
        System.out.println("======================================\n");

        // HashMap stores data in key -> value format
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- Insert bogie capacities ----
        capacityMap.put("B6101", 72);
        capacityMap.put("B6102", 80);
        capacityMap.put("B6103", 65);
        capacityMap.put("B7001", 90);

        // Display all bogies with capacity
        System.out.println("Bogie Capacity Details:");
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Get capacity of a specific bogie
        String searchBogie = "B6102";
        System.out.println("\nCapacity of " + searchBogie + ": " + capacityMap.get(searchBogie));

        // Update capacity
        capacityMap.put("B6102", 85);
        System.out.println("Updated Capacity of B6102: " + capacityMap.get("B6102"));

        // Remove a bogie
        capacityMap.remove("B6103");
        System.out.println("\nAfter removing B6103:");
        System.out.println(capacityMap);

        // Total bogies
        System.out.println("\nTotal Bogies: " + capacityMap.size());
    }
}