import java.util.*;

public class UC19{

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC19 - Binary Search for Bogie ID");
        System.out.println("==========================================\n");

        // ---- SORTED ARRAY (VERY IMPORTANT) ----
        String[] bogieIds = {"AG205", "B0412", "B0550", "BG101", "DG309"};

        // Search key
        String searchId = "DG309";

        // Display bogies
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ---- BINARY SEARCH LOGIC ----
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = searchId.compareTo(bogieIds[mid]);

            if (result == 0) {
                System.out.println("\n\nBogie ID " + searchId + " FOUND at index " + mid + " ✅");
                found = true;
                break;
            } else if (result > 0) {
                low = mid + 1;   // search right half
            } else {
                high = mid - 1;  // search left half
            }
        }

        // If not found
        if (!found) {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND ❌");
        }
    }
}