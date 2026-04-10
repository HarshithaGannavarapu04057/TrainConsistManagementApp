public class UC18{

    public static void main(String[] args) {

        System.out.println("==========================================");
        System.out.println("UC18 - Linear Search for Bogie ID");
        System.out.println("==========================================\n");

        // Create array of bogie IDs
        String[] bogieIds = {"BG101", "AG205", "DG309", "B0412", "B0550"};

        // Bogie ID to search
        String searchId = "DG309";

        // Display all bogies
        System.out.println("Available Bogie IDs:");
        for (String id : bogieIds) {
            System.out.print(id + " ");
        }

        // ---- LINEAR SEARCH LOGIC ----
        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break; // stop when found
            }
        }

        // Display result
        if (found) {
            System.out.println("\n\nBogie ID " + searchId + " FOUND ✅");
        } else {
            System.out.println("\n\nBogie ID " + searchId + " NOT FOUND ❌");
        }
    }
}